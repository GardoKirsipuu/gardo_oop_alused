import java.util.ArrayList;

public class Opilane {
    ArrayList<String> teadmised = new ArrayList<>();
    private String nimi;

    // konstruktor
    public Opilane(String nimi) {
        this.nimi = nimi;
    }

    // getter
    public String getNimi() {
        return nimi;
    }

    // lisab õpilaste teadmistesse uue teema - õpib iseseisvalt
    public void opib(String teema) {
        teadmised.add(teema);
    }

    // tagastab õpilase teadmiste listi
    public ArrayList<String> getTeadmised() {
        return teadmised;
    }

    // unustab teema - eemaldame teadmiste listist
    public void unusta(String teema) {
        teadmised.remove(teema);
    }
}
