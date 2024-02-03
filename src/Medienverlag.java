import java.util.ArrayList;
import java.util.List;

public class Medienverlag {

    private List<AbonnentIn> abonnenten=new ArrayList<>();
    public void veroeffentliche(Artikel neuerArtikel){
        for(AbonnentIn eineAbonenntin: abonnenten){
            eineAbonenntin.erhalte(neuerArtikel);
        }
    };

    public void addSubscriber(AbonnentIn abonnent) {
        abonnenten.add(abonnent);
        System.out.println("- Medienverlag: added Subscriber: " + abonnent.getName()+"!");
    }

    public void removeSubscriber(AbonnentIn abonnent) {
        abonnenten.remove(abonnent);
        System.out.println("- Medienverlag: removed Subscriber: " + abonnent.getName()+"!");
    }
}
