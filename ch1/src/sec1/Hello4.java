
package sec1;

import java.util.Scanner;

public class Hello4 {

	public static void main(String[] args) {
		// 변수 선언
		int kor, mat, eng;		// 한줄에 선언가능

		
		Scanner sc = new Scanner(System.in);	//키보드 입력할수 있게
		
		
		System.out.println("국어점수 입력 :");
		kor = sc.nextInt();
		System.out.println("수학점수 입력 :");
		mat = sc.nextInt();
		System.out.println("영어점수 입력 :");
		eng = sc.nextInt();
		
		System.out.println("당신의 총점은 "+(kor+mat+eng)+"점이며, 평균은 "+((kor+mat+eng)/3)+"점 입니다.");		//괄호를 이용하면 한줄에 가능
//		int i;
//		i = kor+mat+eng;
//		int j;
//		j = i/3;
//		
//		System.out.println("당신의 총점은 "+i+"점이며, 평균은 "+j+"점 입니다.");

	}

}