package Confirm;

public class Parent {
	public String name;
	
	public Parent() {
		this("대한민국");
		System.out.println("Parent() call");
	}
	public Parent(String name) {
		this.name = name;
		System.out.println("Parent(String name) call");
	}
}