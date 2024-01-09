package it.epicode.be.motore;

public class BloccoMotore {
    //Attributo o stato
    private int cilindrata;

    //Costruttore
    public BloccoMotore (int cilindrata) {
        this.cilindrata = cilindrata;
    }

    //Getters
    public int getCilindrata() {
        return cilindrata;
    }

    //Setters
    public void setCilindrata(int cilindrata) {
        this.cilindrata = cilindrata;
    }
}
