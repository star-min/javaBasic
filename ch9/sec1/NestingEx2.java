package sec1;
//정적 멤버 클래스 : 중첩 클래스의 내부 클래스가 static으로 선언되는 경우 그 해당 멤버도 static으로 선언이 가능
class C {
	static class D {
		int field1;
		static int field2;
		void method1() { }
		static void method2() { }
	}
}
public class NestingEx2 {
	public static void main(String[] args) {
		C.D d = new C.D();
		d.field1 = 1004;
		C.D.field2 = 0x2C8;
		d.method1();
		C.D.method2();
	}
}