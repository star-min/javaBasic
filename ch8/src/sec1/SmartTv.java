package sec1;

public class SmartTv implements RemoteControl, Searchable{
	private int volume;
	private int channel;
	@Override
	public void search(String url) { }
	@Override
	public void turnOn() { }
	@Override
	public void turnOff() { }
	@Override
	public void setVolume(int volume) { }
	@Override
	public int getVolume() { return 0; }
	public int getChannel() { return channel; }
	public void setChannel(int channel) { this.channel = channel; }
	
	
}
