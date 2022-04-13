package sec2;

public class MathRandomEx1 {
	public static void main(String[] args) {
		int cube1=0, cube2=0;
		while(cube1+cube2!=5) {
			cube1 = (int) (Math.random()*6)+1;
			cube2 = (int) (Math.random()*6)+1;
			System.out.println("("+cube1+", "+cube2+")");  //(4, 5) 
		}
	}
}