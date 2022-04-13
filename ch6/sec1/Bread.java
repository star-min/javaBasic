package sec1;

public class Bread {
	//-> 필드의 대한 접근제한자는 모두 클래스 내부에서만 접근가능해야함
	private String name;		
	private String matrial;
	private int gram;
	private int price;
	private int cnt;
	//this()함수를 활용한 오버로딩
	Bread(){			this("빵");	}
	Bread(String name){		this(name, "밀가루");	}
	Bread(String name, String matrial){		this(name, matrial, 90);	}
	Bread(String name, String matrial, int gram){
		this(name, matrial, gram, 900);
	}
	Bread(String name, String matrial, int gram, int price){
		this(name, matrial, gram, price, 1);
	}
	Bread(String name, String matrial, int gram, int price, int cnt) {
		this.name = name;
		this.matrial = matrial;
		this.gram = gram;
		this.price = price;
		this.cnt = cnt;
	}	
	//금액=가격*개수
	public int computeTotal() { //매개변수 없는 경우
		return this.price*this.cnt;
	}
	public int computeTotal(int price) { //매개변수가 가격만 있는 경우
		return price*this.cnt;
	} 
	public int computeTotal(int price, int cnt) { //매개변수가 가격, 개수가 있는 경우
		return price*cnt;
	} 
	//getter/setter 구성할 것.
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMatrial() {
		return matrial;
	}
	public void setMatrial(String matrial) {
		this.matrial = matrial;
	}
	public int getGram() {
		return gram;
	}
	public void setGram(int gram) {
		this.gram = gram;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getCnt() {
		return cnt;
	}
	public void setCnt(int cnt) {
		this.cnt = cnt;
	}
}