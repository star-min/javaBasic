package sec1;
//[Help]->[Install new Software]
//[Add] -> name:exERD, url:http://exerd.com/update/exerd/3.x/
//[Add] -> name:objectaid, url:http://download.eclipse.org/tools/gef/updates/releases/
public class BreadEx1 {
	//croissant, cream, bean
	public static void main(String[] args) {
		Bread cream1 = new Bread("크림빵", "생크림", 120, 1500, 10);
		Bread cream2 = new Bread("크림빵", "슈크림", 110, 1600);
		//각 단팥빵, 크로와상, 크림빵의 객체를 생성자의 매개변수의 개수를 달리하여 두 개씩 만들고,
		//해당 제품명과 금액을 처리한 후 출력
		System.out.println(cream1.getName());
	}
}