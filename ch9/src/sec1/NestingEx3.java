package sec1;

class E {
	void method() {
		class F {
			F() {}
			int field1;
			void method1() { System.out.println("내부메서드1"); }
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
