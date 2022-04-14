package sec2;

public class WhileEx1 {

	public static void main(String[] args) {
		// while(조건식){ 반복수행문; 증감식;}
		
		//1~100 4의 배수의 합산 결과르 출력
		int y = 0;
		int i = 0;
		
		while(i<=100) {
			if(i%4==0) y+=i;
			i++;
		}
		System.out.println("y : "+y);

	}

}
