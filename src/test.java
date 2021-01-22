public class test {
    public static void main(String[] args) {
        KahanevLoendur loendur = new KahanevLoendur(100);

        loendur.valjastaVaartus();

        loendur.reset();
        loendur.valjastaVaartus();
        ;

        loendur.kahane();
        loendur.valjastaVaartus();

    }
}