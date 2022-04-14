package sec4;

public class BoxingUnBoxsingEx1 {

	public static void main(String[] args) {
		
		int i = 100;
		float f = 3.14f;
		
		Integer int1 = new Integer(1004);
		Float fl1 = new Float(3.1683);
		
		int iv1 = int1.intValue();
		float fv1 = fl1.floatValue();
		
		System.out.println("int1 == iv1 : "+(int1==iv1));
		System.out.println("fl1 == fv1 : "+(fl1 == fv1));
	}

}
