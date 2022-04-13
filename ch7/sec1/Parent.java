package sec1;

public class Parent {
	int field1;
	String field2;
	Parent(){ }
	Parent(int field1){ this.field1 = field1; }
	Parent(int field1, String field2){
		this.field1 = field1;
		this.field2 = field2;
	}
	public void method1() { System.out.println("부모메서드1");}
	public void method2() { System.out.println("부모메서드2");}
}