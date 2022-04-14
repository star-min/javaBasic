package sec2;

public class SingletonEx1 {

	public static void main(String[] args) {
//		Singleton single = new Singleton();
		Singleton single = Singleton.getInstance();	
		Singleton single2 = Singleton.getInstance();
		single.num = 1004;
		if(single==single2) {
			System.out.println("single == single2");
		}else {
			System.out.println("single != single2");
		}
		System.out.println(single2.num);
		single2.num = 2008;
		System.out.println(single.num);
	}
}
