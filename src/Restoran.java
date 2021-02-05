public class Restoran {
    private String restoraniNimi;
    private String soogiTyyp;

    public Restoran(String nimi, String sook) {
        this.restoraniNimi = nimi;
        this.soogiTyyp = sook;
    }

    @Override
    public String toString() {
        return "Tere tulemast restorani " + this.restoraniNimi + ". Siin pakume " + this.soogiTyyp + ".";
    }

    public void avaRestoran() {
        System.out.println(this.restoraniNimi + " on avatud!");
    }


}
