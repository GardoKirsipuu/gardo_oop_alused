public class KahanevLoendur {
    private int vaartus;   // objekti muutuja (atribuut), mis hoiab meeles loenduri väärtust
    private int algVaartus;

    public KahanevLoendur(int vaartusAlguses) {
        this.algVaartus = vaartusAlguses;
        this.vaartus = algVaartus;
    }

    public void valjastaVaartus() {
        System.out.println("väärtus: " + this.vaartus);
    }

    public void kahane() {
        // kirjuta siia kood, mille abil loenduri vaartus väheneb 1 võrra
        if (vaartus > 0) {
            this.vaartus--;
        } else {
            ;
        }
    }

    // ja siia ülejäänud vajalikud meetodid
    public void reset() {
        this.vaartus = 0;
    }

    public void algvaartusta() {
        this.vaartus = algVaartus;
    }

}