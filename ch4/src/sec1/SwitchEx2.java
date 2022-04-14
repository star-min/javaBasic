package sec1;

import java.util.Scanner;

public class SwitchEx2 {

	public static void main(String[] args) {
//		 본인의 월을 숫자 정수로 입력하면, 해당하는 월의 탄생석을 출력하라 mode
//		1월 : 석류석
//		2월 : 자수정
//		3월 : 남옥
//		4월 : 다이아몬드
//		5월 : 비취
//		6월 : 진주
//		7월 : 홍옥
//		8월 : 감람석
//		9월 : 청옥
//		10월 : 오팔
//		11월 : 황옥
//		12월 : 터키석
		System.out.println("몇월에 태어낫는지 적어주세요.");
		Scanner rg = new Scanner(System.in);
		String mode = rg.nextLine();
		
		switch(mode){
			case "1월":
				System.out.println("석류석");
				break;
			
			case "2월":
				System.out.println("자수정");
				break;
			
			case "3월":
				System.out.println("남옥");
				break;
			
			case "4월":
				System.out.println("다이아몬드");
				break;
			
			case "5월":
				System.out.println("비취");
				break;
			
			case "6월":
				System.out.println("진주");
				break;
			
			case "7월":
				System.out.println("홍옥");
				break;
			
			case "8월":
				System.out.println("감람석");
				break;
				
			case "9월":
				System.out.println("청옥");
				break;
				
			case "10월":
				System.out.println("오팔");
				break;
				
			case "11월":
				System.out.println("황옥");
				break;
				
			default:
				System.out.println("터키석");
				break;
			
			
		}
		

	}

}
