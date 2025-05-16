package classup;
import java.util.ArrayList;
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
    
    
}
