/*
autor Gardo Kirsipuu
27.01
Kapseldus, getterid, setterid ja private
 */

public class test {
    public static void main(String[] args) {
        Inimene matti = new Inimene("Matti");
        Inimene john = new Inimene("John");

        matti.setPikkus(180);
        matti.setMass(86);

        john.setPikkus(175);
        john.setMass(64);

        System.out.print(matti.getNimi() + ", kehamassiindeks: ");
        System.out.printf("%5.2f%n", matti.kmi());
        System.out.print(john.getNimi() + ", kehamassiindeks: ");
        System.out.printf("%5.2f%n", john.kmi());
    }
}