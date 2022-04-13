package sec2;
//예외 떠 넘기기(throws 구절) : 메서드명() throws 예외종류 { }
//만약 처리 내용이 문제가 발생하면, throws 구절을 이용하여 해당 예외(Exception)을 자바에서 처리하게 떠넘긴다.
public class Exception3 {
	public void method1() throws ClassNotFoundException {
		method2();  //처리 내용
	}
	public void method2() {
		try {
			Class cla = Class.forName("java.lang.String2");
		} catch(ClassNotFoundException e) {
			System.out.println("해당 클래스가 존재하지 않음");
			e.printStackTrace();
		} catch(Exception e) {
			System.out.println("기타 예외상황 발생");
			e.printStackTrace();			
		} finally {
			System.out.println("프로그램 종료");
		}
	}
}