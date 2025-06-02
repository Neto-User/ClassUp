
package sistema.de.frequencia;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

import java.util.*;
import static javafx.application.Application.launch;

public class SistemaFrequenciaFX extends Application {

    private final List<String> listaAlunos = new ArrayList<>();
    private final List<String> listaAulas = new ArrayList<>();
    private final Map<String, List<String>> presencas = new HashMap<>();

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) {
        TabPane tabPane = new TabPane();

        Tab tabAlunos = new Tab("Alunos", criarAbaAlunos());
        Tab tabAulas = new Tab("Aulas", criarAbaAulas());
        Tab tabPresencas = new Tab("Presenças", criarAbaPresencas());
        Tab tabFrequencia = new Tab("Frequência", criarAbaFrequencia());

        tabPane.getTabs().addAll(tabAlunos, tabAulas, tabPresencas, tabFrequencia);

        stage.setTitle("Sistema de Frequência");
        stage.setScene(new Scene(tabPane, 600, 400));
        stage.show();
    }

    private VBox criarAbaAlunos() {
        VBox layout = new VBox(10);
        layout.setPadding(new Insets(10));

        TextField campoNome = new TextField();
        campoNome.setPromptText("Nome do aluno");

        Button btnAdicionar = new Button("Adicionar Aluno");
        Label status = new Label();

        btnAdicionar.setOnAction(e -> {
            String nome = campoNome.getText().trim();
            if (!nome.isEmpty() && !listaAlunos.contains(nome)) {
                listaAlunos.add(nome);
                presencas.put(nome, new ArrayList<>());
                status.setText("Aluno adicionado: " + nome);
                campoNome.clear();
            } else {
                status.setText("Nome inválido ou duplicado.");
            }
        });

        layout.getChildren().addAll(new Label("Cadastrar Aluno:"), campoNome, btnAdicionar, status);
        return layout;
    }

    private VBox criarAbaAulas() {
        VBox layout = new VBox(10);
        layout.setPadding(new Insets(10));

        TextField campoData = new TextField();
        campoData.setPromptText("Data da aula (ex: 17/05/2025)");

        Button btnAdicionar = new Button("Adicionar Aula");
        Label status = new Label();

        btnAdicionar.setOnAction(e -> {
            String data = campoData.getText().trim();
            if (!data.isEmpty() && !listaAulas.contains(data)) {
                listaAulas.add(data);
                status.setText("Aula adicionada: " + data);
                campoData.clear();
            } else {
                status.setText("Data inválida ou já existe.");
            }
        });

        layout.getChildren().addAll(new Label("Cadastrar Aula:"), campoData, btnAdicionar, status);
        return layout;
    }

    private VBox criarAbaPresencas() {
        VBox layout = new VBox(10);
        layout.setPadding(new Insets(10));

        ComboBox<String> comboAula = new ComboBox<>();
        comboAula.setPromptText("Selecione a aula");

        Button btnCarregar = new Button("Carregar Alunos");
        VBox listaCheckboxes = new VBox(5);

        Button btnSalvar = new Button("Salvar Presenças");
        Label status = new Label();

        btnCarregar.setOnAction(e -> {
            listaCheckboxes.getChildren().clear();
            String data = comboAula.getValue();
            if (data != null) {
                for (String aluno : listaAlunos) {
                    CheckBox check = new CheckBox(aluno);
                    if (presencas.get(aluno).contains(data)) {
                        check.setSelected(true);
                    }
                    listaCheckboxes.getChildren().add(check);
                }
            }
        });

        btnSalvar.setOnAction(e -> {
            String data = comboAula.getValue();
            if (data != null) {
                for (javafx.scene.Node node : listaCheckboxes.getChildren()) {
                    CheckBox check = (CheckBox) node;
                    String nome = check.getText();
                    if (check.isSelected()) {
                        if (!presencas.get(nome).contains(data)) {
                            presencas.get(nome).add(data);
                        }
                    } else {
                        presencas.get(nome).remove(data);
                    }
                }
                status.setText("Presenças salvas para " + data);
            }
        });

        comboAula.setOnMouseClicked(e -> {
            comboAula.getItems().setAll(listaAulas);
        });

        layout.getChildren().addAll(new Label("Selecionar Aula:"), comboAula, btnCarregar, listaCheckboxes, btnSalvar, status);
        return layout;
    }

    private VBox criarAbaFrequencia() {
        VBox layout = new VBox(10);
        layout.setPadding(new Insets(10));

        ComboBox<String> comboAluno = new ComboBox<>();
        comboAluno.setPromptText("Selecione o aluno");
        Label resultado = new Label();

        Button btnVer = new Button("Ver Frequência");

        comboAluno.setOnMouseClicked(e -> {
            comboAluno.getItems().setAll(listaAlunos);
        });

        btnVer.setOnAction(e -> {
            String nome = comboAluno.getValue();
            if (nome != null) {
                int totalAulas = listaAulas.size();
                int presencasAluno = presencas.get(nome).size();
                double frequencia = totalAulas > 0 ? (presencasAluno * 100.0) / totalAulas : 0.0;
                resultado.setText(String.format("Frequência de %s: %.2f%% (%d/%d)", nome, frequencia, presencasAluno, totalAulas));
            }
        });

        layout.getChildren().addAll(comboAluno, btnVer, resultado);
        return layout;
    }
}
 