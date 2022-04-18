package sec2;

import java.util.Date;
import java.util.List;
import java.util.Vector;

class Board {
	private String subject;
	private String content;
	private String writer;
	private String regdate;
	public Board() {}
	public Board(String subject, String content, String writer, String regdate) {
		this.subject = subject;
		this.content = content;
		this.writer = writer;
		this.regdate = regdate;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getRegdate() {
		return regdate;
	}
	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}
	
	
	
}
public class ListEx2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Board> bdList = new Vector<Board>();
		Date today = new Date();
		Board bd = new Board();
		bd.setSubject("제목6");
		bd.setContent("내용6");
		bd.setWriter("김성민");
		bdList.add(bd);
//		bdList.add(new bd("제목1","내용1","신형만",today));
		
	}

}
