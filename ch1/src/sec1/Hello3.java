
package sec1;

import java.util.Scanner;

public class Hello3 {

	public static void main(String[] args) {
		String name;		//문자열 저장소 선언
		int age;			//정수 저장소 선언
		double height;		//실수 저장소 선언
		
		Scanner sc = new Scanner(System.in);		//키보드 생성
		System.out.println("이름 입력 : ");
		name = sc.next(); 							//키보드로 문자열을 입력받고 싶으면 next
		System.out.println("나이 입력 : ");
		age = sc.nextInt();							// 정수를 받아들이는 nextInt
		System.out.println("신장을 입력 : ");
		height = sc.nextDouble();					// 실수를 받아들이는 nextDouble
		//전체 저장한 데이터 출력
		System.out.println("너의 이름은 "+name+"이고, 나이는 "+age+"살 이고, 키는 "+height+"이야!");
		
	}

}