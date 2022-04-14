package sec2;

import java.util.Scanner;

public class Exercise07 {

	public static void main(String[] args) {
		// while문과 Scanner를 이용해서 키보드로부터 입력된 데이터로 예금, 출금, 조회, 종료 기능을 제공하는 코드를 작성해보세요.
		boolean run = true;
		
		int balance = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		
		while(run) {
			System.out.println("-----------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("-----------------------------");
			System.out.println("선택> ");
//----------------------------------------------------------------------------- 작성 코드 ---------------------------------------------------------
			int atm = scanner.nextInt();						// 스위치를 열기위한 키보드를 대입시킨 변수
			switch(atm) {
				case 1 :
					System.out.println("예금액>");
					int in = scanner.nextInt();					// 예금액을 입금받기위해 키보드를 대입시킨 변수
					balance += in;								// balance 를 통장이라고 생각하고 예금액을 대입
					break;
				case 2 :
					System.out.println("출금액>");
					int chul = scanner.nextInt();				// 위와 동일
					balance -= chul;
					break;
				case 3 :
					System.out.println("잔고>"+balance);			// 잔고확인
					break;
				default :
					run = false;
					break;										// break 문으로는 while문을 탈출하지못해 true 값을 강제로 바꿔줌
			}
// ------------------------------------------------------------------------------------------------------------------------------------------------				
		}
		System.out.println("프로그램 종료");
	}
}
