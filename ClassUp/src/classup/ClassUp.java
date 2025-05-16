package classup;
public class Turma {
    private String nome;
    private String disciplina;
    private String professor;
    private ColecaoAlunos colecaoAlunos;
    

    public Turma(String nome, String disciplina, String professor) {
        this.nome = nome;
        this.disciplina = disciplina;
        this.professor = professor;
        this.colecaoAlunos = new ColecaoAlunos();
    }

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

    public String getProfessor() {
        return professor;
    }

    public void setProfessor(String professor) {
        this.professor = professor;
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