package sec1;

public class CellPhone {
	String model;
	String color;
	public void powerOn() {
		System.out.println("전원을 켭니다.");
	}
	public void powerOff() {
		System.out.println("전원을 끔니다.");
	}
	public void bell() {
		System.out.println("벨이 울립니다.");
	}
	public void sendVoice(String msg) {
		System.out.println(msg+"라고, 상대방에게 말하였습니다.");
	}
	public void receiveVoice(String msg) {
		System.out.println(msg+"라고, 상대방이 말을 하였습니다.");
	}
	public void hangUp() {
		System.out.println("전화를 끊습니다.");
	}
}