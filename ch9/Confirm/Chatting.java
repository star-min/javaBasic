package Confirm;

public class Chatting {
	void startChat(String chatId) {
		String nickName = null;
		nickName = chatId;
		Chat chat = new Chat();
		/*
		@Override	//1. Chatting과 Chat은 상속관계가 아니므로 오버라이딩할 수 없다.
		public void start() {	//2. 내부 요소는 public, private, static을 사용할 수 없다.
			while(true) {
				String inData = "안녕하세요";
				String message = "["+nickName+"] : "+inData;
				sendMessage(message);	//3. sendMessage() 메서드가 어느 클래스에 있는지 알 수 없다.
			}
		}
		*/
		chat.start();
	}
	class Chat {
		void start() { }
		void sendMessage(String message) { }
	}
	//1~3의 에러를 해결하여도 서로 null값을 전달하고, 전달받을 수 없으므로 컴파일 에러가 발생할 확률이 크다.
}

