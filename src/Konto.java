public class Konto {
    // muutujad
    public String omanik;
    public Double bilans;

    // konstruktor


    public Konto(String omanik) {
        this.omanik = omanik;
        this.bilans = 0.0;
    }

    public Konto(String omanikuNimi, Double summa) {
        this.looKonto(omanikuNimi, summa);
    }

    // meetodid
    public void looKonto(String omanikuNimi, Double summa) {
        this.omanik = omanikuNimi;
        this.bilans = summa;
    }

    public boolean lisaRaha(Double summa) {
        if (summa < 0) {
            System.out.println("Negatiivset summat pole võimalik lisada");
            return false;
        } else {
            this.bilans += summa;
            System.out.println("Kontole on lisatud summa " + summa);
            return true;
        }
    }

    public boolean votaRaha(Double summa) {
        if (summa < 0) {
            System.out.println("Negatiivset summat pole võimalik võtta");
            return false;
        } else {
            if (summa <= this.bilans) {
                this.bilans = this.bilans - summa;
                System.out.println("Kontost maha võetud " + summa);
                return true;
            } else {
                System.out.println("Kontol ei ole piisavalt raha");
                return false;
            }
        }
    }

    public boolean teeYlekanne(Konto teineKonto, Double summa) {
        if (summa < 0) {
            System.out.println("Negatiivset summat pole võimalik üle kanda");
            return false;
        } else {
            if (summa <= this.bilans) {
                this.bilans = this.bilans - summa;
                teineKonto.bilans = teineKonto.bilans + summa;
                System.out.println("Kontole on üle kantud " + summa);
                return true;
            } else {
                System.out.println("Kontol ei ole piisavalt raha");
                return false;
            }
        }
    }
}
