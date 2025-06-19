package classups;
public class Constante {
    public enum nivelAcesso {
        ADMINISTRADOR("ADMIN"),
        PROFESSOR("PROFESSOR"),
        ALUNO("ALUNO");
        
        private String valor;
        
        nivelAcesso(String valor) {
            this.valor = valor;
        }
        
        public String getValor() {
            return valor;
        }
    }
}
