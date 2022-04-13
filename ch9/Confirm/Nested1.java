package Confirm;

public class Nested1 {
	public static void main(String[] args) {
		Car myCar = new Car();
		//일반 내부 클래스의 인스턴스 생성
		Car.Tire tire = myCar.new Tire(); 
		//정적 내부 클래스의 인스턴스 생성
		Car.Engine engine = new Car.Engine();
	}
}