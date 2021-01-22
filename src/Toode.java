public class Toode {
    public String nimetus;
    public Double hind;
    public int kogus;

    // konstruktor
    public Toode(String nimetus, Double hind, int kogus) {
        this.nimetus = nimetus;
        this.hind = hind;
        this.kogus = kogus;
    }

    // meetod
    public void valjastaToode(String tooteNimetus, double hindSisestus, int tooteKogus) {
        this.nimetus = tooteNimetus;
        this.hind = hindSisestus;
        this.kogus = tooteKogus;
    }

}
