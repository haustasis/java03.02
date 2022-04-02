package nivell1;

public class AgenciaBolsa implements Observer {

    private String bolsa;

    public String getBolsa() {
        return bolsa;
    }

    public void setBolsa(String bolsa) {
        this.bolsa = bolsa;
    }

    @Override
    public void actualizar(String bolsa) {
        setBolsa(bolsa);
    }

}
