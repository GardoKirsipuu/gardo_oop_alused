/*
 * autor - Gardo Kirsipuu
 * ülesanne 2.3b
 * */

/*
 * while tsükkel
 * autor Gardo Kirsipuu
 * Ülesanne 3.3
 */

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        // defineerime muutujad
        // lubame kasutajale sisestada midagi
        Scanner sisend = new Scanner(System.in);
        // selgitame kasutajale mida tuleb sisestada
        System.out.println("Sisesta ringide arv: ");
        // salvestame kasutaja sisestatud väärtuse
        int ringideArv = sisend.nextInt();
        int joostud = 0;
        int porgandid = 0;
        int mitu = 2;
        // korduv tegevus
        // kontroll
        while (joostud < ringideArv) {
            if (joostud % 2 == 0) {
                porgandid += mitu;
                mitu += 2;
            }
            joostud++;
        }
        System.out.println(porgandid);
    }
}