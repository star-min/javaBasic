package sec1;

import java.util.Scanner;

public class SwitchTest {

	public static void main(String[] args) {
		// 1.입금, 2.출금, 3.조회, 4.시스템 종료
		
		System.out.println("원하시는 서비스의 단축키를 입력해주세요.");
		Scanner sc = new Scanner(System.in);
		int atm = sc.nextInt();
		
		switch(atm){
			case 1 :
				System.out.println("입금을 시작합니다.");
				break;
			case 2 :
				System.out.println("출금을 시작합니다.");
				break;
			case 3 :
				System.out.println("조회를 시작합니다.");
				break;
			default :
				System.out.println("시스템을 종료합니다.");
				break;
				
		}
		

	}

}
