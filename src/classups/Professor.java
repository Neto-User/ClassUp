package classups;
public class Professor extends Membro {
    
    protected String disciplina;
    protected String email;
    protected String senha;

    public Professor(String nome, String dataNascimento, String sexo, String matricula, String disciplina, String email, String senha, String nivelDeAcesso) {
        super(nome, dataNascimento, sexo, matricula, nivelDeAcesso);
        this.disciplina = disciplina;
        this.email = email;
        this.senha = senha;
    }
    
    // Getters e setters
    
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

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    } 
  
}

