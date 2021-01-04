/*
 * Muutujate kasutamise näide
 * autor - Gardo Kirsipuu
 * ülesanne 1.3
 * */

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        // defineerime muutujad
        // lubame kasutajale sisestada midagi
        Scanner sisend = new Scanner(System.in);
        // selgitame kasutajale mida tuleb sisestada
        System.out.println("Sisestage astme alus: ");
        // salvestama kasutaja sisestatud väärtus
        int astmeAlus = sisend.nextInt();
        // selgitame kasutajale mida tuleb sisestada
        System.out.println("Sisestage astendaja: ");
        // salvestama kasutaja sisestatud väärtus
        int astendaja = sisend.nextInt();
        // arvutamine
        int tulemus = (int) Math.pow(astmeAlus, astendaja);
        // väljastamine
        System.out.println(tulemus);
    }
}
