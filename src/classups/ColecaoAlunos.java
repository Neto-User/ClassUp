package classups;

import classups.Aluno;
import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import classup.model.dao.ConnectionFactory;
import java.sql.SQLException;


public class ColecaoAlunos {
    private ArrayList<Aluno> alunos;
    
    public ColecaoAlunos() {
        this.alunos = new ArrayList<>();
    }
    
    public void adicionarAluno(Aluno aluno) {
        this.alunos.add(aluno);
    }
    
    public void removerAluno(Aluno aluno) {
        this.alunos.remove(aluno);
    }

    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }
    
    public List<Aluno> buscarTodosAlunos() throws SQLException {
        List<Aluno> alunos = new ArrayList<>();
        
        try (Connection conn = new ConnectionFactory().getConnection()) {
            String sql = "SELECT * FROM aluno";
            PreparedStatement stmt = conn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
                    
            while(rs.next()) {
                Aluno aluno = new Aluno(
                rs.getInt("id"),
                rs.getString("nome"),
                rs.getString("data_nascimento"),
                rs.getString("sex"),
                rs.getString("matricula"));
                
                alunos.add(aluno);
                        
            }
            
        } 
        return alunos;
    }
    
    
}
