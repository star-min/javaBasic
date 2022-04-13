package Confirm;

public class TryCatchFinallyEx {
	public static void main(String[] args) {
		String[] strArray = {"10","2a"};
		int value = 0;
		for(int i=0;i<=2;i++) {
			try {
				value = Integer.parseInt(strArray[i]);
			} catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("인덱스 초과");
				e.printStackTrace();
			} catch(NumberFormatException e) {
				System.out.println("숫자 변환 불가");
				e.printStackTrace();
			} catch(Exception e) {
				System.out.println();
				e.printStackTrace();
			} finally {
				System.out.println(value);
			}
		}
	}
}