package Proxy;

public class SubjectEx {
    public static void main(String args[]) {
        SubjectProxy proxy1 = new SubjectProxy();

        proxy1.setName("κΉνμ");
        System.out.println("================");

        proxy1.showName();
        System.out.println("================");

        proxy1.complicatedWork();
    }
}