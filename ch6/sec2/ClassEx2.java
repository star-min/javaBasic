package sec2;

public class ClassEx2 {
	public static void main(String[] args) {
		Class2 obj1 = new Class2(); //객체는 동적 할당
		//Class2.cnt = 1004; (X)
		obj1.cnt = 1004;// (O)
		Class2.num = 1004; //(O)
		//obj1.num = 1004; (X)
		//Class2.method1();  (X)
		obj1.method1();	// (O)
		//obj1.method2(); (X)
		Class2.method2();  //(O)
		//static : 객체를 생성하여 활용하는 것이 아니고, 원래 클래스 그대로 활용
	}
}