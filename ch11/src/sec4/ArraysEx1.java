package sec4;

import java.util.Arrays;

public class ArraysEx1 {

	public static void main(String[] args) {
		char[] arr1 = {'J','A','V','A',' ','P','R','O','G','R','A','M'};
		char[] arr2 = arr1; //얕은 복제 나중에 내용값이 바뀌면 원본 손상 우려
		char[] arr3 = Arrays.copyOf(arr1, arr1.length); // 깊은 복제 다른 저장소에 같은 값 복제
		char[] arr4 = Arrays.copyOfRange(arr1,4,10);
		System.out.println(arr1);
		System.out.println(arr2);
		System.out.println(arr3);
		System.out.println(arr4);
		System.out.println("얕은 복제 비교 : "+Arrays.equals(arr1,arr2));
		System.out.println("깊은 복제 비교 : "+Arrays.equals(arr1,arr3));
		System.out.println("깊은 복제 비교 : "+Arrays.equals(arr1,arr4));
		System.out.println("arr1의 주소 : "+Arrays.hashCode(arr1));
		System.out.println("arr2의 주소 : "+Arrays.hashCode(arr2));
		System.out.println("arr3의 주소 : "+Arrays.hashCode(arr3));
		System.out.println("arr4의 주소 : "+Arrays.hashCode(arr4));
		System.out.println("==============================");
		String[] arr5= {"김성민","이세카이","고고씽","슈슈슝"};
		for(String name : arr5) {
			System.out.println(name);
		}
		System.out.println("정보 검색 : 몇 번쨰에 있는지?");
		String data = "김성민";
		int idx = Arrays.binarySearch(arr5,data);
		System.out.println("김성민 의 인덱스 : "+idx);
	}

}
