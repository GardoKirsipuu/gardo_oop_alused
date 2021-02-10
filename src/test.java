/*
autor Gardo Kirsipuu
10.02
ülesanne 7
 */

import java.util.ArrayList;

public class test {
    public static void main(String[] args) {
        Tuba tuba = new Tuba(6.0, 3.0, 2.7);
        System.out.println(tuba.getPindala());
        tuba.lisaAkenUks(1.0, 1.0);
        tuba.lisaAkenUks(1.0, 1.0);
        tuba.lisaAkenUks(1.0, 2.0);
        System.out.println(tuba.tooPind());
    }
}