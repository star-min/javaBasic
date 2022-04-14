package sec3;

public class Tire {
	int maxRotation;	//최대 회전수
	int accRotation;	//누적 회전수
	String location;
	Tire(String location, int maxRotation) {
		this.maxRotation = maxRotation;
		this.location = location;
	}
	public boolean roll() {
		++accRotation;
		if(accRotation<maxRotation) {
			System.out.println(location+"의 타이어 회전 바퀴수 : "+accRotation);
			System.out.println(location+" 타이어의 잔여 회전수 : "+(maxRotation-accRotation));
			return true;
		} else {
			System.out.println(location+" 타이어 펑크~!");
			return false;
		}
	}
}