package classup.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;
import classup.model.dao.ConnectionFactory;

public class UsuarioDAO {
    
    public boolean autenticar(String email, String senha) {
        String sql = "SELECT * FROM professor WHERE email = ? AND senha = ?";

        try (Connection conn = new ConnectionFactory().getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, email);
            stmt.setString(2, senha);

            ResultSet rs = stmt.executeQuery();
            return rs.next();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao autenticar: " + e.getMessage());
            return false;
        }
    }
    
}

