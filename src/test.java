/*
 * autor - Gardo Kirsipuu
 * ülesanne 2.3b
 * */

/*
 * meetod + return - näide
 * autor Gardo Kirsipuu
 * Ülesanne 6.4a
 */

import java.util.Scanner;

public class test {
    // tervitus meetod
    static Object tervitus(int kulalisteArv) {
        System.out.println("Võõrustaja: \"Tere!\"");
        System.out.println("Täna " + kulalisteArv + ". korda tervitada, mõtistkleb võõrustaja.");
        System.out.println("Külaline:  \"Tere, suur tänu kutse eest!\"");
        return null;
    }

    // main meetod
    public static void main(String[] args) {
        // defineerime muutujad
        // lubame kasutajale sisestada midagi
        Scanner sisend = new Scanner(System.in);
        // selgitame kasutajale mida tuleb sisestada
        System.out.println("Sisestage külaliste arv: ");
        // salvestame kasutaja sisestatud väärtuse
        int kulalisteArv = sisend.nextInt();
        int kord = 1;
        // tsükkel
        while (kulalisteArv >= kord) {
            tervitus(kord);
            kord++;
        }
    }
}