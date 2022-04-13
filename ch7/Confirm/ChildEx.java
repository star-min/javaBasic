package Confirm;

public class ChildEx {
	public static void main(String[] args) {
		Child child1 = new Child();
		child1.name = "김기태";
		child1.studentNo = 7;
		
		Child child2 = new Child("김기태");
		child2.studentNo = 8;
		
		Child child3 = new Child("김기태", 9);
	}
}