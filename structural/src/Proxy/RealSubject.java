package Proxy;

public class RealSubject implements Subject {

    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public void showName() {
        System.out.println("my name is " + name);
    }

    public void complicatedWork() {
        System.out.println("proxy가 처리 못하는 작업을 수행합니다.");
    }
}