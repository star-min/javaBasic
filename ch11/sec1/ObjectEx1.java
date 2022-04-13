package sec1;

public class ObjectEx1 {
	public static void main(String[] args) {
		Object obj1 = new Object();
		Object obj2 = new Object();
		if(obj1 == obj2) {	//값만 비교
			System.out.println("동일한 객체");
		} else {
			System.out.println("다른 객체");
		}
		if(obj1.equals(obj2)) { //값과 타입 비교
			System.out.println("동일 객체");
		} else {
			System.out.println("타객체");
		}
	}
}