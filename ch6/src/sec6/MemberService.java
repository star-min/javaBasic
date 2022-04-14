package sec6;

public class MemberService {
	String name;
	String id;
	String password;
	int age;
	
	
	boolean login(String id, String password) {
		boolean result = false;
		if((id.equals("홍길동"))&&(password.equals("12345"))) {
			result = true;
		}else {
			result = false;
		}
		return result;
	}
	void logout(String id) {
		System.out.println(id+"님은 로그아웃 되었습니다.");
	}
	
}
