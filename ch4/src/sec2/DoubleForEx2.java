package sec2;
/*
6. for문을 이용해서 실행 결과와 같은 삼각형을 출력하는 코드를 작성해보세요
실행 결과
*
**
***
****
*****

*/
public class DoubleForEx2 {
	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {//i = 1, 2, 3, 4, 5
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}
	/*
	 n번째 줄은 n개가 출력
	 * 
	 **
	 *** 
	 ****
	 *****
	  
	 */
}