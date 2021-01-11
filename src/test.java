/*
 * autor - Gardo Kirsipuu
 * ülesanne 2.3b
 * */

/*
 * massiivid
 * autor Gardo Kirsipuu
 * ülesanne 5.4a
 */

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        // massiiv faili sisu hoidmiseks
        ArrayList<String> palk = new ArrayList<>();
        ArrayList<String> laulud = new ArrayList<>();
        // faili nime küsimine
        Scanner sisend = new Scanner(System.in);
        System.out.println("Sisestage faili nimi: ");
        String failiNimi = sisend.nextLine();
        // määrame fail ja kontrollime, kas on võiamlik lugeda andmed
        File fail = new File("C:\\Users\\gardo\\IdeaProjects\\oop_alused\\src\\" + failiNimi);
        Scanner sisendFailist = null;
        try {
            sisendFailist = new Scanner(fail);
        } catch (Exception e) {
            System.out.println("Faili pole - " + e.getMessage());
        }
        // loeme failist
        while (sisendFailist.hasNextLine()) {
            String rida = sisendFailist.nextLine();
            palk.add(rida); // lisame loetud väärtus nimekirja sisse
        }
        sisendFailist.close();
        // järjekord
        int jarjekord = 1;
        // vaatame nimekirja sisu
        for (int i = 0; i < palk.size(); i++) {
            System.out.println(jarjekord + ". " + palk.get(i));
            jarjekord++;
        }
        System.out.println("Mis laulu soovid?: ");
        int lauluNimi = sisend.nextInt();
        System.out.println(palk.get(lauluNimi - 1));
    }

    }