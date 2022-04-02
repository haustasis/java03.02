package nivell1;

public class Main {

    public static void main(String[] args) {

        SubjectAgenteBolsa subject1 = new SubjectAgenteBolsa();
        AgenciaBolsa bestinver = new AgenciaBolsa();
        AgenciaBolsa renta4 = new AgenciaBolsa();

        subject1.anadirObserver(bestinver);
        subject1.anadirObserver(renta4);

        subject1.notificarObservers("Sube la bolsa un 4% por el fin invasion Ucrania.");

        System.out.println("[+] *Bestinver* ha sido notificada que: " + bestinver.getBolsa());
        System.out.println("[+] *Renta4* ha sido notificada que: " + renta4.getBolsa());

    }

}
