package sec1;

public class IntEx {
	public static void main(String[] args) {
		//int 타입의 변수 활용
		//integer(정수) : 소숫점 이하가 없는 수
		//단정도(short=2byte), 일반(int=4byte), 배정도(long=8byte)
		int i1 = 102400;
		//short i2 = 102400; //오버플로우
		short a1 = 5120;
		int a2 = a1 * 2;	//a2를 short으로 선언시에는 오버플로우 발생되므로 int로 타입을 변경해야함
		System.out.println("i1="+i1);
		System.out.println("a1="+a1);
		System.out.println("a2="+a2);
		
		long b1 = 65530;
		//int b2 = b1 * 10;  //long 타입이 훨씬 표현범위가 크므로 더 작은 int 타입의 변수에 값을 저장못함.
		//long > int > short
	}
}