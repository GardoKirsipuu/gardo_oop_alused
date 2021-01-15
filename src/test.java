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
import java.util.Locale;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        HashMap<String, String> grupp = new HashMap<String, String>();
        grupp.put("matti", "mage");
        grupp.put("mikael", "miku");
        grupp.put("arto", "arppa");
        /*
        for (String nimi: grupp.keySet()) {
            System.out.println(nimi + " - " + grupp.get(nimi));
        }*/
        Scanner sisend = new Scanner(System.in);
        System.out.println("Sisesta nimi: ");
        String nimi = sisend.nextLine();
        nimi = nimi.toLowerCase(Locale.ROOT);
        System.out.println(nimi + " - " + grupp.get(nimi));
    }
}