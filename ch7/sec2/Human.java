package sec2;

public class Human {
	public String name;
	public String jumin;
	public int age;
	public final static int EYE = 2;  
	Human(){ this("kim"); }
	Human(String name){ this(name, "891214-2531119"); }
	Human(String name, String jumin){ this(name, jumin, 34); }
	Human(String name, String jumin, int age){ 
		this.name = name; 
		this.jumin = jumin;
		this.age = age;
	}
	public void method1() {
		System.out.println("인간 객체입니다.");
	}
	public final void method2() { //final 메서드는 자식 클래스에서 오버라이딩을 할 수 없게 지정
		System.out.println("두 개의 눈을 가진 사람입니다.");
	}
}