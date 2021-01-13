/*
 * massiivid
 * autor Gardo Kirsipuu
 * ülesanne 5.4c
 */

import java.io.File;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class test {
    // pronksikarvaSumma meetod
    static Object pronksikarvaSumma(int[] mundid) {
        int summa = 0;
        for (int i = 0; i < mundid.length; i++) {
            if (i <= 5) {
                summa += i;
            }
        }
        return summa;
    }

    public static void main(String[] args) {
        // massiiv faili sisu hoidmiseks
        ArrayList<Integer> mundid = new ArrayList<>();
        // küsime millist faili avada
        Scanner sisend = new Scanner(System.in);
        System.out.println("Sisesta failinimi: ");
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
        while (sisendFailist.hasNextInt()) {
            int rida = sisendFailist.nextInt();
            mundid.add(rida); // lisame loetud väärtus nimekirja sisse
        }
        sisendFailist.close();
        // väljastame müntide summa
        System.out.println("Hoiupõrsasse läheb " + pronksikarvaSumma(mundid) + " senti");
    }
}