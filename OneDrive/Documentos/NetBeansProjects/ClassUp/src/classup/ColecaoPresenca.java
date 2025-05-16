
package classup;
import java.util.ArrayList;
public class ColecaoPresenca {
    private ArrayList<Presenca> presencas;

    public ColecaoPresenca() {
        this.presencas = new ArrayList<>();
    }
    
    public void adicionarPresenca(Presenca presenca) {
        this.presencas.add(presenca);
    }
    
    public void removerPresenca(Presenca presenca) {
        this.presencas.remove(presenca);
    }

    public ArrayList<Presenca> getPresencas() {
        return presencas;

}
}