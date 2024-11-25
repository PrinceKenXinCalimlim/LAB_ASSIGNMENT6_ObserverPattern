import java.util.List;

public class NewsAgency implements NewsAgencySubject{
    private String latestNews;
    private List<Subscriber> subscriberList;

    public String getLatestNews() {
        return latestNews;
    }

    public void setLatestNews(String latestNews) {
        this.latestNews = latestNews;
    }

    public List<Subscriber> getSubscriberList() {
        return subscriberList;
    }

    public void setSubscriberList(List<Subscriber> subscriberList) {
        this.subscriberList = subscriberList;
    }
    
    @Override
    public void subscribe(Subscriber subscriber) {
        subscriberList.add(subscriber);
        System.out.println(subscriber.getSubscriberName() + " has now subscribed!");
    }

    @Override
    public void unsubscribe(Subscriber subscriber) {
        subscriberList.remove(subscriber);
        System.out.println(subscriber.getSubscriberName() + " has now unsubscribed!");
    }

    @Override
    public String notifySubscriber() {
        String output = new String();
        for(Subscriber subscriber : subscriberList){
            output += "Hey, " + subscriber.getSubscriberName() + "!\n";
            output += "LATEST NEWS! : " + latestNews + "\n\n";
        }
        return output;
    }

}
    
