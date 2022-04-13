package sec2;

public class ForceCasting1 {
	public static void main(String[] args) {
		//강제캐스팅 : 더 큰 데이터를 작은 타입의 변수에 데이터를 저장
		int a = 100;
		short b = (short) a;
		byte c = (byte) a;
		
		int i1 = 65000;
		short s1 = (short) i1;
		byte b1 = (byte) i1;
		//만약, 담지 못하는 데이터를 강제캐스팅할 경우. 데이터는 왜곡된다.
		System.out.println("s1="+s1);
		System.out.println("b1="+b1);
	}
}