package sec4;

public class BoxingUnBoxsingEx1 {
	public static void main(String[] args) {

		//Boxing : 기본(Primitive) -> 래퍼(Wrapper)
		//short -> Short
		//int -> Integer
		//long -> Long
		//float -> Float
		//double -> Double
		//byte -> Byte
		//char -> Character (X)
		//boolean -> Boolean
		
		//Unboxing : 래퍼(Wrapper) -> 기본(Primitive)
		//short <- Short
		//int <- Integer
		//long <- Long
		//float <- Float
		//double <- Double
		//byte <- Byte
		//boolean <- Boolean
		
		int i1 = 100;
		float f1 = 62.8f;
		
		//Boxing
		Integer int1 = new Integer(1004);
		Integer int2 = new Integer("1004");
		Integer int3 = Integer.valueOf("1004");
		Integer int4 = Integer.valueOf(i1);
		Integer int5 = new Integer(i1);
		
		Float fl1 = new Float(3.14);
		Float fl2 = new Float("3.14");
		Float fl3 = Float.valueOf("3.14");
		Float fl4 = Float.valueOf(f1);
		Float fl5 = new Float(f1);
		
		//UnBoxing
		int iv1 = int1.intValue();
		int iv2 = int2.intValue();

		float fv1 = fl1.floatValue();
		float fv2 = fl2.floatValue();
		
		System.out.println("int1 == iv1 : "+(int1 == iv1));
		System.out.println("fl1 == fv1 : "+(fl1 == fv1));
	}
}