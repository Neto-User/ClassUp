package classup.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import classup.model.dao.ConnectionFactory;
import classups.ColecaoNotas;
import java.sql.ResultSet;

public class NotaDAO {
    
    public void salvarNota(String descricaoNota, double valorNota, int alunoId) {
        
        String sql = "INSERT INTO nota (descricao_nota, valor_nota, aluno_id) VALUES (?, ?, ?)";
        
        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            
            stmt.setString(1, descricaoNota);
            stmt.setDouble(2, valorNota);
            stmt.setInt(3, alunoId);
            
            stmt.executeUpdate();
            
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Erro ao Salvar nota @*!!");
        }
    }
    
    public ColecaoNotas buscarNotaPorAlunoId(int alunoId) {
    ColecaoNotas nota = null;
    try (Connection conn = new ConnectionFactory().getConnection()) {
        String sql = "SELECT * FROM nota WHERE aluno_id = ?";
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setInt(1, alunoId);
        ResultSet rs = stmt.executeQuery();
        
        if (rs.next()) {
            nota = new ColecaoNotas();
            nota.setDescricao(rs.getString("descricao_nota"));
            nota.setValorNotas(rs.getDouble("valor_nota"));
        }
    } catch (Exception e) {
        e.printStackTrace();
    }
    return nota;
}
    
}
