/*
 * autor - Gardo Kirsipuu
 * ülesanne 1.4a
 * */

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        // defineerime muutujad
        // lubame kasutajale sisestada midagi
        Scanner sisend = new Scanner(System.in);
        // selgitame kasutajale mida tuleb sisestada
        System.out.println("Sisestage ainepunktide arv: ");
        int ainepunktideArv = sisend.nextInt();
        System.out.println("Sisestage nadalate arv: ");
        int nadalateArv = sisend.nextInt();
        int ajakulu = ainepunktideArv * 26;
        double nadalaAjakulu = (double) ajakulu / nadalateArv;
        System.out.println(Math.round(nadalaAjakulu));
    }
}