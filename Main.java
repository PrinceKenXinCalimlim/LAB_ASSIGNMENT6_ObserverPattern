import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create subscribers and set their names
        Subscriber john = new Subscriber();
        john.setSubscriberName("John Wick");

        Subscriber elisabeth = new Subscriber();
        elisabeth.setSubscriberName("Elisabeth Sparkle");

        Subscriber ethan = new Subscriber();
        ethan.setSubscriberName("Ethan Hunt");

        List<Subscriber> subscribers = new ArrayList<>();

        
        NewsAgency news = new NewsAgency();
        news.setSubscriberList(subscribers);
       
        news.subscribe(john);
        news.subscribe(elisabeth);
        news.subscribe(ethan);

        news.setLatestNews("Gladiator II Shows Strength and Honor in Blockbuster Global Box Office Debut !");

        System.out.println("\nUPDATE!");
        news.notifySubscriber(); 

        
        news.unsubscribe(elisabeth);

        Subscriber jef = new Subscriber();
        jef.setSubscriberName("Jef Costello");
        news.subscribe(jef);

        System.out.println("\nNEW UPDATE RECENTLY!");
        news.notifySubscriber(); 
        jef.updateNews(news);
    }
}
