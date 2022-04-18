package sec2;

import java.util.Date;
import java.util.List;
import java.util.Vector;
//Vector : List의 종류이며, ArrayList와 동일한 자료구조, 차이점은 쓰레드에 적용하여, 하나의 객체 처리가 모두 끝나면,
//다른 쓰레드의 객체 처리를 하기 위해 활용
class Board{
	private String subject;
	private String content;
	private String writer;
	private Date regdate;
	public Board() { }
	public Board(String subject, String content, String writer, Date regdate) {
		this.subject = subject;
		this.content = content;
		this.writer = writer;
		this.regdate = regdate;
	}
	public String getSubject() {		return subject;	}
	public void setSubject(String subject) {		this.subject = subject;	}
	public String getContent() {		return content;	}
	public void setContent(String content) {		this.content = content;	}
	public String getWriter() {		return writer;	}
	public void setWriter(String writer) {		this.writer = writer;	}
	public Date getRegdate() {		return regdate;	}
	public void setRegdate(Date regdate) {		this.regdate = regdate;	}
}
public class ListEx2 {
	public static void main(String[] args) {
		List<Board> boardList = new Vector<Board>();
		Date today = new Date();
		Board board6 = new Board();
		board6.setSubject("제목6");
		board6.setContent("내용6");
		board6.setWriter("임소희");
		boardList.add(board6);
		boardList.add(new Board("제목1","내용1","김기태", today));
		boardList.add(new Board("제목2","내용2","신길호", today));
		boardList.add(new Board("제목3","내용3","이규진", today));
		boardList.add(new Board("제목4","내용4","이규호", today));
		boardList.add(new Board("제목5","내용5","이민환", today));
		System.out.println("글제목\t글내용\t작성자\t작성일");
		for(Board bd : boardList) {
			System.out.print(bd.getSubject()+"\t");
			System.out.print(bd.getContent()+"\t");
			System.out.print(bd.getWriter()+"\t");
			System.out.print(bd.getRegdate()+"\n");
		}
	}
}