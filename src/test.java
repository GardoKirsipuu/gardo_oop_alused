public class test {
    public static void main(String[] args) {
        KahanevLoendur loendur = new KahanevLoendur(10);

        loendur.valjastaVaartus();

        loendur.kahane();
        loendur.valjastaVaartus();

        loendur.kahane();
        loendur.valjastaVaartus();
    }
}