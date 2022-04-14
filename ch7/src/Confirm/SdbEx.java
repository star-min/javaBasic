package Confirm;

public class SdbEx {
	private static void printSound(Sdb sdb) {
		
		System.out.println(sdb.sound());
	}
	public static void main(String[] args) {
		
		printSound(new Cat());
		printSound(new Dog());

	}

}
