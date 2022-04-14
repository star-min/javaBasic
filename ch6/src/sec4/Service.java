package sec4;

public class Service {
	@Alim
	public void method1() {
		System.out.println("실행내용1");
	}
	@Alim("*")
	public void method2() {
		System.out.println("실행내용2");
	}
	@Alim(value="#", number=20)
	public void method3() {
		System.out.println("실행내용3");
	}
}
