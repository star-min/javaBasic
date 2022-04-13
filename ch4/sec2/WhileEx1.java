package sec2;

public class WhileEx1 {

	public static void main(String[] args) {
		//카운트변수초기화; while(조건식) { 반복수행문; 증감식; }
		//조건과 결과누적, 카운트변수의 증감식 위치에 따라 그 결과가 완전 달라짐
		int i = 0, sum = 0;
		while(i<10) {
			i++;	//9 -> 10
			sum+=i;
		}
		System.out.println("sum="+sum);
		
		i = 0;			//처음 한번 만 실행
		sum = 0;		//처음 한번 만 실행
		while(i<=10) {		//(2) 0->0, 1->1, 2->3 
			sum+=i;		//(3)
			i++;		//(4)
		}
		
		//1~100 4의 배수의 합산결과를 출력
		int a = 0;
		sum = 0;
		while(a<=100) {
			sum+=a;		//...+96+100
			a+=4;		//104
		}
		System.out.println("합산 결과 : "+sum);
		
		a = 0;
		sum = 0;
		while(a<100) {
			a+=4;		//100
			sum+=a;		//...+96+100
		}
		System.out.println("합산 결과 : "+sum);

		a = 0;
		sum = 0;
		while(a<100) {
			a++;		//100
			if(a % 4 == 0) sum+=a;		//...+96+100
		}
		System.out.println("합산 결과 : "+sum);
		
		int b = 20;		//한 번도 실행하지 못하는 조건임
		while(b<10) {
			b++;
			System.out.println("b="+b);
		}
		
		int c = 20;		//카운트변수가 감소
		while(c>=10) {
			System.out.println("c="+c);  //20~10
			c--;	//19
		}
	}
}
