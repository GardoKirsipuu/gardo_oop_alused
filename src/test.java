/*
 * autor - Gardo Kirsipuu
 * ülesanne 2.3b
 * */

import java.util.Random;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        // defineerime muutujad
        Random rand = new Random();
        // lubame kasutajale sisestada midagi
        Scanner sisend = new Scanner(System.in);
        // selgitame kasutajale mida tuleb sisestada
        System.out.println("Kas soovite istekohta ise valida (ise) voi loosida (loos)? ");
        String iseLoos = sisend.next();
        if (iseLoos.equals("loos")) {
            int rand_int = rand.nextInt(3);
            if (rand_int <= 1) {
                System.out.println("Istekoht loositi. Vahekaigukoht");
            } else if (rand_int > 1) {
                System.out.println("Istekoht loositi. Aknakoht");
            }
        } else if (iseLoos.equals("ise")) {
            System.out.println("Kas soovite istuda akna aares (aken) voi mitte (muu)");
            String ise = sisend.next();
            if (ise.equals("aken")) {
                System.out.println("Valisite ise. Aknakoht");
            } else if (ise.equals("muu")) {
                System.out.println("Valisite ise. Vahekaigukoht");
            }
        }
    }
}