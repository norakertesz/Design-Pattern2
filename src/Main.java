public class Main {
    public static void main(String[] args) {
        Medienverlag klatsch = new Medienverlag();
        Artikel artikel1 = new Artikel("ScönheitsOP von Sissi", "Text1");
        Artikel artikel2 = new Artikel("Titel1", "Text1");

        AbonnentIn Jaqueline = new PrintAbonnent("Jaqueline", klatsch);
        AbonnentIn Jacques = new PrintAbonnent("Jacques", klatsch);
        AbonnentIn Jose = new SMSAbonnent("José", klatsch);
        AbonnentIn JeanJaques = new WebAbonnent("Jean-Jaques", klatsch);

        klatsch.veroeffentliche(artikel1);
        klatsch.veroeffentliche(artikel2);

    }
}