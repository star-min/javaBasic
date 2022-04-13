package sec2;
//클래스는 참조형의 자료형(타입)
public class Singleton {
	//Singleton() 생성자의 접근제어가 private이므로 현재 클래스 내부에서만 접근 가능
	//미리 생성자에 의해 객체를 만들 수 있는 구문을 먼저 제시함
	private static Singleton singleton = new Singleton(); 
	private Singleton() {}  //생성자
	int num; 
	static Singleton getInstance() {	return singleton;	}
}