package Confirm;

public class MemberServiceEx {
	public static void main(String[] args) {
		MemberService memberService = new MemberService();
		boolean result = memberService.login("hang","12345");
		if(result) {
			System.out.println("로그인 되셨습니다.");
			memberService.logout("hong");
		} else {
			System.out.println("id 또는 password가 올바르지 않습니다.");
		}
	}
}