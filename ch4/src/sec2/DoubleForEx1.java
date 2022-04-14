package sec2;

/*5. 중첩 for문을 이용하여 방정식 4x + 5y = 60의 모든 해를 구해서
(x, y) 형태로 출력해보세요. 단, x와 y는 10 이하의 자연수입니다.*/
public class DoubleForEx1 {
	public static void main(String[] args) {
		//x -> 1	2	 3   ~  10
		//y -> 1~10 1~10 1~10	1~10
		for(int x=1;x<=10;x++) { //5
			for(int y=1;y<=10;y++) { //1~10
				if(4*x + 5*y == 60) System.out.println("("+x+", "+y+")");
			}
		}
	}
}