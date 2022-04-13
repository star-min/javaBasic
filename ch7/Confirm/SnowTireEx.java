package Confirm;

public class SnowTireEx {
	public static void main(String[] args) {
		SnowTire snowtire = new SnowTire();
		//Tire tire = new Tire();
		Tire tire = snowtire;
		//SnowTire tire = new Tire();  (X)
		//Tire tire = new SnowTire();
		snowtire.run();
		tire.run();
		//SnowTire tire = new WideTire();
		
		/*
		클래스와 생성자와의 관계
		A
		B		C
		D,E		F
		
		B b = new B();
		B b = new D();
		B b = new E();
		
		형변환의 가능 여부
		A a = b (O)	- 자동 형변환
		B b = a (X)
		B b = (B) a (O)  - 강제 형변환
		*/
	}
}