import javax.swing.*;
import java.awt.*;
public class NewClass extends JFrame {
    private JComboBox<String> materiasCombo;
    private JTextField[] notasFields = new JTextField[4];
    private JLabel mediaLabel, statusLabel;

    public NewClass() {
        setTitle("Sistema de Notas");
        setSize(500, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Painel principal
        JPanel painelPrincipal = new JPanel();
        painelPrincipal.setBackground(new Color(20, 30, 60));
        painelPrincipal.setBorder(BorderFactory.createEmptyBorder(20, 30, 20, 30));
        painelPrincipal.setLayout(new BoxLayout(painelPrincipal, BoxLayout.Y_AXIS));

        Font fonte = new Font("Arial", Font.BOLD, 14);
        Color corTexto = Color.WHITE;

        // Nome e Matrícula
        painelPrincipal.add(criarLinha("Nome do Aluno:", criarCampoTexto(), fonte, corTexto));
        painelPrincipal.add(Box.createRigidArea(new Dimension(0, 15)));

        painelPrincipal.add(criarLinha("Matrícula:", criarCampoTexto(), fonte, corTexto));
        painelPrincipal.add(Box.createRigidArea(new Dimension(0, 15)));

        // Matéria
        String[] materias = {"Matemática", "História", "Português", "Geografia", "Ciências"};
        materiasCombo = new JComboBox<>(materias);
        materiasCombo.setFont(fonte);
        materiasCombo.setBackground(new Color(50, 60, 100));
        materiasCombo.setForeground(corTexto);

        painelPrincipal.add(criarLinha("Matéria:", materiasCombo, fonte, corTexto));
        painelPrincipal.add(Box.createRigidArea(new Dimension(0, 20)));

        // Notas dos semestres
        for (int i = 0; i < 4; i++) {
            notasFields[i] = criarCampoTexto();
            painelPrincipal.add(criarLinha((i + 1) + "º Semestre:", notasFields[i], fonte, corTexto));
            painelPrincipal.add(Box.createRigidArea(new Dimension(0, 10)));
        }

        // Botão Calcular
        JButton calcularButton = new JButton("Calcular");
        calcularButton.setFont(fonte);
        calcularButton.setBackground(new Color(80, 50, 200));
        calcularButton.setForeground(Color.WHITE);
        calcularButton.setFocusPainted(false);
        calcularButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

        painelPrincipal.add(Box.createRigidArea(new Dimension(0, 20)));
        painelPrincipal.add(calcularButton);
        painelPrincipal.add(Box.createRigidArea(new Dimension(0, 20)));

        // Labels resultado
        mediaLabel = criarLabel("MÉDIA: ", fonte, corTexto);
        statusLabel = criarLabel("ALUNO APROVADO?", fonte, corTexto);
        painelPrincipal.add(mediaLabel);
        painelPrincipal.add(Box.createRigidArea(new Dimension(0, 10)));
        painelPrincipal.add(statusLabel);

        calcularButton.addActionListener(e -> calcularMedia());

        add(painelPrincipal);
    }

    private JPanel criarLinha(String texto, JComponent campo, Font fonte, Color corTexto) {
        JPanel linha = new JPanel();
        linha.setLayout(new BoxLayout(linha, BoxLayout.X_AXIS));
        linha.setBackground(new Color(20, 30, 60));

        JLabel label = criarLabel(texto, fonte, corTexto);
        label.setPreferredSize(new Dimension(120, 30));

        linha.add(label);
        linha.add(Box.createRigidArea(new Dimension(10, 0)));
        linha.add(campo);

        return linha;
    }

    private JTextField criarCampoTexto() {
        JTextField campo = new JTextField(15);
        campo.setMaximumSize(new Dimension(Integer.MAX_VALUE, 30));
        campo.setBackground(new Color(50, 60, 100));
        campo.setForeground(Color.WHITE);
        campo.setCaretColor(Color.WHITE);
        campo.setBorder(BorderFactory.createCompoundBorder(
            BorderFactory.createLineBorder(new Color(80, 50, 200), 2),
            BorderFactory.createEmptyBorder(5, 10, 5, 10)
        ));
        return campo;
    }

    private JLabel criarLabel(String texto, Font fonte, Color cor) {
        JLabel label = new JLabel(texto);
        label.setFont(fonte);
        label.setForeground(cor);
        return label;
    }

    private void calcularMedia() {
        double soma = 0;
        boolean erro = false;

        for (int i = 0; i < 4; i++) {
            try {
                double nota = Double.parseDouble(notasFields[i].getText());
                if (nota < 0 || nota > 100) {
                    JOptionPane.showMessageDialog(this, "Notas devem ser entre 0 e 100.");
                    erro = true;
                    break;
                }
                soma += nota;
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Por favor, insira todas as notas corretamente.");
                erro = true;
                break;
            }
        }

        if (!erro) {
            double media = soma / 4;
            mediaLabel.setText("MÉDIA: " + String.format("%.2f", media));

            if (media >= 70) {
                statusLabel.setText("Aluno Aprovado");
                statusLabel.setForeground(new Color(50, 200, 50));
            } else {
                statusLabel.setText("Aluno Reprovado");
                statusLabel.setForeground(new Color(200, 50, 50));
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new NewClass().setVisible(true));
    }
}
