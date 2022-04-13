package sec2;

public class Exception5 {
	public static void main(String[] args) throws ClassNotFoundException {
		findClass();
	}
	public static void findClass() throws ClassNotFoundException{
		Class cla = Class.forName("java.lang.Math");
	}
}