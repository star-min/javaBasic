package JangIs5;

import java.util.Scanner;

public class Exercise09 {

	public static void main(String[] args) {
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner scanner = new Scanner(System.in);
		int max = 0, tot = 0, count = 0;								//가장높은점수, 총점 , 학생수
		double avg = 0.0;							//평균
		
		while(run) {
			System.out.println("------------------------------------------------");
			System.out.println("1.학생수입력 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("------------------------------------------------");
			System.out.println("선택> ");
			
			int selectNo = scanner.nextInt();
			
			if(selectNo == 1) {
				System.out.println("학생수입력 : ");
				studentNum = scanner.nextInt();
				scores = new int[studentNum];
			} else if(selectNo == 2) {
				System.out.println("점수입력 : ");
				for(int i=0;i<scores.length;i++) {
					int jum = scanner.nextInt();
					scores[i]+= jum;
				}
			} else if(selectNo == 3) {
				for(int y=0;y<scores.length;y++) {
					System.out.println("scores["+y+"] :"+scores[y]);
				}
			} else if(selectNo == 4) {
				for(int j=0;j<scores.length;j++) {		//가장높은점수
					if(max<scores[j]) max = scores[j];
					count = scores.length;				//학생수
					tot += scores[j];					//총점
					avg = (double)tot/count;			//평균
				}
				System.out.println("최고 점수 : "+max);
				System.out.println(count);
				System.out.println("평균 점수 : "+avg);
			} else if(selectNo == 5) {
				run = false;
			}
		}
		System.out.println("프로그램 종료");
	}

}
