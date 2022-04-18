package sec3;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
//Set : 중복성을 허용하지 않으며, 요소 간의 순서가 없다.
public class HashSetEx1 {
	public static void main(String[] args) {
		int[] intArr = {20,40,35,25}; //정수 배열
		String[] strArr = {"김","이","박","최","정","김","이"};	//문자열 배열
		String[] nameArr = {"김","이","박","최","김","이","박"};
		String[] irumArr = {"김","이","박","최","길","이","최"};
		Object[] objArr = {1,"1","2",3,2,"3","2","4",4,3,"3","2"};
		System.out.println("요소의 수 : "+strArr.length);
		System.out.println("strArr");
		for(int i=0;i<strArr.length;i++) {
			System.out.print(strArr[i]+", ");
		}
		Set set1 = new HashSet();
		Set set2 = new HashSet();
		Set set3 = new HashSet();
		for(int i=0;i<strArr.length;i++) {
			set1.add(strArr[i]);
			set2.add(nameArr[i]);
			set3.add(irumArr[i]);
		}
		System.out.println("\nset : "+set1);
		System.out.println("set1 안에 set2가 포함되어 있는가 ? "+set1.containsAll(set2));
		System.out.println("set1 안에 set3가 포함되어 있는가 ? "+set1.containsAll(set3));
		Iterator it = set1.iterator();	//Set을 분리요소로 변환(순번 발생)
		while(it.hasNext()) {
			System.out.println("요소:"+it.next());
		}
	}
}