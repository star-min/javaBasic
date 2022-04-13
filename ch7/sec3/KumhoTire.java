package sec3;

public class KumhoTire extends Tire {
	KumhoTire(String location){
		this(location, 40);
	}
	KumhoTire(String location, int maxRotation){
		super(location, maxRotation);
	}
	@Override
	public boolean roll() {
		System.out.println("금호타이어로 운행");
		++accRotation;
		if(accRotation<maxRotation) {
			System.out.println(location+" 금호타이어 누적된 운행 회전수 : "+accRotation);
			System.out.println(location+" 금호타이어 남은 회전수 : "+(maxRotation-accRotation));
			return true;
		} else {
			System.out.println(location+" 금호타이어 펑크~!");
			return false;
		}
	}
}
