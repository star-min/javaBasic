package Proxy;

public class SubjectEx {
    public static void main(String args[]) {
        SubjectProxy proxy1 = new SubjectProxy();

        proxy1.setName("김하영");
        System.out.println("================");

        proxy1.showName();
        System.out.println("================");

        proxy1.complicatedWork();
    }
}