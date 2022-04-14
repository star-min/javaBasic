package sec1;

public class Children extends Parent {
	double field3;
	Children(){ }
	Children(int field1, String field2, double field3){
		this.field1 = field1;
		this.field2 = field2;
		this.field3 = field3;	
	}
	@Override
	public void method2() {
		System.out.println("자식메서드2 입니다.");
	}
	public void method3() {
		System.out.println("자식메서드3 입니다.");
	}
}
