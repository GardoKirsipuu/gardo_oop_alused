public class Kass extends Loom {
    private String karvavarv;

    public Kass(String nimi, String karvavarv) {
        super(nimi);
        this.karvavarv = karvavarv;
    }

    @Override
    public void haal() {
        super.haal();
        System.out.println("Mjäu Mjäu");
    }

    @Override
    public String toString() {
        return super.toString() + " ja olen " + this.karvavarv;
    }

}
