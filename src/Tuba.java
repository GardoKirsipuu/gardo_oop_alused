import java.util.ArrayList;

public class Tuba {
    private Double pindala;
    private Double uusPindala;
    private ArrayList<AknadUksed> aknadJaUksed = new ArrayList<AknadUksed>();

    public Tuba(Double pikkus, Double laius, Double korgus) {
        this.pindala = 2 * korgus * (pikkus + laius);
    }

    public Double getPindala() {
        return pindala;
    }

    public void lisaAkenUks(Double laius, Double korgus) {
        aknadJaUksed.add(new AknadUksed(laius, korgus));
    }

    public Double tooPind() {
        Double uusPindala = this.pindala;
        for (int i = 0; i < aknadJaUksed.size(); i++) {
            this.uusPindala = uusPindala - aknadJaUksed.get(i));
        }
        return uusPindala;
    }
}
