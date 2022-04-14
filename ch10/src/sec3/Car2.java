package sec3;

public class Car2 {
	Tire[] tires = {
			new Tire("앞왼쪽", 20),
			new Tire("앞오른쪽", 15),
			new Tire("뒤왼쪽", 19),
			new Tire("뒤오른쪽", 17)
	};
	public int run() {
		System.out.println("자동차가 달립니다.");
		for(int i=0;i<tires.length;i++) {
			if(tires[i].roll()==false) { stop(); return i+1;	}
		}
		return 0;
	}
	public void stop() {
		System.out.println("자동차가 멈춥니다.");
	}
}