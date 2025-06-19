package classup.model.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import classup.model.dao.ConnectionFactory;

public class PresencaDAO {
    
    public void registrarPresenca(int alunoId) {
        if (existeRegistro(alunoId)) {
            atualizarPresenca(alunoId);
        } else {
            inserirPrimeiraPresenca(alunoId);
        }
    }

    public void registrarAusencia(int alunoId) {
        if (existeRegistro(alunoId)) {
            atualizarAusencia(alunoId);
        } else {
            inserirPrimeiraAusencia(alunoId);
        }
    }

    private boolean existeRegistro(int alunoId) {
        String sql = "SELECT * FROM presenca WHERE aluno_id = ?";
        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, alunoId);
            ResultSet rs = stmt.executeQuery();
            return rs.next(); // se tiver linha, já existe
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    private void inserirPrimeiraPresenca(int alunoId) {
        String sql = "INSERT INTO presenca (aluno_id, presencas, ausencias) VALUES (?, 1, 0)";
        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, alunoId);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void inserirPrimeiraAusencia(int alunoId) {
        String sql = "INSERT INTO presenca (aluno_id, presencas, ausencias) VALUES (?, 0, 1)";
        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, alunoId);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void atualizarPresenca(int alunoId) {
        String sql = "UPDATE presenca SET presencas = presencas + 1 WHERE aluno_id = ?";
        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, alunoId);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void atualizarAusencia(int alunoId) {
        String sql = "UPDATE presenca SET ausencias = ausencias + 1 WHERE aluno_id = ?";
        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, alunoId);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public int contarPresencasPorAluno(int alunoId) {
    int total = 0;
    try (Connection conn = new ConnectionFactory().getConnection()) {
        String sql = "SELECT COUNT(*) FROM presenca WHERE aluno_id = ? AND presencas = 1";
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setInt(1, alunoId);
        ResultSet rs = stmt.executeQuery();
        if (rs.next()) total = rs.getInt(1);
    } catch (Exception e) {
        e.printStackTrace();
    }
    return total;
}

public int contarAusenciasPorAluno(int alunoId) {
    int total = 0;
    try (Connection conn = new ConnectionFactory().getConnection()) {
        String sql = "SELECT COUNT(*) FROM presenca WHERE aluno_id = ? AND ausencias = 1";
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setInt(1, alunoId);
        ResultSet rs = stmt.executeQuery();
        if (rs.next()) total = rs.getInt(1);
    } catch (Exception e) {
        e.printStackTrace();
    }
    return total;
}
    
}
