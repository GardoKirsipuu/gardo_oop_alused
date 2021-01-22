public class KahanevLoendur {
    private int vaartus;   // objekti muutuja (atribuut), mis hoiab meeles loenduri väärtust

    public KahanevLoendur(int vaartusAlguses) {
        this.vaartus = vaartusAlguses;
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

}