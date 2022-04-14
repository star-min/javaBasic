package sec2;

public class ForEx1 {

	public static void main(String[] args) {
		// for(초기값;조건식;증감식) {반복실행할 문장;}
//		for(int i=1;i<=10;i++) {
//			System.out.println(i+"번째 출력중 . . . .");
//		}
//		
//		for(int i=0;i<=10;i++) {
//			if(i%2==0) {
//				continue; //건너띄기
//			}
//			System.out.println("홀수출력 "+i);
//		}
//		int sum = 0;
//		for(int i=1;i<=100;i++) {
//			System.out.println("i="+i);
//			sum+=i;
//			System.out.println("sum="+sum);
//		}
//		
		//1~100 까지의 3의 배수의 합계
		int num = 0;
		for(int i=1;i<=100;i++)
			if(i%3==0) {
				System.out.println("i : "+i);
				num+=i;
				System.out.println("num : "+num);
			}
		System.out.println("1~100 까지의 3의 배수의 합계 : "+num);

	}

}
