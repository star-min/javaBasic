package sec1;

public class ArithMetic1 {
	public static void main(String[] args) {
		//산술연산 : +, -, *, /, %
		//우선순위 : *, /, % > +, -
		//3+5*2+3/2
		int a = 20;
		int b = 7;
		System.out.println("a+b="+(a+b));
		System.out.println("a-b="+(a-b));
		System.out.println("a*b="+(a*b));
		System.out.println("a/b="+(a/b));
		System.out.println("a%b="+(a%b));
		System.out.println("김기태는 "+"잘 생긴 "+1004+"입니다.");
		//정수+정수 => 정수
		//정수+실수 => 실수
		//실수+실수 => 실수
		//문자열+숫자 => 문자열
		//숫자+숫자+문자열 => 문자열
		//7+11+"김기태" => 18김기태
	}
}