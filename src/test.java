/*
 * autor - Gardo Kirsipuu
 * ülesanne 2.3b
 * */

/*
 * meetod + return - näide
 * autor Gardo Kirsipuu
 * Ülesanne 6.3
 */

import java.util.Scanner;

public class test {
    // eelarve meetod
    static int eelarve(int kulalisteArv) {
        int summa = kulalisteArv * 10 + 55;
        return summa;
    }

    // main meetod
    public static void main(String[] args) {
        // defineerime muutujad
        // lubame kasutajale sisestada midagi
        Scanner sisend = new Scanner(System.in);
        // selgitame kasutajale mida tuleb sisestada
        System.out.println("Mitu inimest on kutsutud?: ");
        // salvestame kasutaja sisestatud väärtuse
        int kutsutud = sisend.nextInt();
        System.out.println("Mitu inimest tuleb?: ");
        int tuleb = sisend.nextInt();
        // arvutamine
        System.out.println("Maksimaalne eelarve: " + eelarve(kutsutud) + "€");
        System.out.println("Minimaalne eelarve: " + eelarve(tuleb) + "€");
    }
}