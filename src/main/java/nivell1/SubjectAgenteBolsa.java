package nivell1;

import java.util.ArrayList;

public class SubjectAgenteBolsa {

    private ArrayList<AgenciaBolsa> agencias = new ArrayList<>();

    public void anadirObserver(AgenciaBolsa agencia) {
        agencias.add(agencia);
    }

    public void notificarObservers(String bolsa) {
        for(AgenciaBolsa agencia: agencias) {
            agencia.actualizar(bolsa);
        }
    }

}
