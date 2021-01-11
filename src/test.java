/*
 * autor - Gardo Kirsipuu
 * ülesanne 2.3b
 * */

/*
 * massiivid
 * autor Gardo Kirsipuu
 * ülesanne 5.3
 */

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        // massiiv faili sisu hoidmiseks
        ArrayList<Double> palk = new ArrayList<>();
        // määrame fail ja kontrollime, kas on võiamlik lugeda andmed
        File fail = new File("C:\\Users\\gardo\\IdeaProjects\\oop_alused\\src\\konto.txt");
        Scanner sisendFailist = null;
        try {
            sisendFailist = new Scanner(fail);
        } catch (Exception e) {
            System.out.println("Faili pole - " + e.getMessage());
        }
        // loeme failist
        while (sisendFailist.hasNextLine()) {
            Double rida = sisendFailist.nextDouble();
            palk.add(rida); // lisame loetud väärtus nimekirja sisse
        }
        sisendFailist.close();
        // vaatame nimekirja sisu
        for (int i = 0; i < palk.size(); i++) {
            if (palk.get(i) > 0.0) {
                System.out.println(palk.get(i));
            }
        }

    }
}