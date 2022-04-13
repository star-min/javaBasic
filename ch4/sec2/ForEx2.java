package sec2;

import java.util.Scanner;

public class ForEx2 {
	public static void main(String[] args) {
		//for의 무한루프 : 항상 조건이 만족되어 계속 끝이 없이 반복수행하게됨
		int i=0, sum=0;
		for(;;) {
			i++;		//카운트 변수
			if(i>10) break;
			sum+=i;
		}
		
		sum=0;
		for(int a=1;;) {
			if(a>10) break;
			sum+=a;
		}
		
		sum=0;
		for(int b=1;b>0;b++) {
			if(b>10) break;
			sum+=b;
		}
		
		Scanner sc = new Scanner(System.in);
		
		int c = 0;
		sum = 0;
		for(;;) {
			System.out.println("입금액 입력 : ");
			c = sc.nextInt();
			if(c<0) break;
			sum+=c;
		}
		System.out.println("총금액 : "+sum);
	}
}