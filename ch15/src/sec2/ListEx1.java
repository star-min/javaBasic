package sec2;
//가장 중요함 - ArrayList : 한 요소나 레코드(객체) 단위 데이터를 하나의 배열구조로 저장하거나 접근이 가능하도록 해줌 
import java.util.ArrayList;
import java.util.List;
class Human{
	private String name;
	private int sno;
	private int age;
	public String getName() {return name;}
	public void setName(String name) {this.name = name;}
	public int getSno() {	return sno;	}
	public void setSno(int sno) {		this.sno = sno;	}
	public int getAge() {		return age;	}
	public void setAge(int age) {		this.age = age;	}
}
public class ListEx1 {
	public static void main(String[] args) {
		List<String> list1 = new ArrayList<>();
		list1.add("김기태");	//목록에 요소 추가
		list1.add("길정훈");
		list1.add("김동협");
		System.out.println("리스트의 크기 "+list1.size());
		System.out.println("list1 : "+list1);
		for(String name : list1) { //순회
			System.out.println("회원명 : "+name);
		}
		String irum = list1.get(1);  //인덱스가 1인 요소값 대입
		System.out.println("인덱스가 1인 요소 : "+irum);
		System.out.println("인덱스가 1인 요소 : "+list1.get(1));
		list1.add("김성민");
		list1.remove(1);	//인덱스가 1인 요소를 제거
		System.out.println("list1 : "+list1);
		
		//Human[] arr = new Human[5];
		List<Human> h1 = new ArrayList<Human>();
		Human m1 = new Human();
		m1.setName("김예은");
		m1.setSno(5);
		m1.setAge(39);
		h1.add(m1);
		Human m2 = new Human();
		m2.setName("김태균");
		m2.setSno(6);
		m2.setAge(28);
		h1.add(m2);
		Human m3 = new Human();
		m3.setName("김효민");
		m3.setSno(7);
		m3.setAge(34);
		h1.add(m3);
		System.out.println("번호\t회원명\t나이");
		for(Human h : h1) {
			System.out.print(h.getSno()+"\t");
			System.out.print(h.getName()+"\t");
			System.out.print(h.getAge()+"\n");
		}
	}
}