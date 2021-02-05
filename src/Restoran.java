public class Restoran {
    private String restoraniNimi;
    private String soogiTyyp;
    private int kylalisteArv = 0;

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

    public void teenindatudKylalisedPaevas(int kylalised) {
        this.kylalisteArv = this.kylalisteArv + kylalised;
        System.out.println(this.restoraniNimi + " on teenindatud " + kylalisteArv + " külalisi");
    }
}
