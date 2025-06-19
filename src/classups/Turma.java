package classups;
public class Turma {
    private String nome;
    private String disciplina;
    private ColecaoAlunos colecaoAlunos;

    public Turma(String nome, String disciplina) {
        this.nome = nome;
        this.disciplina = disciplina;
        this.colecaoAlunos = new ColecaoAlunos();
    }

    // Getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public void adicionarAluno(Aluno aluno) {
        this.colecaoAlunos.adicionarAluno(aluno);
    }

    public void removerAluno(Aluno aluno) {
        this.colecaoAlunos.removerAluno(aluno);
    }

    public ColecaoAlunos getAlunos() {
        return this.colecaoAlunos;
    }
}
 
    
