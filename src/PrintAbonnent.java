public class PrintAbonnent implements AbonnentIn{


    private String name;
    private Medienverlag medienverlag;
    public PrintAbonnent(String name, Medienverlag medienverlag) {
        this.name=name;
        this.medienverlag=medienverlag;
        System.out.println("--PrintAbonnent " + name + " erstellt.");
        medienverlag.addSubscriber(this);
    }

    @Override
    public void erhalte(Artikel artikel) {
        System.out.println("PrintAbonnent "+ name + " hat einen neuen Artikel erhalten, mit dem Title: "
                + artikel.getTitle());
    }

    @Override
    public String getName() {
        return name;
    }
}
