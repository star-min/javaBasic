package sec2;

import java.util.ArrayList;
import java.util.List;

class Member{
	private String uid;
	private String pw;
	private String email;
	private String tel;
	//Constructor/setter/getter 생성
	Member() { }
	public Member(String uid, String pw, String email, String tel) {
		this.uid = uid;
		this.pw = pw;
		this.email = email;
		this.tel = tel;
	}
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
}
public class ListEx4 {
	public static void main(String[] args) {
		//ArrayList를 활용하여 다섯 명의 정보를 저장하기
		List<Member> memList = new ArrayList<Member>();
		Member m1 = new Member("kkt","1234","kkt@naver.com","010-1234-1234");
		Member m2 = new Member();
		memList.add(m1);
		m2.setUid("jeong");
		m2.setPw("4321");
		m2.setTel("010-2148-1004");
		m2.setEmail("jeong@gmail.com");
		memList.add(m2);
		//.......
		System.out.println("아이디\t비밀번호\t이메일\t\t전화번호");
		for(Member m : memList) {
			System.out.print(m.getUid()+"\t");
			System.out.print(m.getPw()+"\t");
			System.out.print(m.getEmail()+"\t");
			System.out.print(m.getTel()+"\n");
		}
	}
}