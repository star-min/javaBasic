package sec4;

public class MathEx1 {

	public static void main(String[] args) {
//		System.out.println("6.3 : "+Math.abs(6.3));
//		System.out.println("6.3 : "+Math.ceil(6.3));
//		System.out.println("6.3 : "+Math.floor(6.3));
//		System.out.println("6.3 : "+Math.rint(6.3));
//		System.out.println("6.3 : "+Math.round(6.3));
//		
//		for(int i=0;i<100;i++) {
//			System.out.println("랜덤수"+i+" : "+((int)(Math.random()*10)+1));
//		}
		for(int i=0;i<100;i++) {
			for(int y=0;y<6;y++) {
				System.out.print(((int)(Math.random()*45)+1)+"\t");
			}
			System.out.println("");
		}
	}

}
