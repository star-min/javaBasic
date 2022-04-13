package sec2;
//super() : 부모 생성자 호출
//this() : 현재 클래스의 생성자 호출
//super.필드명 : 부모의 필드
//this.필드명 : 현재 클래스의 필드
//super.메서드명() : 부모의 메서드를 호출
//this.메서드명() : 현재 클래스의 메서드 
public class Student extends Human {
	public String no;
	public String part;
	Student(){ }
	Student(String name, String jumin, int age, String no, String part){
		super(name, jumin);	//부모의 생성자 -> super(매개변수1, 매개변수2)
		super.age = age;	//부모의 필드 -> super.필드명
		//super(name, jumin, age);
		this.no = no;
		this.part = part;
	}
	public void method1() {
		System.out.println("학생 객체입니다.");
	}
//
//	public void method2() {
//		super.method1();
//	}
	public void method3() {
		this.method1();
	}
}
