package sec2;

import java.util.ArrayList;
import java.util.List;

class Member{
	private String uid;
	private String pw;
	private String email;
	private String tel;
	public Member() {}
	public Member(String uid, String pw, String email, String tel) {
		super();
		this.uid = uid;
		this.pw = pw;
		this.email = email;
		this.tel = tel;
	}
	public String getUid() {return uid;}
	public void setUid(String uid) {this.uid = uid;}
	public String getPw() {return pw;}
	public void setPw(String pw) {this.pw = pw;}
	public String getEmail() {return email;}
	public void setEmail(String email) {this.email = email;}
	public String getTel() {return tel;}
	public void setTel(String tel) {this.tel = tel;}
	
}
public class ListEx4 {
	public static void main(String[] args) {
		List<Member> list = new ArrayList<Member>();
		Member mb = new Member();
		mb.setUid("zxzx00262");
		mb.setPw("1234");
		mb.setEmail("zxzx00262@gmail.com");
		mb.setTel("010-5136-1234");
		list.add(mb);
		
		Member mb2 = new Member();
		mb2.setUid("zxzx00272");
		mb2.setPw("1234");
		mb2.setEmail("zxzx00272@gmail.com");
		mb2.setTel("010-7136-1234");
		list.add(mb2);
		
		Member mb3 = new Member();
		mb3.setUid("zxzx00282");
		mb3.setPw("1234");
		mb3.setEmail("zxzx00282@gmail.com");
		mb3.setTel("010-9136-1234");
		list.add(mb3);
		
		Member mb4 = new Member();
		mb4.setUid("zxzx00292");
		mb4.setPw("1234");
		mb4.setEmail("zxzx00292@gmail.com");
		mb4.setTel("010-9236-1234");
		list.add(mb4);
		
		Member mb5 = new Member();
		mb5.setUid("zxzx00202");
		mb5.setPw("1234");
		mb5.setEmail("zxzx00202@gmail.com");
		mb5.setTel("010-5626-1234");
		list.add(mb5);
		
		System.out.println("id\t\tpw\t\tEmail\t\tTel\t\t");
		for(Member member : list) {
			System.out.print(member.getUid()+"\t");
			System.out.print(member.getPw()+"\t");
			System.out.print(member.getEmail()+"\t");
			System.out.print(member.getTel()+"\n");
		}
	}

}
