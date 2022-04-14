package sec1;

public class RemoteEx {

	public static void main(String[] args) {
	RemoteControl rc1;
	rc1 = new TvRemote();
	rc1.turnOn();
	rc1.setVolume(10);
	System.out.println("TV볼륨 : "+rc1.getVolume());
	rc1.turnOff();
	rc1 = new AudioRemote();
	rc1.turnOn();
	System.out.println("오디오 볼륨 : "+rc1.getVolume());
	rc1.turnOff();
	
	TvRemote rc2 = new TvRemote();
	rc2.volume = 20;
	rc2.channel = 24;
	
	RemoteControl rc4 = rc2;
	
	RemoteEx.play(rc2);
	RemoteEx.play(rc2.volume, rc2.channel);
	System.out.println(rc2);
	}
	
	private static void play(TvRemote tv1) {
		System.out.println("TV의 볼륨 : "+tv1.volume);
		System.out.println("TV의 채널 : "+tv1.channel);
		System.out.println("플래이를 합니다.");
	}
	private static void play(int volume, int channel) {
		System.out.println("TV의 볼륨 : "+volume);
		System.out.println("TV의 채널 : "+channel);
		System.out.println("플래이를 합니다.");
	}

}
