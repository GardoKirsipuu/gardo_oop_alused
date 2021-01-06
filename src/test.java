/*
 * autor - Gardo Kirsipuu
 * ülesanne 2.3b
 * */

/*
 * while tsükkel
 * autor Gardo Kirsipuu
 * Ülesanne 3.4a
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
        int i = 0;
        int porgandid = 0;
        // korduv tegevus
        // kontroll
        while (ringideArv > i) {
            i++;
            porgandid += i * (i + 1) / 2;
        }
        System.out.print("porgandite koguarv on ");
        System.out.print(porgandid);
    }
}