/*
 * autor - Gardo Kirsipuu
 * ülesanne 2.3b
 * */

/*
 * while tsükkel
 * autor Gardo Kirsipuu
 * Ülesanne 3.1
 */

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        // defineerime muutujad
        // lubame kasutajale sisestada midagi
        Scanner sisend = new Scanner(System.in);
        // selgitame kasutajale mida tuleb sisestada
        System.out.println("Sisesta mitu korda tuleb äratada: ");
        // salvestame kasutaja sisestatud väärtuse
        int mituKorda = sisend.nextInt();
        // korduv tegevus
        // defineerime tsükli juhtimismuutuja
        int kord = 1;
        // kontroll
        while (kord <= mituKorda) {
            System.out.println("Tõuse ja sära!");
            // juhtimismuutuja väärtuse suurendamine
            kord++; // sama, mis kord += 1
        }
    }
}