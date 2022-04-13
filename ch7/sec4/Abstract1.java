package sec4;
//Abstract(추상) Class : 만약, 자세한 실행내용이나 값을 미리 지정하면, 나중에 이 클래스를 상속받아
//재사용할 경우 수정내용이나  메서드의 실행 방법이나 결과를 모두 일일히 편집하거나 오버라이딩을 해야 하므로
//재사용에 어려움이 많이 발생하여, 구체적인 내용은 기술하지 않고, 두루뭉수리하게 선언만 해서 상속받는 클래스에서
//실제 사용시 여기 저기 모두 사용할 수 있도록 구체적인 내용을 기술하여 사용하게 하는 클래스
public abstract class Abstract1 {  //추상 클래스
	int field1;	//필드
	Abstract1() { }	//생성자
	abstract void method1();	//추상화 메서드
}