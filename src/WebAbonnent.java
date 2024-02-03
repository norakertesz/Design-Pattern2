public class WebAbonnent implements AbonnentIn {
    private String name;
    private Medienverlag medienverlag;
    public WebAbonnent(String name, Medienverlag mv) {
        this.name=name;
        this.medienverlag=mv;
        System.out.println("--WebAbonnent " + name + " erstellt.");
        medienverlag.addSubscriber(this);
    }

    @Override
    public void erhalte(Artikel artikel) {
        System.out.println("WebAbonnent "+ name + " hat einen neuen Artikel erhalten, mit dem Title: "
                + artikel.getTitle());
    }

    @Override
    public String getName() {
        return name;
    }

}
