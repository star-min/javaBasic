package sec1;		//중첩 클래스
class A {	//외부 클래스
	int item1;
	static int item2;
	void function1() { System.out.println("외부클래스 일반 메서드"); }
	static void function2() { System.out.println("외부클래스 정적 메서드"); }
	class B {	//내부 클래스 : 정적 멤버를 둘 수 없음
		B() { }	//내부 생성자
		int field1;	//내부 필드
		void method1() { System.out.println("내부클래스 메서드");}	//내부 메서드
		//static int field2; //static void method2() { }  -  (X)
	}
}
public class NestingEx {
	public static void main(String[] args) {
		A a = new A();	//외부 멤버의 접근 및 호출
		System.out.println(a.item1);
		System.out.println(A.item2);
		a.function1();
		A.function2();
		A.B b = a.new B();	//내부 멤버의 접근 및 호출
		System.out.println(b.field1);
		b.method1();
	}
}