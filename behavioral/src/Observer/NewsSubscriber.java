package Observer;

public class NewsSubscriber implements Observer{
    private String observerName;
    private String news; private
    Publisher publisher;

    public NewsSubscriber(String subscriber, Publisher publisher) {
        this.observerName = subscriber;
        this.publisher = publisher;
        publisher.registerObserver(this);
    }

    @Override
    public void update(String title, String news) {
        this.news = title + "!!! " + news; display();
    }

    private void display() {
        System.out.println("=== " + observerName + " 수신 내용 ===\n" + news + "\n");
    }
}