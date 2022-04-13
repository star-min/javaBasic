package sec2;
//정적 요소(정적 필드, 정적 메서드)
//정적 <- 지시자
public class Class2 {
	int cnt;
	static int num;
	public void method1() {
		System.out.println("여기는 동적 메서드입니다.");
	}
	static public void method2() {
		System.out.println("여기는 정적 메서드입니다.");
	}
}