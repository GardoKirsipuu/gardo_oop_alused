/*
autor Gardo Kirsipuu
01.02
ülesanne 4
 */

public class test {
    public static void main(String[] args) {
        Auto auto1 = new Auto();
        auto1.km = 100;

        Auto auto2 = new Auto();
        auto2.km = 85;

        System.out.println("Auto1 läbitud teekond = " + auto1.km);
        System.out.println("Auto2 läbitud teekond = " + auto2.km);

        System.out.println(Auto.km);

    }
}