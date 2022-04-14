package sec1;

class C {
	static class D {
		int field1;
		static int field2;
		void method1() {}
		static void method2() {}
		
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
