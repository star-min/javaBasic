package sec1;

public class Logical1 {

	public static void main(String[] args) {
		// &&, ||, !, &, |, ^, ~
		int a = 30;	//11110
		int b = 20;	//10100
		int c = 10;
		
		//32	16	 8	4	2	1		AND
		//       1   1  1   1   0   = 30 위의 숫자를 합쳣을때 30이되면 2진수
		//       1   0  1   0   0   = 20
		// xor   0	 1  0   1   0   = 10
		//
		//
		
		System.out.println("a와 b의 AND 연산 : "+(a & b));
		System.out.println("a와 b의 OR 연산 : "+(a | b));
		System.out.println("a와 b의 XOR 연산 : "+(a ^ b));
		boolean d = true;
		boolean e = true;
		boolean f = false;
		// &&(AND)연산은 입력값이 모두 참일 때만 결과가 참

		System.out.println("&& => AND 연산의 결과1 : "+(d && e));
		System.out.println("&& => AND 연산의 결과2 : "+(d && f));
		System.out.println("&& => AND 연산의 결과3 : "+(f && f));
		
		// ||(or)연산 : 어느 하나라도 입력이 참이 있으면, 참(ture)
		System.out.println("|| => or 연산의 결과1 : "+(d || e));
		System.out.println("|| => or 연산의 결과2 : "+(d || f));
		System.out.println("|| => or 연산의 결과3 : "+(f || f));
		
		// !(NOT) 연산 : 입력된 논리값을 true는 false로, false는 true로 반대로 반환
		System.out.println("원래값 :"+d+" ! => NOT 연산의 결과1 : "+(!d));
		System.out.println("원래값 :"+f+" ! => NOT 연산의 결과2 : "+(!f));
		
	}

}
