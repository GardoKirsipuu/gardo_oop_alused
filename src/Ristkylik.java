public class Ristkylik {

    private Double laius;
    private Double korgus;

    public Double getLaius() {
        return laius;
    }

    public void setLaius(Double uusLaius) {
        this.laius = this.vaartuseKontroll(uusLaius);
    }

    public Double getKorgus() {
        return korgus;
    }

    public void setKorgus(Double uusKorgus) {
        this.korgus = this.vaartuseKontroll(uusKorgus);
    }

    private Double vaartuseKontroll(Double vaartus) {
        if (vaartus < 0.0) {
            return Math.abs(vaartus);
        }
        return vaartus;
    }

    @Override
    public String toString() {
        return "Ristkylik: " + this.laius + " x " + this.korgus;
    }
}
