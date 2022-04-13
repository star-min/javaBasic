package sec2;

public class Exception2 {
	//method2()가 실행되다가 실제 실행되는 내용인 method1()이 실행되고, 만약, 예외가 발행할 경우
	//다시 method1()로 돌아와 예외를 처리하게 된다. => 예외 떠넘기기
	public static void method1() throws ClassNotFoundException {
		Class cla1 = Class.forName("java.lang.String2");
	}
	public static void method2() {
		try {
			method1();
		} catch(ClassNotFoundException e) {
			System.out.println("해당 클래스가 존재하지 않음");
			e.printStackTrace();
		} catch(Exception e) {
			System.out.println("알 수 없는 기타예외");
			e.printStackTrace();			
		} finally {
			System.out.println("프로그램 종료");
		}
	}
}