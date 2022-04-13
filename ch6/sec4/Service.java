package sec4;
//애너테이션의 상세한 내용을 기술
//애너테이션(Annotation) : 컴파일러에게 미리(사전에) 알려야 할 내용을 기술 
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
		System.out.println("실행내용1");
	}
}