/*
autor Gardo Kirsipuu
03.02
ülesanne 4
 */

import java.util.ArrayList;

public class test {
    public static void main(String[] args) {
        ArrayList<Sodur> armee1 = new ArrayList<>();
        ArrayList<Sodur> armee2 = new ArrayList<>();

        for (int kord = 1; kord <= 20; kord++) {
            int armeeNr = (int) Math.round(Math.random() * 2);
            if (armeeNr == 1) {
                armee1.add(new Sodur(armeeNr));
            }
            if (armeeNr == 2) {
                armee2.add(new Sodur(armeeNr));
            }
        }

        Ulem ulem1 = new Ulem(1);
        Ulem ulem2 = new Ulem(2);


        for (Sodur sodur : armee1) {
            sodur.info();

        }

        for (Sodur sodur : armee2) {
            sodur.info();
        }

        if (armee1.size() > armee2.size()) {
            ulem1.tostaTase();
        } else {
            ulem2.tostaTase();
        }

        System.out.print("1. armee ulemuse tase on = ");
        ulem1.info();
        System.out.print("2. armee ulemuse tase on = ");
        ulem2.info();

    }
}