public class Studente {
    private String nome;
    private String cognome;
    private int eta;

    public Studente(String nome, String cognome, int eta){
        this.cognome = cognome;
        this.nome = nome;
        this.eta = eta;
    }


    //Getters
    public String getNome(){
        return this.nome;
    }

    public String getCognome(){
        return this.cognome;
    }

    public int getEta(){
        return this.eta;
    }

    //Setters
    public void setNome(String nome){
        this.nome = nome;
    }

    public void setCognome(String cognome){
        this.cognome = cognome;
    }

    public void setEta(int eta){
        this.eta = eta;
    }

    public String presentation(){
        return this.nome + " " + this.cognome + ", " + this.eta + " anni";
    }

}
