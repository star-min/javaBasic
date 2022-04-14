package sec1;

import java.util.Scanner;

public class TestIFSwitch {

	public static void main(String[] args) {
		// 각 학점을 입역받고 70점을 넘으면 통과 못넘으면 떨어짐 그중 스위치로 들을것인지 물어보기
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("국어점수 입력 : ");
		int kor = sc.nextInt();
		System.out.println("수학점수 입력 : ");
		int met = sc.nextInt();
		System.out.println("영어점수 입력 : ");
		int eng = sc.nextInt();
		
		int tot = kor + met + eng;
		float avg = (tot/3.0f);
		
		int num = sc.nextInt();
		System.out.println("총점을 원하신다면 1");
		switch(num) {
			case 1 :
				System.out.println("총점을 출력합니다. : "+tot);
				break;
			case 2 :
				System.out.println("평균을 출력합니다. : "+avg);
		}
	
	}

}
