package Confirm;

public class Anonymous {
	Vehicle field = new Vehicle() {	//인터페이스의 익명의 객체 생성
		@Override
		public void run() { System.out.println("자전거가 달립니다."); }
	};
	void method1() {	//메서드 호출시 인터페이스의 익명의 객체 생성 후 지역에서 실행
		Vehicle localVar = new Vehicle() {
			@Override
			public void run() { System.out.println("승용차가 달립니다."); }
		};
		localVar.run();
	}
	void method2(Vehicle v) {	//메서드 호출시 인터페이스를 매개변수로 받아 메서드 실행 
		v.run();
	}
}