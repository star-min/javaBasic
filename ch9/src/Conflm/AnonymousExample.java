package Conflm;

public class AnonymousExample {

	private static Anonymous anonymous;

	public static void main(String[] args) {
		Anonymous anony = new Anonymous();
		anony.field.run();
		anony.method1();
		anony.method2(
				new Vehicle() {
					@Override
					public void run() {System.out.println("트럭가 달립니다.");}
				}
				);

	}

}
