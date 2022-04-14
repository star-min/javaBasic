package sec2;

public class ForEx2 {

	public static void main(String[] args) {
		// for의 무한루프 : 항상 조건이 만족되어 계속 끝이 없이 반복수행하게됨
		int i=0, sum=0;
		for(;;) {
			i++;
			if(i>=10) break;
			sum+=i;
		}
		
	}

}
