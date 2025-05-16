package classup;
import java.util.ArrayList;
public class ColecaoNotas {
    private ArrayList<Double> notas;
    
    public ColecaoNotas() {
        this.notas = new ArrayList<>();
    }
    
    public void adicionarNota(double nota) {
        this.notas.add(nota);
    }

    public ArrayList<Double> getNotas() {
        return notas;
    }
}
