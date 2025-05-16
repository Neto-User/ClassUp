package classup;
public class Professor
    private String nome;
    private char sexo;
    private String matricula;
    private String disciplina;
    private String email;
    private ColecaoTurma colecaoTurma;

    public Professor(String nome, char sexo, String matricula, String disciplina, String email) {
        this.nome = nome;
        this.sexo = sexo;
        this.matricula = matricula;
        this.disciplina = disciplina;
        this.email = email;
        this.colecaoTurma = new ColecaoTurma();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
     public void adicionarTurma(Turma turma) {
        this.colecaoTurma.adicionarTurma(turma);
    }

    public void removerTurma(Turma turma) {
        this.colecaoTurma.removerTurma(turma);
    }

    public ColecaoTurma getTurmas() {
        return this.colecaoTurma;
    }
    
    
}
