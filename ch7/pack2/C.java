package pack2;
import pack1.A;
//import pack1.B;    B클래스는 접한제한자가 default이므로 다른 패키지에서 접근이 불가함
class C {
	A a = new A();
	//a.field1;  - A클래스에 있는 field1은 접근제한자가 protected 이므로 같은 패키지이거나 상속관계에서만 가능
	//a.method1();
}