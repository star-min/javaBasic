package sec1;
class Student{
	int num;
	String name;
}
public class ArrayIndexOutOfBoundsEx {
	public static void main(String[] args) {
		Student[] s = new Student[100]; //0~99
		try {
			System.out.println(s[100].num);
			System.out.println(s[100].name);
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("지정된 배열 수보다 인덱스를 초과하였음");
			e.printStackTrace();
		} finally {
			System.out.println("프로그램 종료");
		}
	}
}