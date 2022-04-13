package sec1;
//다중상속 : 여러 개의 인터페이스를 하나의 클래스가 상속 받는 것
//인터페이스로 부터 다중상속을 받는 SmartTv는 반드시 두 개의 인터페이스선언내용이 모두 구현되어야함
public class SmartTv implements RemoteControl, Searchable {
	private int volume;
	private int channel;
	@Override
	public void search(String url) {	} /* 오버라이딩 */
	public void search(String url, int channel) { } /* 오버로딩 */
	@Override
	public void turnOn() {	}
	@Override
	public void turnOff() {	}
	@Override
	public void setVolume(int volume) {	}
	@Override
	public int getVolume() { return 1004; }
	public int getChannel() {		return channel;	}
	public void setChannel(int channel) {		this.channel = channel;	}
}