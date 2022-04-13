package sec2;

public class SupersonicAirplane extends AirPlane {
	public static final int NORMAL = 1;
	public static final int SUPERSONIC = 2;
	
	public int flyMode = NORMAL;

	@Override
	public void fly() {
		if(flyMode == SUPERSONIC) {
			System.out.println("초음속비행을 합니다.");
		} else {
			super.fly();
		}
	}
	/* 
	 부모 클래스인 AirPlane에서 fly 메서드를 변환하여 flyMode가 NORMAL이면, "일반비행을 합니다"로 출력하고,
	 SUPERSONIC이면, "초음속비행을 합니다."를 출력할 수 있도록 할 것. 
	 (일반비행모드인 경우 super 키워드를 사용할 것).
	 */
	
}