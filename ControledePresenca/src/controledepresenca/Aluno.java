
package controledepresenca;

import java.time.LocalDate;
import java.util.ArrayList;

public class Aluno {
    private String nome;
    private ArrayList<LocalDate> datasPresenca;

    public Aluno(String nome) {
        this.nome = nome;
        this.datasPresenca = new ArrayList<>();
    }

    public void registrarPresenca() {
        LocalDate data = LocalDate.now();
        if (!datasPresenca.contains(data)) {
            datasPresenca.add(data);
        }
    }

    public String getNome() {
        return nome;
    }

    public int getPresencas() {
        return datasPresenca.size();
    }

    public ArrayList<LocalDate> getDatasPresenca() {
        return datasPresenca;
    }
}
