package sec1;

public class ExceptionEx1 {
	public static void main(String[] args) {
		int i;
		int a = 20;
		int[] arr = {10,20,30};
		String b = "김성민";
		try {
			System.out.println(Integer.parseInt(b));
			System.out.println(a / 0);
		} catch(NumberFormatException e) {
			System.out.println("정수로 바꿀 수 없는 데이터 입니다.");
			e.printStackTrace();
		} catch(ArithmeticException e) {
			System.out.println("0으로 나누려고 시도하였음");
			e.printStackTrace();
		} catch(Exception e) {
			e.printStackTrace();
		}

	}

}
