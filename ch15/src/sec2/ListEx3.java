package sec2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
//LinkedList : 순차처리에는 부적합하고, 무작위처리나 중간 요소의 처리에 적합하다.
public class ListEx3 {
	public static void main(String[] args) {
		String[] names = {"조재영","조수민","정우희","장성필","임소희","김준호","김기태"};
		List<String> list1 = new ArrayList<String>();
		List<String> list2 = new LinkedList<String>();
		long start;
		long end;	
		start = System.nanoTime(); // 1/1000000000
		for(String name : names) {			list1.add(name);		}
		end = System.nanoTime();
		System.out.println("ArrayList 걸린 시간 : "+(end - start));
		
		start = System.nanoTime(); // 1/1000000000
		for(String name : names) {			list2.add(name);		}
		end = System.nanoTime();
		System.out.println("LinkedList 걸린 시간 : "+(end - start));
		//			ArrayList			LinkedList
		//순차삽입		빠른편				느린편
		//중간삽입		느른편				빠른편
		//순차검색		빠른편				느린편
		//무작위		느린편				빠른편
	}
}