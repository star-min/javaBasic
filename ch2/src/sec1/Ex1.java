package sec1;


public class Ex1 {		// 클래스 이름

	public static void main(String[] args) {
		// 변수 : 주기억장치 안에 데이터를 넣는 공간 하나로 개발자가 이름을 부여하여 필요시 데이터를 가져갈 수 있도록
		// 하기 위한 기억장소의 이름
		
		String name;		// 변수 선언시에는 -> 자료형 변수명;
		// 기본 자료형(Primitive)
		name = "김성민";		// 변수의 초기화
		char pass = 'y';	// 변수의 선언과 초기화
		byte data1;
		boolean data2;
		short Su1;
		int su1;
		long su2;
		float su3;
		double su4;
		/*
		 그러므로 변수란? 하나의 값을 저장할 수 있는 메모리 공간의 이름이다.
		 변수명의 명명 규칙
		- 첫글자는 영문으로 시작하는 것이 원칙이나, 특수묹자 중에서 $(달러) 또는 _(언더스코어)로 시작할 수는 있다.
		- 영문 대소문자는 엄격히 구분되며, 변수명은 관례상 소문자로 쓰며, 클래스 이름은 대문자로 시작한다.
		- 자바의 예약어는 사용할수 없으나, 다른 문자나 숫자를 혼용하여 사용하기도 한다.
		- 변수명이나 클래스명은 관례상 그 용도를 쉽게 알 수 있게 사용을 해야한다.
		- 변수명 이나 클래스명, 메서드명 등은 여러단어를 연결하여 선언할 경우는 언더스코어방식 또는 카멜방식을 활용한다.
		(여러단어를 이어서 선언할 경우 판독하기 어려움
				kimseongmingohome X
				kimseongminGoHome O : 카멜 방식
				kimseongmin_go_home O : 언더 스코어)
		 예약어 : 선언자 (priveate, public, protected, static, final),
		 기본 자료형 선언 키워드 (char, byte, boolean, short, int, long, float, double)
		 참조형 선언 키워드 (Char, Byte, Boolean, Integer, Long, Float, Double)
		 클래스 관련 선언 키워드 (class, abstract, Inteface, extends, implements, enum)
		 객체 관련 키워드 (new, this, super, instanceof, null)
		 명령문 키워드 (if, else, switch, cass, for, while, break, continue)
		 기타 키워드 ( true, false, vois, return, try, catch, finally, throw, throws 등
		 */
		// 리터럴 : 변수에 저장되는 값, 문자, 문자열, 정수(단,일,배), 실수(단,배), 2진수, 8진수, 16진수
		String nick_name = "호랑말코";
		// 오류 : String nick1 = 'k';
		char nick1 = 'k';
		byte a = -128 ; 	// 1byte = 8bit => -128~127 , Max 256, 언더플로우 = 담을수 있는것보다 더 작아서 나는 오류 , 오버플로우 = 담을수 있는것을 초과해서 나는 오류
		short c = 32767; 	// 2byte = 16bit => -32768 ~ 32767
		int b = 250;		// 4byte = 32bit => -2,147,483,648 ~ 2,147,483,647
		long d = 450; 		// 8byte = 64bit => -2 63승 ~ (2 63승 -1)
		// 부동소수점수 = 실수
		// 실수는 부호부, 지수부, 가수부로 나누어 저장함, 따라서 아주 작은 수나 아주 큰 수 표현에 적합
		float e = 36.245f;	// 4byte = 32bit 부동소수점수 는 뒤에 f를 붙여주어야 한다.
		double f = 36.245d;	// 8byte = 64bit
		boolean g = true;	// 1byte = 8bit  true, false
		char h = 'k';		// 2byte = 16bit
		/*
		저장 크기 단위
		1024byte(2의 10승) = 1KB
		1024KB = 1MB
		1024MB = 1GB
		1024GB = 1TB
		1024TB = 1PB
		1024PB = 1EB
		*/
		// String i = 256; type 오류
		// int j = "김성민"; type 오류
		int k1 = 0b1101; // 2진수 리터럴
		int k2 = 0123;	 // 8진수 리터럴
		int k3 = 0x123;	 // 16진수
		System.out.print("k1="+k1+", k2="+k2+", k3="+k3);
	}

}
