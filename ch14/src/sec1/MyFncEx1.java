package sec1;

public class MyFncEx1 {

	public static void main(String[] args) {
		Myfnc1 f1;
		f1 = () -> {
			System.out.println("Myfnc1 실행");
		};
		f1.method1();
		Myfnc2 f2;
		f2 = (x) -> {
			System.out.println(x*x);
		};
		f2.method2(8);
		Myfnc3 f3;
		f3 = () -> {
			return 1004;
		};
		System.out.println(f3.method3());
		Myfnc4 f4;
		f4 = (x) -> {
			return x*x;
		};
		System.out.println(f4.method4(9));
	}

}
