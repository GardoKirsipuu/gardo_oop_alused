/*
 * Muutujate kasutamise näide
 * autor - Gardo Kirsipuu
 * ülesanne 1.2
 * */

public class test {
    public static void main(String[] args) {
        // defineerime muutujad
        int aasta = 2020;
        String liblikas = "teelehe-mosaiikliblikas";
        String lauseKeskosa = ". aasta liblikas on ";
        String lause = aasta + lauseKeskosa + liblikas;
        // völjastamine
        System.out.println(lause);
    }
}
