package classups;
class Presenca {
    private boolean presente;
    private String data;

    public Presenca(boolean presente, String data) {
        this.presente = presente;
        this.data = data;
    }
    
    public boolean isPresente() {
        return presente;
    }

    public void setPresente(boolean presente) {
        this.presente = presente;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
   
    
    

