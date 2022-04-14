package sec1;

import java.util.Scanner;

public class Tottest {

	public static void main(String[] args) {
		// 각 점수를 입력받은 뒤에 총합, 평균, 합격여부, 학점 를 출력
		// 합격점수는 70점 이상
		
		
		Scanner og = new Scanner(System.in);
		
		int kor, eng, met;
		System.out.println("국어 점수를 입력");
		kor = og.nextInt();
		System.out.println("영어 점수를 입력");
		eng = og.nextInt();
		System.out.println("수학 점수를 입력");
		met = og.nextInt();
		
		int tot = (kor+eng+met);	// 총합을 변수 tot에 대입
		
		int avg = (tot/3);			// 평균을 변수 avg에 대입
		
		String hap, jang;			// 합격여부 를 저장할 변수 선언
		
		if (kor>=95 && eng>=95 && met>=95) {
			jang = "수석 장학생";
		} else if(kor>=95 || eng>=95 || met>=95) {
			jang = "과목 장학생";
		} else {
			jang = "일반 학생";
		}
		
		hap = (avg>=70) ? "합격" : "불합격";	// 한줄로 하는게 나을것같아서 삼항으로 만듬
		
		String jum = "";
		
		if (avg>=90) {
			if (avg>=98) {
				jum = "A+";
			}else if (avg>=94) {
				jum = "A";
			}else {
				jum = "A-";
			}
		} else if (avg>=80) {
			if (avg>=88) {
				jum = "B+";
			}else if (avg>=84) {
				jum = "B";
			}else {
				jum = "B-";
			}
		}else if (avg>=70) {
			if (avg>=78) {
				jum = "C+";
			}else if (avg>=74) {
				jum = "C";
			}else {
				jum = "C-";
			}
		}
		
		
		System.out.println("총점수 : "+tot+" 입니다.");
		System.out.println("평균 : "+avg+" 입니다.");
		System.out.println("합격 여부 : "+hap+" 입니다.");
		System.out.println("장학 여부 : "+jang+" 입니다.");
		if (avg>=70) {
			System.out.println("학점은 : "+jum+" 입니다.");
		}
		System.out.println("수고하셧습니다.");



	}

}
