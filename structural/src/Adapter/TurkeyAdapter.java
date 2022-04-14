package Adapter;
//Adapter : 서로 다른 인터페이스를 가진 클래스를 함께 사용할 수 있도록 하는 패턴
public class TurkeyAdapter implements Duck {

    Turkey turkey;

    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    @Override
    public void quack(){
        turkey.gobble();
    }

    @Override
    public void fly() {
        turkey.fly();
    }
}