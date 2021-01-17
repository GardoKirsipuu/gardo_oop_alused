/*
 * autor Gardo Kirsipuu
 1. Luua uusi kontosid, andes kontole mingi hulga raha
 2. Kanda kontole raha
    a) Kontole ei saa kanda negatiivset summat
 3. Võtta kontolt raha
    a) Kontolt ei saa võtta negatiivset summat
    b) Kontolt ei saa võtta rohkem raha kui kontol on
 4. Kanda ühelt kontolt raha teisele
    a) Kehtivad samad reeglid, mis kontole raha kandmisel ja välja võtmisel

 Iga tegevus peab võimalusel olema vormistatud eraldi meetodina
 Programm peab olema piisavalt dokumenteeritud
 */

import java.util.HashMap;
import java.util.Scanner;

public class test {
    // konto loomine
    static HashMap<String, Integer> kontoLoomine() {
        HashMap<String, Integer> kontod = new HashMap<String, Integer>();
        // konto nime sisestamine
        Scanner sisend = new Scanner(System.in);
        System.out.print("Sisesta konto nimi: ");
        String nimi = sisend.nextLine();
        // konto raha sisestamine
        System.out.print("Sisesta konto summa: ");
        Integer raha = sisend.nextInt();
        // nime ja raha HashMapi sisestamine
        kontod.put(nimi, raha);
        // hashmapi väljastamine
        return kontod;
    }

    public static void main(String[] args) {
        HashMap kontod = new HashMap();
        Scanner sisend = new Scanner(System.in);
        boolean stop = true;
        while (stop) {
            System.out.println("Konto loomiseks kirjuta 1");
            System.out.println("Kontole raha kandmiseks kirjuta 2");
            System.out.println("Kontolt raha võtmis5eks kirjuta 3");
            System.out.println("Kontolt kontole raha kandmiseks kirjuta 4");
            System.out.println("Programmi kinni panemiseks kirjuta 5");
            String valik = sisend.nextLine();
            if (valik.equals("1")) {
                kontod.putAll(kontoLoomine());
            }
            if (valik.equals("2")) {
                System.out.println(kontod);
                System.out.print("Kellele tahad raha kanda?: ");
                String nimiKandmine = sisend.nextLine();
                System.out.print("Kui palju raha tahad üles kanda?: ");
                int summaKandmine = sisend.nextInt();
                kontod.put(nimiKandmine, kontod.get(nimiKandmine) + summaKandmine);
            }
            if (valik.equals("3")) {

            }
            if (valik.equals("4")) {

            }
            if (valik.equals("5")) {
                System.out.println(kontod);
                stop = false;
            }
        }
    }
}
    /*
    public static void main(String[] args) {
        HashMap<String, String> grupp = new HashMap<String, String>();
        grupp.put("matti", "mage");
        grupp.put("mikael", "miku");
        grupp.put("arto", "arppa");
        /**
        for (String nimi: grupp.keySet()) {
            System.out.println(nimi + " - " + grupp.get(nimi));
        }**
        Scanner sisend = new Scanner(System.in);
        System.out.println("Sisesta nimi: ");
        String nimi = sisend.nextLine();
        nimi = nimi.toLowerCase(Locale.ROOT);
        System.out.println(nimi + " - " + grupp.get(nimi));
    }
    */
