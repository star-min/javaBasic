package sec2;

public class Car {
	private String name;
	private String style;
	private String company;
	private String fuel;
	private int tire;
	private int speed;
	private String num;
	private int usetime;
	

	
	Car() {
		this("레인보우식스세븐");
	}
	Car(String name) {
		this(name,"승합차");
	}
	Car(String name, String style) {
		this(name,style,"랜드로버 디스플레이");
	}
	Car(String name, String style, String company) {
		this(name,style,company,"휘발유");
	}
	Car(String name, String style, String company, String fuel) {
		this(name,style,company,fuel,4);
	}
	Car(String name, String style, String company, String fuel, int tire) {
		this(name,style,company,fuel,tire,175);
	}
	Car(String name, String style, String company, String fuel, int tire, int speed) {
		this(name,style,company,fuel,tire,speed,"77가7777");
	}
	Car(String name, String style, String company, String fuel, int tire, int speed, String num) {
		this(name,style,company,fuel,tire,speed,num,0);
	}
	Car(String name, String style, String company, String fuel, int tire, int speed, String num, int usetime) {
		this.name = name;
		this.style = style;
		this.company = company;
		this.fuel = fuel;
		this.tire = tire;
		this.speed = speed;
		this.num = num;
		this.usetime = usetime;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getFuel() {
		return fuel;
	}
	public void setFuel(String fuel) {
		this.fuel = fuel;
	}
	public int getTire() {
		return tire;
	}
	public void setTire(int tire) {
		this.tire = tire;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	public int getUsetime() {
		return usetime;
	}
	public void setUsetime(int usetime) {
		this.usetime = usetime;
	}
	public String getStyle() {
		return style;
	}
	public void setStyle(String style) {
		this.style = style;
	}
	
	
}
