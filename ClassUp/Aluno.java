package classup;
import java.util.Date;

public class Aluno {
    private String nome;          //  Atributos Caracteristicas
    private Date dataNascimento;
    private char sexo;
    private String matricula;
    private int presenca;
    private double notas;
    private ColecaoPresenca colecaoPresencas;
    private ColecaoNotas colecaoNotas;

    // Construtor (O que eu preciso para criar um aluno)

    public Aluno(String nome, Date dataNascimento, char sexo, String matricula, int presenca, double notas) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.sexo = sexo;
        this.matricula = matricula;
        this.presenca = presenca;
        this.notas = notas;
        this.colecaoPresencas = new ColecaoPresenca();
        this.colecaoNotas = new ColecaoNotas();
    }
    

    // 2° Construtor (Pelo menos isso é necessário ao cadastrar aluno)

    public Aluno(String nome, Date dataNascimento, char sexo, String matricula) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.sexo = sexo;
        this.matricula = matricula;
    }

    // Acessos que realizamos de fora da Classe com getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
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

    public int getPresenca() {
        return presenca;
    }

    public void setPresenca(int presenca) {
        this.presenca = presenca;
    }

    public double getNotas() {
        return notas;
    }

    public void setNotas(double notas) {
        this.notas = notas;
    } 
    
    public void adicionarPresenca(Presenca presenca){
        this.colecaoPresencas.adicionarPresenca(presenca);
    }
    
    public void removerPresenca(Presenca presenca) {
        this.colecaoPresencas.removerPresenca(presenca);
    }

    public ColecaoPresenca getColecaoPresencas() {
        return colecaoPresencas;
    }
    
    public void adicionarNota(double nota) {
        this.colecaoNotas.adicionarNota(nota);
    }

    public ColecaoNotas getColecaoNotas() {
        return colecaoNotas;
    }
}
