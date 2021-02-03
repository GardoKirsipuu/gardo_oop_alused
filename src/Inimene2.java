public class Inimene2 {
    private int jk = 0;
    private static int kasutatudJk = 0;
    private int id;

    // konstruktor
    public Inimene2() {
        this.id = Inimene2.kasutatudJk;
        this.jk = this.id;
        this.id = ++Inimene2.kasutatudJk;

    }

    // meetod
    public void info() {
        System.out.println("ID = " + this.id + " jk = " + this.jk);
    }
}
