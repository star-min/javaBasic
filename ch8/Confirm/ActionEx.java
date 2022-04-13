package Confirm;

public class ActionEx {
	public static void main(String[] args) {
		Action action = new Action() {	//익명의 클래스로 익명의 객체 생성 -> action
			public void work() { System.out.println("복사를 합니다."); }
		};
		action.work();
	}
}