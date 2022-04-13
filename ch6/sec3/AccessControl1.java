package sec3;
import sec1.Animal;
//클래스, 필드, 생성자, 메서드
//public : 패키지가 달라도 import만 하면, 사용이 가능 -> 클래스, 필드, 생성자, 메서드
//protected : 자식 클래스에서 상속 받은 범위 안에서만 사용이 가능 -> 필드, 생성자, 메서드
//default : 같은 패키지에서만 사용이 가능 -> 필드, 생성자, 메서드
//private : 같은 클래스 내에서만 사용이 가능 -> 필드
//public > protected > default > private
//하나의 java 파일 안에 여러 개의 클래스 서술이 가능하지만, 
//public 클래스는 하나만 있어야 함 
class Data1{		
	int field1;
}
class Data2 {
	int filed2;
}
public class AccessControl1 {
	public static void main(String[] args) {
		Animal cat1 = new Animal();
	}
}