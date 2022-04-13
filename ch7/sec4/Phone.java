package sec4;
//추상클래스
public abstract class Phone {
	String owner;
	Phone(String owner){ this.owner = owner; }
	abstract void turnOn();
	abstract void turnOff();
}