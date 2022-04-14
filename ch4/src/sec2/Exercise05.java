package sec2;

public class Exercise05 {

	public static void main(String[] args) {
		// 중첩 for문을 이용하여 방정식 4x + 5y = 60 의 모든 해를 구해서 (x,y) 형태로 출력해보세요. 단, x와 y는 10이하의 자연수 입니다.
		
		for (int x = 1; x<=10; x++) {							// 10 이하의 자연수 생성
			for (int y = 1; y<=10; y++) {						// 10 이하의 자연수 생성
				if ((4*x + 5*y)==60) System.out.println("("+x+","+y+")");		// 4*x + 5*y 가 60 인 수를 구하는 조건문
			}
		}
	}

}
