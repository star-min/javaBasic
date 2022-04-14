package sec6;

public class MemberServiciExample {

	public static void main(String[] args) {
		MemberService memberService = new MemberService();
		boolean result = memberService.login("hong", "1234");
				if(result) {
					System.out.println("로그인이 되었습니다.");
					memberService.logout("hong");
				}else {
					System.out.println(("id 또는 password가 올바르지 않습니다."));
				}
	}

}
