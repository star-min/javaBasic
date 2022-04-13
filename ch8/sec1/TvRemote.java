package sec1;
//클래스가 클래스로 부터 상속을 받을 때 : extends
//클래스가 인터페이스로 부터 상속을 받을 때 : implements
public class TvRemote implements RemoteControl {
	int volume; //인터페이스로 부터 상속된 클래스의 추가된 필드는 자동 private
	int channel; 
	@Override
	public void turnOn() {		System.out.println("TV 전원을 켭니다.");	}

	@Override
	public void turnOff() {		System.out.println("TV 전원을 끔니다.");	}

	@Override
	public void setVolume(int volume) {		this.volume = volume;	}

	@Override
	public int getVolume() {		return volume;	}

	public int getChannel() {		return channel;	}
	public void setChannel(int channel) {		this.channel = channel;	}
}