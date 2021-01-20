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


public class test {
    public static void main(String[] args) {
        // loo konto tüüpi objekt nimega gardoKonto
        Konto gardoKontoSEB = new Konto("Gardo", 500.0);
        Konto gardoKontoSWED = new Konto("Gardo");
        // lisan konkreetsed väärtused
        // gardoKontoSEB.looKonto("Gardo", 0.0);
        // gardoKontoSWED.looKonto("Gardo", 0.0);
        // väljastame tulemused
        System.out.println("SEB");
        System.out.println("Konto omanik = " + gardoKontoSEB.omanik);
        System.out.println("Konto bilans = " + gardoKontoSEB.bilans);

        System.out.println();
        System.out.println("SWED");
        System.out.println("Konto omanik = " + gardoKontoSWED.omanik);
        System.out.println("Konto bilans = " + gardoKontoSWED.bilans);
        /*
        gardoKontoSEB.lisaRaha(20.0);
        gardoKontoSWED.lisaRaha(-50.0);
        // väljastame tulemused
        System.out.println("SEB");
        System.out.println("Konto omanik = " + gardoKontoSEB.omanik);
        System.out.println("Konto bilans = " + gardoKontoSEB.bilans);
        gardoKontoSEB.votaRaha(15.0);
        System.out.println("Konto bilans = " + gardoKontoSEB.bilans);
        gardoKontoSEB.teeYlekanne(gardoKontoSWED, 5.0);
        System.out.println("Konto bilans = " + gardoKontoSEB.bilans);
        gardoKontoSEB.teeYlekanne(gardoKontoSWED, 5.0);
        gardoKontoSEB.votaRaha(20.0);
        System.out.println("Konto bilans = " + gardoKontoSEB.bilans);
        System.out.println("SWED");
        System.out.println("Konto omanik = " + gardoKontoSWED.omanik);
        System.out.println("Konto bilans = " + gardoKontoSWED.bilans);
         */
    }
}