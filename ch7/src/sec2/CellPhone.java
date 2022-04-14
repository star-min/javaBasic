package sec2;

public class CellPhone {
	String model;
	String color;
	String mesege;
	String getmesege;
	
	
	public CellPhone(String model, String color, String mesege, String getmesege) {
		this.model = model;
		this.color = color;
		this.mesege = mesege;
		this.getmesege = getmesege;
	}
	public String getMesege() {
		return mesege;
	}
	public void setMesege(String mesege) {
		this.mesege = mesege;
	}
	
	public void powerOn(){
		System.out.println("전원을 켭니다.");
	}
	public void powerOff(){
		System.out.println("전원을 끕니다.");
	}
	public void bell(){
		System.out.println("벨이 울립니다.");
	}
	public void sendVoice(String mesege){
		//전달한 메시지를 출력
		this.mesege = mesege;
	}
	public void receiveVoice(String getmesege){
		//전달받은 메시지를 출력
		this.getmesege = mesege;
	}
	public void hangUp(){
		//전화를 끊습니다 출력
		System.out.println("전화를 끊습니다.");
	}
}
