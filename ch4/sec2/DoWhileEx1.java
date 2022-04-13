package sec2;

public class DoWhileEx1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		while(a>=20) {
			a++;
			System.out.println(a);
		}
		
		//do { 실행문장; } while(조건식);
		int b=10;
		do {	//최소 1회 실행을 보장한다.
			b++;
			System.out.println(b);
		} while(b>=20);
	}
}