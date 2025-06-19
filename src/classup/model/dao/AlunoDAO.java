package classup.model.dao;
    import classups.Aluno;
    import java.sql.Connection;
    import java.sql.PreparedStatement;
    import java.sql.SQLException;
    import classup.model.dao.ConnectionFactory;
    import javax.swing.JOptionPane;

public class AlunoDAO {
    
    public void cadastrarAluno(Aluno aluno) throws SQLException {
        String sql = "INSERT INTO aluno (nome, data_nascimento, sex, matricula) VALUES (?, ?, ?, ?)";
    
        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            
            stmt.setString(1, aluno.getNome());
            stmt.setString(2, aluno.getDataNascimento());
            stmt.setString(3, aluno.getSexo());
            stmt.setString(4, aluno.getMatricula());

            
            stmt.executeUpdate();
            
        }
    }
    
}
