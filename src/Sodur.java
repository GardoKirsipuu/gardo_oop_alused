public class Sodur extends Inimene2 {
    private int armeeNr;

    public Sodur(int armeeNr) {
        this.armeeNr = armeeNr;
    }

    @Override
    public void info() {
        super.info();
        System.out.println("Armee number = " + this.armeeNr);
    }
}
