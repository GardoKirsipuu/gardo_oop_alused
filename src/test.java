/*
autor Gardo Kirsipuu
05.02
ülesanne
 */

import java.util.ArrayList;

public class test {
    public static void main(String[] args) {
        Restoran resto1 = new Restoran("resto1", "nuudlid");
        Restoran resto2 = new Restoran("resto2", "pasta");
        Restoran resto3 = new Restoran("resto3", "pitsa");

        resto1.avaRestoran();
        resto1.teenindatudKylalisedPaevas(24);

        resto2.avaRestoran();
        resto2.teenindatudKylalisedPaevas(43);

        resto3.avaRestoran();

        resto1.teenindatudKylalisedPaevas(44);

        JaatiseKiosk jaatis1 = new JaatiseKiosk("Premia", "jaatis");
        jaatis1.jaatiseLisamine("Maasika jäätis");
        jaatis1.jaatiseLisamine("Sokolaadi jäätis");
        jaatis1.jaatiseLisamine("Vanilje jäätis");

        System.out.println(jaatis1.toString());

    }
}