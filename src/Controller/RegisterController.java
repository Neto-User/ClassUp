package Controller;

import classup.View.Register;
import classups.Professor;
import classup.View.Login;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;
import classup.model.dao.ProfessorDAO;
/**
 *
 * @author n3to
 */
public class RegisterController {

   private final Register view;

    public RegisterController(Register view) {
        this.view = view;
    
   
    // Adicionando ação ao clicar no botão cadastrar
    this.view.getjB_Cadastrar().addActionListener((ActionEvent e) -> {
        cadastrarProfessor();
        });
    }
    
    private void cadastrarProfessor() {
        String nome = view.getjTextName1().getText();
        
        String dataNascimento = view.getjFormattedTextField1().getText();
        
        String sexo = view.getComboSexo().getSelectedItem().toString();
        
        String disciplina = view.getjTextDisciplina().getText();
        
        String matricula = view.getjTextMatricula().getText();
        
        String email = view.getjTextEmail().getText();
        
        String senha = new String(view.getjTextSenha().getPassword());
        
        
        // local do DB
        try {
            if (nome.isEmpty() || dataNascimento == null || sexo.isEmpty() || matricula.isEmpty() || disciplina.isEmpty() || email.isEmpty() || senha.isEmpty()) {
                JOptionPane.showMessageDialog(view, "Preencha todos os campos obrigatórios");
                return;
            }
            
        Professor professor = new Professor(nome, dataNascimento, sexo, matricula, disciplina, email, senha, senha);
        
            ProfessorDAO dao = new ProfessorDAO();
            dao.cadastrarProfessor(professor);
            
        JOptionPane.showMessageDialog(view, "Professor Cadastrado com sucesso!");
        limparCampos();
        view.dispose(); // fecha a tela de cadastro e abre a de Login
        new Login().setVisible(true);
        
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(view, "Erro ao cadastrar professor: " + ex.getMessage());
            ex.printStackTrace();
        }
    }
    
    private void limparCampos() {
        view.getjTextName1().setText("");
        view.getjFormattedTextField1().setText("");
        view.getComboSexo().setSelectedIndex(0);
        view.getjTextMatricula().setText("");
        view.getjTextDisciplina().setText("");
        view.getjTextEmail().setText("");
        view.getjTextSenha().setText("");
    }
    
}
