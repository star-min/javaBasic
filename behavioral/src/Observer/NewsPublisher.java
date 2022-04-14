package Observer;

import java.util.ArrayList;

public class NewsPublisher implements Publisher{
    private ArrayList<Observer> observers;
    private String title;
    private String news;

    public NewsPublisher() {
        observers = new ArrayList<>();
        title = null;
        news = null;
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for(Observer observer : observers) {
            observer.update(title, news);
        }
    }

    public void setNews(String title, String news) {
        this.title = title;
        this.news = news;
        notifyObservers();
    }
}