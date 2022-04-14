package sec2;

public class Exercise06 {

	public static void main(String[] args) {
		// for 문을 이용해서 실행 결과와 같은 삼각형을 출력하는 코드를 작성해보세요
//		*
//		**
//		***
//		****
//		*****
		String y = "";						// 별모양을 저장할 변수 생성
		for(int i=0; i<5; i++) {			// 5번 반복하는 반복문
			y += "*";						// 한번 돌때마다 별하나씩 추가
			System.out.println(y);			// 출력
		}
	}

}
