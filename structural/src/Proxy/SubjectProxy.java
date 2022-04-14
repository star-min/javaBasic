package Proxy;

public class SubjectProxy implements Subject {

    public RealSubject subject;
    public String name;

    public void setName(String name) {
        System.out.println("proxy가 대신해서 처리 할 수 있어요.");
        if (subject != null) {
            subject.setName(name);
        }
        this.name = name;
    }

    public void showName() {
        System.out.println("proxy가 대신해서 처리 할 수 있어요.");
        System.out.println("my name is " + name);
    }

    public void complicatedWork() {
        subject = new RealSubject();
        subject.complicatedWork();
    }
}