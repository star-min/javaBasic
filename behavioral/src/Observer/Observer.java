package Observer;
//Observer : 객체의 상태가 업데이트되면 객체에 의존하는 다른 객체에 알리고 자동으로 내용을 갱신하는 패턴
public interface Observer {
    public void update(String title, String news);
}