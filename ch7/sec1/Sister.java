package sec1;

public class Sister extends Parent {
	double field3;
	Sister() { }
	Sister(int field1, String field2, double field3){ 
		this.field1 = field1;
		this.field2 = field2;
		this.field3 = field3;
	}
	
	@Override
	public void method2() {	System.out.println("자매메서드2 입니다."); }
	public void method3() { }
}
