package classup;
public class Turma {
    private String nome;
    private String disciplina;
    private String professor;
    private ColecaoAlunos colecaoAlunos;
    private int codigo;
    private String email;
    

    public Turma(String nome, String disciplina, String professor, String email, int codigo) {
        this.nome = nome;
        this.disciplina = disciplina;
        this.professor = professor;
        this.colecaoAlunos = new ColecaoAlunos();
        this.codigo = codigo;
        this.email = email;
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
   
    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
      // if (email == null return //
    }
}
