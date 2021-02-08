import java.util.ArrayList;

public class Tuba {
    private Double pindala;
    private Double uusPindala;
    private ArrayList<Double> aknadJaUksed = new ArrayList<Double>();

    public Tuba(Double pikkus, Double laius, Double korgus) {
        this.pindala = 2 * korgus * (pikkus + laius);
    }

    public Double getPindala() {
        return pindala;
    }

    public void lisaAkenUks(Double laius, Double korgus) {
        aknadJaUksed.add(new AknadUksed(laius, korgus));
    }

    public void tooPind() {
        Double uusPindala = this.pindala;
        for (AknadUksed temp : aknadJaUksed) {
            this.uusPindala = uusPindala - temp;
        }
    }
}
