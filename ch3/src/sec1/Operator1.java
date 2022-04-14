package sec1;

public class Operator1 {

	public static void main(String[] args) {
		// 연산자
		// 산술연산자	: +, - ,* ,/, %
		// 논리연산자  : &&(and), ||(or), !(not), &(이진수and), |(이진수or)
		// 비교연산자  : >, >=, <, <=, ==, !=
		// 대입연산자  : =, +=, -=, *=, /=
		// 증감연산자  : ++, --
		// 비트연산자 : &, | ^, >>, <<, >>>, (<<< (X 이런건 없음))
		// 입력 및 비교하는 개(항)수 : 단항, 이항, 삼항
		// a = true;
		// b = !a; = 단항
		// a = 20;
		// b = 30;
		// c = a + b; = 이항
		// 비교식 ? 참 : 거짓 = 삼항
		int a = 20;
		int b = 30;
		String pass = a > b ? "a가 더 크다" : "b가 더 크다";		//삼항
		System.out.println("비교 결과 : "+pass);
		boolean c = true;
		System.out.println("c의 반대 : "+(!c));				//단항
		int res = a + b;
		System.out.println("a+b= "+res);
		// 연산자의 우선순위 : 증감 > 산술 > 비교 > 논리 > 대입
		// a>b &&(두가지 모두 만족할때) b>c : a가 b보다 크고, b가 c보다 클때
		// 증감연산자와 산술 연산자는 숫자 아니면 문자가 결과값임
		// 비교연산자와 논리연산자는 true, false인 논리값이 나옴
		
	}

}
