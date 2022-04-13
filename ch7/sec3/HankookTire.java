package sec3;

public class HankookTire extends Tire {
	HankookTire(String location){
		this(location, 30);
	}
	HankookTire(String location, int maxRotation){
		super(location, maxRotation);
	}
	@Override
	public boolean roll() {
		System.out.println("한국타이어로 운행");
		++accRotation;
		if(accRotation<maxRotation) {
			System.out.println(location+" 한국타이어 누적된 운행 회전수 : "+accRotation);
			System.out.println(location+" 한국타이어 남은 회전수 : "+(maxRotation-accRotation));
			return true;
		} else {
			System.out.println(location+" 한국타이어 펑크~!");
			return false;
		}
	}
}
