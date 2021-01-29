/*
autor Gardo Kirsipuu
27.01
Kapseldus, getterid, setterid ja private
 */

public class test {
    public static void main(String[] args) {
        Inimene matti = new Inimene("Matti");

        matti.setPikkus(180);
        matti.setMass(110);

        System.out.print(matti.getNimi() + ", kehamassiindeks: ");
        System.out.printf("%5.2f%n", matti.kmi());
        System.out.println("Matti kaal on: " + matti.getMass());

        matti.nomraalKaal();

        System.out.print(matti.getMass() + "KG | ");
        System.out.printf("%.2f%n", matti.kmi());

    }
}