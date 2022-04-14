package sec2;

public class Autocasting1 {

	public static void main(String[] args) {
		byte a = 40;	//1byte
		short b = 40;	//2byte
		int c = 40;		//4byte
		long d = 40;	//8byte
		long k = 12345678907890L;		//오류나면 L
		
		short s1 = a;	//자동으로 byte -> short 자동형변환
		int i1 = a;		//자동으로 byte -> int
		long l1 = a;	//자동으로 byte -> long
		
		// byte b2 = b;	오버플로우
		int i2 = b;		//자동으로 short -> int 자동형변환
		long l2 = b;	//자동으로 short -> long 자동형변환
		
		// byte b3 = c;		오버플로우
		// short s3 = c;	오버플로우
		long l3 = c;		// 자동형변환
		
		//더 큰 type의 기억장소에 작은 크기의 데이터를 저장할수 있으며,
		//이 때 작은 크기의 데이터는 큰 크기의 타입으로 자동으로 타입이 변경
		// Autocasting = 자동형변환
		
		float e = 256.278f;
		double f = 256.278;
		double g = 23456789.234567888789278D;	//마지막에 D
		
		// float e1 = f;		오버플로우
		double d1 = e;		//자동형변환
		
		char c1 = 'G';		//2byte
		byte k1 = 120;
		System.out.println("c1= "+c1);
		System.out.println("k1= "+k1);
		
		// byte k2 = c1;	오버플로우
		// char c2 = k1;	서로 type의 성격이 달라서 (문자 = 숫자)
		int j1 = c1;		//서로 성격이 달라도 캐스팅이 되는 예외 캐스팅
		System.out.println(j1);		//G의 아스키 코드
		double d2 = l1;		//정수 -> 실수 담을수 있다(O)
		// long l4 = f;		//실수 -> 정수 담을수 없다(X)
		
		float avg = (float) (100+70+80) / 3;	//강제 캐스팅
		System.out.println("평균 : "+avg);
		

	}

}
