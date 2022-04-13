package sec1;

public class NumberFormatEx {
	public static void main(String[] args) {
		String data1 = "90";
		String data2 = "6.28";
		String data3 = "g90";
		
		try {
			System.out.println(Integer.parseInt(data1));
			System.out.println(Double.parseDouble(data2));
			System.out.println(Integer.parseInt(data3));
		} catch(NumberFormatException e) {
			System.out.println("숫자로 변환되지 않는 데이터");
			e.printStackTrace();
		} catch(Exception e) {
			System.out.println("이유를 알 수 없음");
			e.printStackTrace();
		} finally {
			System.out.println("프로그램 종료");
		}
	}
}