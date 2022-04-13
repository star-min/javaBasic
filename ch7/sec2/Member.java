package sec2;

public final class Member extends Human {  //final 클래스란? 더 이상 상속해줄 수 없는 클래스임
	String id;
	String pw;
	public void join() {
		System.out.println("회원 가입");
	}
	public void login() {
		System.out.println("로그인");
	}
	public void modify() {
		System.out.println("회원 정보 수정");
	}
}
