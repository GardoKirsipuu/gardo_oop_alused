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
        System.out.println("Täringute arv: ");
        // salvestame kasutaja sisestatud väärtuse
        int taringuteArv = sisend.nextInt();
        // korduv tegevus
        // kontroll
        while (true) {
            int taring = (int) Math.round(Math.random() * 6);
            System.out.println(taring);
            if (taring == taringuteArv) {
                break;
            }
        }
    }
}