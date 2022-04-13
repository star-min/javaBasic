package sec2;

public class Calculator {
	double areaCircle(double r) {
		System.out.println("입력하신 반지름 : "+r+"의 원의 면적을 구합니다.");
		return 3.14159*r*r;
	}
}
/*
현재 클래스인 Calculator를 상속하여 Computer 클래스를 만들되
areaCircle(double r)을 구현 내용을
Math.PI*r*r로 반환될 수 있도록
메서드를 변환하라.  => 오버라이딩
*/
class Computer extends Calculator{
	@Override
	double areaCircle(double r) {
		System.out.println("입력하신 반지름 : "+r+"의 원의 면적을 구합니다.");
		return Math.PI*r*r;
	}
}