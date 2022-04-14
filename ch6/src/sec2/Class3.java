package sec2;

public class Class3 {
	int field1;
	void method1() {}
	static int field2;
	static void method2() {}
	
	static {
		//field1 = 100; X
		//method1(); 	X
		field2 = 100;
		method2();
	}
}
