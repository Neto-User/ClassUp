package classups;

/**
 *
 * @author n3to
 */
abstract public class Membro {
    protected String nome;
    protected String dataNascimento;
    protected String sexo;
    protected String matricula;
    protected String nivelDeAcesso;

    public Membro(String nome, String dataNascimento, String sexo, String matricula, String nivelDeAcesso) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.sexo = sexo;
        this.matricula = matricula;
        this.nivelDeAcesso = nivelDeAcesso;
    }

   
    
        // Construtor da classe Aluno
    public Membro(String nome, String dataNascimento, String sexo, String matricula) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.matricula = matricula;
        this.sexo = sexo;
    }
    
    public Membro() {
        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNivelDeAcesso() {
        return nivelDeAcesso;
    }

    public void setNivelDeAcesso(String nivelDeAcesso) {
        this.nivelDeAcesso = nivelDeAcesso;
    }
    
    
    


    
}
