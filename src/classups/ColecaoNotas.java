package classups;
import java.util.ArrayList;
public class ColecaoNotas {
    private ArrayList<Double> notas;
    private String descricao;
    private double valorNotas;
     
   
    public ColecaoNotas() {
        this.notas = new ArrayList<>();
    }
    
    public void adicionarNota(double nota) {
        this.notas.add(nota);
    }

    public ArrayList<Double> getNotas() {
        return notas;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValorNotas() {
        return valorNotas;
    }

    public void setValorNotas(double valorNotas) {
        this.valorNotas = valorNotas;
    }
    
    
    
}
