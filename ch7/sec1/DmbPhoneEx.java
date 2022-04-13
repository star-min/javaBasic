package sec1;

public class DmbPhoneEx {
	public static void main(String[] args) {
		DmbPhone dmb1 = new DmbPhone("S22", "Black", 24);
		System.out.println("모델명 : "+dmb1.model);
		System.out.println("색상 : "+dmb1.color);
		System.out.println("채널 : "+dmb1.channel);
		dmb1.powerOn();
		dmb1.bell();
		dmb1.sendVoice("여보세요");
		dmb1.receiveVoice("안녕하셨습니까?");
		dmb1.hangUp();
		dmb1.turnOnDmb();
		dmb1.changeChannelDmb(12);
		dmb1.turnOffDmb();
		dmb1.powerOff();
	}
}