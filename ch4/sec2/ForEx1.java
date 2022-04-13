package sec2;

public class ForEx1 {
	public static void main(String[] args) {
		//for(초기값;조건식;증감식) { 반복실행할문장; }
		for(int i=1;i<=10;i++) { System.out.println(i+"번째 ---------------------"); }
		//	(1)		(2)	 (3)		(4)
		
		//(1)은 처음 한 번만 실행
		//(2) 실행
		//(4) 실행
		//(3) 실행
		//(2) 실행
		//(4) 실행
		//(3), (2), (4) 를 (2)조건이 만족하는 동안 반복 ,.....	
		for(int i=0;i<=10;i++) {
//			if(i % 2 == 1) {	//홀수일 때 수행 
//				System.out.println("i="+i);
//			}
			if(i % 2 == 0) { //짝수일 경우 건너띄기
				continue;	//건너띄기
			}
			System.out.println("i="+i);
		}
		for(int i=1;i<=10;i+=2) { //2씩 증가시켜 일을 수행
			System.out.println("i="+i);
		}
		//i++,i+=1,sum=sum+i,sum+=i
		//1+2+3+4...~98+99+100까지의 합계
		int sum = 0;
		for(int i=1;i<=100;i++) {
			//System.out.println("i="+i);
			sum+=i;	//sum=sum+i
			//System.out.println("sum="+sum);
			//i=0		1	2	3	4	5	6
			//sum=0		1	3	6	10	15	21...
		}
		System.out.println("1~100 합계 : "+sum);
		
		//1~100 까지 3의 배수의 합계를 구하여 출력
		sum = 0;
		for(int a=0;a<=100;a+=3) {
			sum+=a;
		}
		System.out.println("1~100 3의 배수의 합계1 : "+sum);
		
		sum = 0;
		for(int b=0;b<=100;b++) {
			if(b % 3 == 0) {
				sum+=b;
			}
		}
		System.out.println("1~100 3의 배수의 합계2 : "+sum);
		
		sum=0;
		for(int c=0;c<=100;c++) {
			if(c % 3 != 0) {
				continue;
			}
			sum+=c;
		}
		System.out.println("1~100 3의 배수의 합계3 : "+sum);
		
		for(int d=30;d>=1;d--) {	//역For
			System.out.println(d);
		}
	}	
}