package sec2;
import java.util.Comparator;
class Student {
	public int sno;
	public String sname;
	public Student(int sno, String sname) {	this.sno = sno;	this.sname = sname;	}
}
class StudentCompare implements Comparator<Student>{
	@Override
	public int compare(Student a, Student b) {
		if(a.sno == b.sno && a.sname == b.sname) {	return 2; } 
		else if(a.sno == b.sno || a.sname == b.sname) {	return 1; }
		else { return 0; }
	}
}
public class ObjectsEx1 {
	public static void main(String[] args) {
		Student a = new Student(7, "김기태");
		Student b = new Student(7, "이규진");
		Student c = new Student(8, "이규호");
		StudentCompare sc = new StudentCompare(); 
		System.out.println("A학생과 B학생의 비교 : "+sc.compare(a, b));
		System.out.println("A학생과 A학생의 비교 : "+sc.compare(a, a));
		System.out.println("A학생과 C학생의 비교 : "+sc.compare(a, c));
	}
}