package classups;

public class Aluno extends Membro {
    private ColecaoNotas notas;
    private ColecaoPresenca presencas;
    private boolean nota;
    private String descricaoNote;
    private int id;

    
    public Aluno(ColecaoNotas notas, ColecaoPresenca presencas, boolean nota, String descricaoNote, String nome, String dataNascimento, String sexo, String matricula, int id) {
        super(nome, dataNascimento, sexo, matricula);
        this.notas = notas;
        this.presencas = presencas;
        this.nota = nota;
        this.descricaoNote = descricaoNote;
        this.id = id;
    }

    public Aluno(boolean nota, String descricaoNote, String nome, String dataNascimento, String sexo, String matricula) {
        super(nome, dataNascimento, sexo, matricula);
        this.nota = nota;
        this.descricaoNote = descricaoNote;
    }

    public Aluno(String nome, String dataNascimento, String sexo, String matricula) {
        super(nome, dataNascimento, sexo, matricula);
    }

    public Aluno(int id, String nome, String dataNascimento, String sexo, String matricula) {
        super(nome, dataNascimento, sexo, matricula);
        this.id = id;
    }
    
    

    public Aluno() {
        
    }
    

    public void adicionarNota(double nota) {
        this.notas.adicionarNota(nota);
    }

    public ColecaoNotas getNotas() {
        return notas;
    }

    public void adicionarPresenca(Presenca presenca) {
        this.presencas.adicionarPresenca(presenca);
    }

    public void removerPresenca(Presenca presenca) {
        this.presencas.removerPresenca(presenca);
    }

    public ColecaoPresenca getPresencas() {
        return presencas;
    }

    public boolean isNota() {
        return nota;
    }

    public void setNota(boolean nota) {
        this.nota = nota;
    }

    public String getDescricaoNote() {
        return descricaoNote;
    }

    public void setDescricaoNote(String descricaoNote) {
        this.descricaoNote = descricaoNote;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
   
    
    
    
}
