import java.util.ArrayList;

public class JaatiseKiosk extends Restoran {
    private ArrayList<String> jaatiseValik = new ArrayList<>();

    public JaatiseKiosk(String restoraniNimi, String soogiTyyp) {
        super(restoraniNimi, soogiTyyp);
    }

    public void jaatiseLisamine(String jaatis) {
        jaatiseValik.add(jaatis);
    }

    @Override
    public String toString() {
        return super.toString() + "\n" + this.jaatiseValik;
    }
}
