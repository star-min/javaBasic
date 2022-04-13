package sec1;
//로컬 클래스 : 특정 클래스의 메서드 안에 내부 클래스를 정의하고, 객체를 만들어 실행할 수 있도록 한 클래스
class E {
	void method() { //멤버들은 public, private, static 멤버 선언 및 활용 불가
		class F {
			F() { }
			int field1;
			//static int field2;
			void method1() { System.out.println("내부메서드1"); }
			//static void method2() { }
		}
		F f = new F();
		f.field1 = 1004;
		f.method1();
	}
}
public class NestingEx3 {
	public static void main(String[] args) {
		E e = new E();
		e.method();
	}
}