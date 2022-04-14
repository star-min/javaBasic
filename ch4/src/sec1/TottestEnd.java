package sec1;

import java.util.Scanner;

public class TottestEnd {

	public static void main(String[] args) {

		Scanner og = new Scanner(System.in);
		
		int kor, eng, met;
		System.out.println("국어 점수를 입력");
		kor = og.nextInt();
		System.out.println("영어 점수를 입력");
		eng = og.nextInt();
		System.out.println("수학 점수를 입력");
		met = og.nextInt();
		
		int tot = (kor+eng+met);	// 총합을 변수 tot에 대입
		
		float avg = (tot/3f);			// 평균을 변수 avg에 대입
		
		String hap, jang;			// 합격여부 를 저장할 변수 선언
		
		if (kor>=95 && eng>=95 && met>=95) {
			jang = "수석 장학생";
		} else if(kor>=95 || eng>=95 || met>=95) {
			jang = "과목 장학생";
		} else {
			jang = "일반 학생";
		}
		
		hap = (avg>=70) ? "합격" : "불합격";

	}

}
