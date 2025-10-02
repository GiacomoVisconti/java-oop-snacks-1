public class RegistroStudenti {
    private Studente[] studenti;

    RegistroStudenti(){
        this.studenti = new Studente[30];
    }

    public void aggiungiStudente(Studente nuovoStudente){
        for (int i = 0; i < studenti.length; i++) {
            if (studenti[i] == null) {
                studenti[i] = nuovoStudente;
                return;
            }
        }
    }

    public void vediRegistro(){
        System.out.println("--- LISTA STUDENTI ---");
        
        for (int i = 0; i < studenti.length; i++) {
            if (studenti[i] != null) {  
                System.out.println(studenti[i].presentation());
            }
        }
    }
    
}
