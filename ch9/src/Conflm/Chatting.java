package Conflm;

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
}

