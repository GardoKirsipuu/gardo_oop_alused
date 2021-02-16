public class Opetaja {
    private String nimi;

    // konstruktor
    public Opetaja(String nimi) {
        this.nimi = nimi;
    }

    // õpetaja õpetab õpilast - kasutasin opilase klassis iseseisva õppimise meetodit
    public void opetab(Opilane opilane, String teema) {
        opilane.opib(teema);
    }


}
