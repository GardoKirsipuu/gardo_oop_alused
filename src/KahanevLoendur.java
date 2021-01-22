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
        this.vaartus--;
    }

    // ja siia ülejäänud vajalikud meetodid

}