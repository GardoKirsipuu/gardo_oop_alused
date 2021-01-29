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

    public void suurendaKaal() {
        this.mass++;
    }

    public void suurendaKaal(double kg) {
        this.mass += kg;
    }

    public void vahendaKaal() {
        this.mass--;
    }

    public void nomraalKaal() {
        // kui kmi on 19-24,9 - see on norm
        // kui kmi on alla 19, tuleb inimese kaalu suurendada
        // iga kord 1 kg juurde ja kontrollida
        if (this.kmi() >= 19.0 && this.kmi() <= 24.9) {
            System.out.println("Kaal on normis");
        } else {
            while (this.kmi() < 19.0) {
                this.suurendaKaal();
            }
            while (this.kmi() > 24.9) {
                this.vahendaKaal();
            }
        }
    }

}
