/*
 * autor - Gardo Kirsipuu
 * ülesanne 2.3b
 * */

/*
 * meetod + return - näide
 * autor Gardo Kirsipuu
 * Ülesanne 6.1
 */

import java.util.Locale;
import java.util.Scanner;

public class test {
    // banner meetod
    static String banner(String reklaamlause) {
        String reklaamlauseSuurteTahtedega = reklaamlause.toUpperCase();
        return reklaamlauseSuurteTahtedega;
    }

    // main meetod
    public static void main(String[] args) {
        // defineerime muutujad
        // lubame kasutajale sisestada midagi
        Scanner sisend = new Scanner(System.in);
        // selgitame kasutajale mida tuleb sisestada
        System.out.println("Mitu korda kuvada reklaamlauset?: ");
        // salvestame kasutaja sisestatud väärtuse
        int kordamine = sisend.nextInt();
        // sammuti sisendid
        sisend = new Scanner(System.in);
        System.out.println("Sisesta reklaamlause");
        String lause = sisend.nextLine();
        // kordamine
        int kord = 1;
        while (kord <= kordamine) {
            System.out.println(banner(lause));
            kord++;
        }
    }
}