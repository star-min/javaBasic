package sec1;

public class ExtendsEx1 {

	public static void main(String[] args) {
		Parent p1;
		
		p1 = new Parent();
		p1.method1();
		p1.method2();
		
		p1 = new Children();
		p1.method1();
		p1.method2();
		
		p1 = new Sister();
		p1.method1();
		p1.method2();
		
		p1 = new Brother();
		p1.method1();
		p1.method2();

	}

}
