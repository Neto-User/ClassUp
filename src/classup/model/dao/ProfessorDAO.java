package classup.model.dao;

import classups.Professor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ProfessorDAO {
    public void cadastrarProfessor(Professor professor) throws SQLException {
        String sql = "INSERT INTO professor (nome, nascimento, sexo, matricula, disciplina, email, senha) VALUES (?, ?, ?, ?, ?, ?, ?)";

        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, professor.getNome());
            stmt.setString(2, professor.getDataNascimento());
            stmt.setString(3, professor.getSexo());
            stmt.setString(4, professor.getMatricula());
            stmt.setString(5, professor.getDisciplina());
            stmt.setString(6, professor.getEmail());
            stmt.setString(7, professor.getSenha());

            stmt.executeUpdate();
        }
    }
}
