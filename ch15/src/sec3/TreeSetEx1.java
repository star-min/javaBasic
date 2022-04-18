package sec3;
import java.util.Set;
import java.util.TreeSet;
//TreeSet : 정렬, 검색, 범위 검색시 빠른게 장점 
//중복성을 해결하고 범위 검색시에 많이 활용 
public class TreeSetEx1 {
	public static void main(String[] args) {
		TreeSet set = new TreeSet();
		set.add("abc");
		set.add("alien");
		set.add("bat");
		set.add("car");
		set.add("Car");
		set.add("disc");
		set.add("dance");
		set.add("elephant");
		set.add("Element");
		set.add("bat");
		set.add("car");
		
		String from = "b";
		String to = "d";
		
		System.out.println("set : "+set);
		System.out.println("범위 검색 : "+set.subSet(from, to));  //"d"는 포함되지 않으며, 소문자 b~c
	}
}