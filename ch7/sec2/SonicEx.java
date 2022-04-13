package sec2;

public class SonicEx {
	public static void main(String[] args) {
		SupersonicAirplane plane = new SupersonicAirplane();
		plane.takeOff();
		plane.fly();
		plane.flyMode = SupersonicAirplane.SUPERSONIC;
		plane.fly();
		plane.flyMode = SupersonicAirplane.NORMAL;
		plane.fly();
		plane.landing();
	}
}