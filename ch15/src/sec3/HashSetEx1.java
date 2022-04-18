package sec3;

import java.util.HashSet;
import java.util.Set;

public class HashSetEx1 {
	public static void main(String[] args) {
		int[] intArr = {20,40,35,25};
		String[] strArr = {"김","이","박","최","정","김","이"};
		Object[] objArr = {1,"1","2",3,2,"3","4",4,3,"3","2"};
		System.out.println("요소의 수 : "+objArr.length);
		System.out.println("objArr");
		for(int i=0;i<objArr.length;i++) {
			System.out.print(objArr[i]+", ");
		}
		Set set1 = new HashSet();
		Set set2 = new HashSet();
		Set set3 = new HashSet();
		for(int i=0;i<objArr.length;i++) {
			set1.add(objArr[i]);
		}
		System.out.println("\nset : "+set1);
	}

}
