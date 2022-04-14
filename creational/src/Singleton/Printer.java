package Singleton;
//Singleton : 인스턴스를 한 번만 생성하여 메모리에 저장하여 사용함으로써 하나의 인스턴스를 보장하는 패턴
public class Printer {
	private static Printer printer = new Printer();
	private static int count = 0;

	private Printer(){}

	public static Printer getInstance() {
		return printer;
	}

	public synchronized static void print(String input) {
		count++;
		System.out.println(input + "count : "+ count);
	}
}
