package Confirm;

public class ActionExample {

	public static void main(String[] args) {
		Action action = new Action() {
			public void work() {System.out.println("복사를합니다.");}
		}; //익명의 클래스
		
		action.work();
	}

}
