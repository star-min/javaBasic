package sec2;

public class AutoCasting1 {  //AutoCasting
	public static void main(String[] args) {
		byte a = 40;	//1byte
		short b = 40;	//2byte
		int c = 40;		//4byte
		long d = 40;	//8byte
		long k = 12345678907890L;
		
		short s1 = a;	//자동으로 byte -> short 자동형변환
		int i1 = a;		//자동으로 byte -> int 자동형변환
		long l1 = a;	//자동으로 byte -> long 자동형변환
		
		//byte b2 = b;	오버플로우
		int i2 = b;		//자동으로 short -> int 자동형변환
		long l2 = b;	//자동으로 short -> long 자동형변환
		
		//byte b3 = c;	오버플로우	int -> byte 안됨	
		//short s3 = c;	//자동으로 int -> short 안됨
		long l3 = c;	//자동형변환
		
		//더 큰 타입의 기억장소에 작은 크기의 데이터를 저장할 수 있으며,
		//이 때 작은 크기의 데이터는 큰 크기 타입으로 자동으로 타입이 변경이 됨
		
		float e = 256.278f; //4byte
		double f = 256.278;	//8byte
		double g = 23456789.234567888789278D;
		
		//float e1 = f;
		double d1 = e;	//자동 형변환
		
		char c1 = 'G';	//2byte
		byte k1 = 120;	//1byte
		System.out.println("c1="+c1);
		System.out.println("k1="+k1);
		
		//byte k2 = c1;	//크기가 달라 캐스팅이 안됨
		//char c2 = k1; //서로 성격이 달라 캐스팅이 안됨
		int j1 = c1;	//서로 성격이 달라도 캐스팅이 되는 예외 캐스팅
		System.out.println("G의 아스키코드번호 : "+j1);
	
		double d2 = l1;	//정수 -> 실수(O)
		//long l4 = f;	//실수 -> 정수(X)
		
		float avg = (float) (100+70+80) / 3; //강제 캐스팅
		System.out.println("평균 : "+avg);
	}
}