public class Inimene {
    // atribuutide määramine
    private String nimi;
    private double pikkus;
    private double mass;

    // getterid ja setterid

    public Inimene(String uusNimi) {
        this.nimi = new String(uusNimi);
        this.pikkus = 0;
        this.mass = 0;
    }

    public String getNimi() {
        return nimi;
    }

    public double getPikkus() {
        return pikkus;
    }

    public void setPikkus(int uusPikkus) {
        this.pikkus = uusPikkus / 100.0;
    }

    public double getMass() {
        return mass;
    }

    public void setMass(int uusMass) {
        this.mass = uusMass;
    }

    // meetodid
    public double kmi() {
        return this.mass / (this.pikkus * this.pikkus);
    }

}
