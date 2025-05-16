package classup;
public class Turma1 { 
    private int codigo;
    private String email;
    private String colecaoTurma;

    public Professor(int codigo, String colecaoTurma, String email) {
        this.codigo = codigo;
        this.email = email;
        this.colecaoTurma = new ColecaoTurma();
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
