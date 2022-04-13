package pack2;
import pack1.A;
public class D extends A { //부모 클래스 중에 접근제한자가 protected인 경우 생성자를 활용하여 접근해야 함
	D(){
		super();
		this.field1 = 20;
		this.method1();
	}
}