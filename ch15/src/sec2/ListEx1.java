package sec2;

import java.util.ArrayList;
import java.util.List;

class Human {
	private int sno;
	private String name;
	private int age;
	public int getSno() {return sno;}
	public void setSno(int sno) {this.sno = sno;}
	public String getName() {return name;}
	public void setName(String name) {this.name = name;}
	public int getAge() {return age;}
	public void setAge(int age) {this.age = age;}
	
}

public class ListEx1 {
	public static void main(String[] args) {
		List<String> list1 = new ArrayList<>();
		list1.add("김성민");
		list1.add("이순신");
		list1.add("파가니니");
		
		System.out.println(list1.size());
		
		List<Human> h1 = new ArrayList<>();
		Human m1 = new Human();
		m1.setAge(26);
		m1.setName("김성민");
		m1.setSno(1);
		h1.add(m1);
		Human m2 = new Human();
		m2.setAge(28);
		m2.setName("해리포터");
		m2.setSno(2);
		h1.add(m2);
		Human m3 = new Human();
		m3.setAge(128);
		m3.setName("덤블도어");
		m3.setSno(0);
		h1.add(m3);
		System.out.println("번호\t이름\t나이");
		for(Human h : h1) {
			System.out.print(h.getSno()+"\t");
			System.out.print(h.getName()+"\t");
			System.out.print(h.getAge()+"\t"+"\n");
		}
	}

}
