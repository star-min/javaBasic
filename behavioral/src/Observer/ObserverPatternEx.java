package Observer;

public class ObserverPatternEx {
    public static void main(String[] args) {
        NewsPublisher newsPublisher = new NewsPublisher();
        NewsSubscriber newsSubscriber1 = new NewsSubscriber("옵저버1", newsPublisher);
        NewsSubscriber newsSubscriber2 = new NewsSubscriber("옵저버2", newsPublisher);
        newsPublisher.setNews("특보", "옵저버 패턴이 만들어졌습니다.");
        newsPublisher.setNews("정정", "옵저버 패턴으로 내용이 정정됨을 알립니다.");
        newsPublisher.removeObserver(newsSubscriber1);
        newsPublisher.setNews("속보", "누군가 구독 해제를 했습니다.");
    }
}