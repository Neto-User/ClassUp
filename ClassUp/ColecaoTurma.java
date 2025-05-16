package classup;
import java.util.ArrayList;
public class ColecaoTurma {
    private ArrayList<Turma> turmas;
    
    public ColecaoTurma(){
        this.turmas = new ArrayList<>();
    }
    
    public ColecaoTurma(ArrayList<Turma> turma) {
        this.turmas = new ArrayList(turma);
    }
    
    public void adicionarTurma(Turma turma) {
        this.turmas.add(turma);
    }
    
    public void removerTurma(Turma turma) {
        this.turmas.remove(turma);
    }

    public ArrayList<Turma> getTurmas() {
        return turmas;
    }
    
    
}
