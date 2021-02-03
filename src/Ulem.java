public class Ulem extends Sodur {
    private int tase = 1;

    public Ulem(int armeeNr) {
        super(armeeNr);
    }

    public void info() {
        System.out.println(this.tase);
    }

    public void tostaTase() {
        this.tase++;
    }
}
