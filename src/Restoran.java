public class Restoran {
    private String restoraniNimi;
    private String soogiTyyp;
    private int kylalisteArv = 0;

    public Restoran(String restoraniNimi, String soogiTyyp) {
        this.restoraniNimi = restoraniNimi;
        this.soogiTyyp = soogiTyyp;
    }

    @Override
    public String toString() {
        return "Tere tulemast restorani " + this.restoraniNimi + ". Siin pakume " + this.soogiTyyp;
    }

    public void avaRestoran() {
        System.out.println(this.restoraniNimi + " on avatud!");
    }

    public void teenindatudKylalisedPaevas(int kylalised) {
        this.kylalisteArv = this.kylalisteArv + kylalised;
        System.out.println(this.restoraniNimi + " on teenindatud " + kylalisteArv + " külalisi");
    }
}
