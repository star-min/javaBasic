package sec1;
//클래스 : 설계도, 객체를 만들기 위한 틀
//클래스의 구성 : 멤버(변수)필드, 멤버 메서드, 생성자;
public class Sample1 {
	int field1;	//멤버(변수)필드 : 해당 객체에 대한 특성을 저장하고 있는 객체에 딸린 변수
	private float field2;  //Field
	double field3;
	short field4;	
	boolean field5;
	String field6;
	//생성자(Constructor)
	//: 현재 이름과 똑같이 객체를 만들 수 있는 함수를 만드는 데 그 것을 생성자라함
	//만약, 선언 또는 정의를 하지 않으면, 생략한 것으로 간주하여
	//Sample1(){ } (<=기본 생성자)가 있다고 가정을 하게됨
	//오버로딩 : 같은 이름으로 매개변수의 개수나 타입을 달리하여 메서드나 함수를 정의하는 것
	Sample1() { }
	Sample1(int field1) { 
		this.field1 = field1;
	}
	Sample1(int field1, float field2) { 
		this.field1 = field1;
		this.field2 = field2;
	}
	public void method1() { //멤버 메서드(Method)
		System.out.println("메서드1");
	}
	public int method2() {
		return this.field1;
	}
	public int getField1() {
		return field1;
	}
	public void setField1(int field1) {
		this.field1 = field1;
	}
	public float getField2() {
		return field2;
	}
	public void setField2(float field2) {
		this.field2 = field2;
	}
	public double getField3() {
		return field3;
	}
	public void setField3(double field3) {
		this.field3 = field3;
	}
	public short getField4() {
		return field4;
	}
	public void setField4(short field4) {
		this.field4 = field4;
	}
	public boolean isField5() {
		return field5;
	}
	public void setField5(boolean field5) {
		this.field5 = field5;
	}
	public String getField6() {
		return field6;
	}
	public void setField6(String field6) {
		this.field6 = field6;
	}
}