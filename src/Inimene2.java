public class Inimene2 {
    private int jk = 0;
    private int id;

    // konstruktor
    public Inimene2() {
        this.id = ++this.jk;
        this.setJk(this.id);
        System.out.println(id);
        System.out.println(jk);
    }

    public int getJk() {
        return jk;
    }

    public void setJk(int jk) {
        this.jk = jk;
    }
    // meetod

}
