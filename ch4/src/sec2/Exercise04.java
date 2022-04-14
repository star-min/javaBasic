package sec2;

public class Exercise04 {

	public static void main(String[] args) {
//			 while문과 Math.random() 메소드를 이용해서 두 개의 주사위를 던졌을 떄 나로는 눈을 (눈1, 눈2) 형태ㅐ로 출력하고, 눈의 합이 5가 아니면 계속 주사위를 던지고,
//			 눈의 합이 5이면 실행을 멈추는 코드를 작성해보세요. 눈의 합이 5가 되는 조합은 (1,4), (4,1), (2,3), (3,2)입니다.
		int i = 0 , y = 0;
		while (i+y != 5) {								// (변수 = i + y) 로하고 while 에 (변수 == 5) 로 하려했으나 실패하여 무한루프 사용
			i = (int)(Math.random()*6)+1;
			y = (int)(Math.random()*6)+1;			//1~4까지의 난수를 생성하는 메소드사용
			System.out.println("("+i+","+y+")");
//			if((i+y)==5) {
//				System.out.println(i+","+y);
//				break;								// i+y==5 가 될경우 무한루프를 빠져나가기위해 break문 사용
//			}
		}
	}

}
