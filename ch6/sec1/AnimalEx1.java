package sec1;

public class AnimalEx1 {
	public static void main(String[] args) {
		Animal cat1 = new Animal("고양이");
		Animal dog1 = new Animal("강아지");
		Animal bird1 = new Animal("앵무새");
		bird1.setType("조류");
		bird1.setLegs(2);
		bird1.setWings(2);
		Animal bird2 = new Animal("닭");
		bird2.setType("조류");
		bird2.setLegs(2);
		bird2.setWings(2);		
		cat1.running(cat1.getName());
		bird2.data = 10;  //data 필드가 default이므로 같은 패키지에 접근 가능
		//기본형은 반드시 초기화가 되어야함, 참조형은 초기화를 하지 않아도 된다.
	}
}