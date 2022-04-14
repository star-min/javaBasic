package sec1;

//package 패키지명;

//	접근제어자 생략시에는 default임
//	접근제어자에는 public, default, protected, private
//	지시자 final(상수), static(정적) 
//	[접근제어자] class 클래스명 {
//	[접근제어자] [지시자] 데이터타입 필드명;	//필드 선언 - 하나의 객체가 가지는 속성값을 저장
//	[생성자함수명(변수타입 매개변수명){   }]		//생성자 선언 - 객체를 생성해주는 함수
//	[접근제어자] [지시자] 리턴데이터타입([변수타입 매개변수명]) { //메서드 - 현재 객체가 동적 활동을 정의
//		실행문장;
//	} 
//}

public class Sample1 {

		int field1;
		float field2;
		double field3;
		short field4;
		boolean field5;
		String	field6;
		
		
		Sample1(){
			
		}
	public Sample1(int field1, float field2, double field3, short field4, boolean field5, String field6) {
			super();
			this.field1 = field1;
			this.field2 = field2;
			this.field3 = field3;
			this.field4 = field4;
			this.field5 = field5;
			this.field6 = field6;
		}
	Sample1(int field1) {
		this.field1 = field1;
	}
	Sample1(int field1, float field2){
		this.field1 = field1;
		this.field2 = field2;
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
