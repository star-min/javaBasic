package sec3;

public class CarEx2 {
	public static void main(String[] args) {
		Car car1 = new Car();
		for(int i=1;i<60;i++) {
			int errorTire = car1.run();
			switch(errorTire) {
				case 1:
					System.out.println("앞왼쪽 타이어 교체~!");
					car1.frontLeftTire = new KumhoTire("앞왼쪽");
					break;
				case 2:
					System.out.println("앞오른쪽 타이어 교체~!");
					car1.frontRightTire = new KumhoTire("앞오른쪽", 30);
					break;
				case 3:
					System.out.println("뒤왼쪽 타이어 교체~!");
					car1.frontLeftTire = new MichelinTire("뒤왼쪽");
					break;
				case 4:
					System.out.println("뒤오른쪽 타이어 교체~!");
					car1.frontRightTire = new HankookTire("뒤오른쪽");
					break;
			}
			System.out.println("-------------------------------");
		}
		Tire tire0 = new Tire("그냥타이어", 50);
		Tire tire1 = new KumhoTire("금호타이어");
		Tire tire2 = new MichelinTire("미쉐린타이어");
		Tire tire3 = new HankookTire("한국타이어");
		MichelinTire tire4 = new MichelinTire("미쉐린타이어");
		//객체명 instanceof 클래스명 : 특정 클래스로 부터 만들어진 인스턴스인지 비교 
		System.out.println("tire0는 Tire 클래스로 부터 만들어진 인스턴스 인가 ? "+(tire0 instanceof Tire));
		System.out.println("tire1는 Tire 클래스로 부터 만들어진 인스턴스 인가 ? "+(tire1 instanceof Tire));
		System.out.println("tire4는 Tire 클래스로 부터 만들어진 인스턴스 인가 ? "+(tire4 instanceof Tire));
		System.out.println("tire4는 MichelinTire 클래스로 부터 만들어진 인스턴스 인가 ? "+(tire4 instanceof MichelinTire));
		//System.out.println("tire4는 Hankook 클래스로 부터 만들어진 인스턴스 인가 ? "+(tire4 instanceof HankookTire));
		
		//자동 형변환
		Tire tire6 = tire4;
		//부모 클래스로 부터 만드는 인스턴스에는 자식 클래스로 부터 만든 인스턴스 내용을 대입할 수 있도록 자동으로 형변환
		
		//강제 형변환	
		//자식 클래스로 부터 만드는 인스턴스는 부모 클래스로 부터 만든 인스턴스 내용을 대입할 수 없기 때문에
		//부모 클래스로 부터 만든 인스턴스 앞에 (자식클래스명) 을 붙여 강제 형변환을 할 수 있음. 
		//KumhoTire tire7 = tire0;   (X) 형변환이 되지 않음
		KumhoTire tire7 = (KumhoTire) tire0;  //(O) 자동형변환이 되지 않아 강제형변환
		
		
		//※ 자식 클래스로 만들어진 인스턴스는 부모 클래스로 만들어진 인스턴스를 대입시킬 수 없으므로 강제 형변환이 필요하며
		//부모 클래스로 만들어진 인스턴스는 자식 클래스로 만들어진 인스턴스를 대입시킬 경우 자동 형변환이 된다.
		//강제 형변환
		//double a = (float) 10 / 3;
		
	}
}
