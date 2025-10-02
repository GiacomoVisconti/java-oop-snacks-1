
public class App {
    public static void main(String[] args) throws Exception {

        // ContoBancario giacomoConto = new ContoBancario(1);

        // giacomoConto.deposito(100000F);
        // giacomoConto.prelievo(399.99F);
        // giacomoConto.prelievo(128.56F);
        // giacomoConto.prelievo(128.56F);
        // giacomoConto.prelievo(128.56F);
        // giacomoConto.prelievo(1254F);
        
        
        // System.out.println(giacomoConto.getSaldo());

        Studente studente1 = new Studente("Giacomo", "Visconti", 26);
        Studente studente2 = new Studente("Anna", "F", 26);
        Studente studente3 = new Studente("Nina", "Pippa", 26);

        RegistroStudenti TerzaA = new RegistroStudenti();
        TerzaA.aggiungiStudente(studente1);
        TerzaA.aggiungiStudente(studente2);
        TerzaA.aggiungiStudente(studente3);

        TerzaA.vediRegistro();



        
    }
}
