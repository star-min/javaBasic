package sec4;

import java.util.Arrays;
//배열 객체를 다룰 때는 원본과 계산된 결과는 서로 다르므로 반드시 깊은 복제가 가능한 명령으로 실행될 수 있도록 해야함
public class ArraysEx1 {
	public static void main(String[] args) {
		char[] arr1 = {'J','A','V','A','P','R','O','G','R','A','M'};
		char[] arr2 = arr1;	//arr1의 내용이 아니라 arr1의 주소를 복제하여 arr2에 넣었음
		System.out.println("얕은 복제");
		System.out.println(arr1);
		System.out.println(arr2);
		//Arrays.arraycopy(배열원본객체명, 시작인덱스, 배열복제객체명, 복제객체의시작위치, 복사요소개수);
		//char[] arr3 = System.arraycopy(arr1, 0, arr2, 0, arr1.length);
		System.out.println("깊은 복제");
		char[] arr3 = Arrays.copyOf(arr1, arr1.length);
		System.out.println(arr3);
		char[] arr4 = Arrays.copyOfRange(arr3, 4, 11);
		System.out.println(arr4);
		System.out.println("얕은 복제의 비교1 : "+Arrays.equals(arr1, arr2));
		System.out.println("깊은 복제의 비교1 : "+Arrays.equals(arr1, arr4));
		//System.out.println("얕은 복제의 비교2 : "+Arrays.deepEquals(arr1, arr2)); - 2차원 배열일 경우 가능
		//System.out.println("깊은 복제의 비교2 : "+Arrays.deepEquals(arr1, arr3));
		System.out.println("arr1의 주소 :"+Arrays.hashCode(arr1));
		System.out.println("arr2의 주소 :"+Arrays.hashCode(arr2));
		System.out.println("arr4의 주소 :"+Arrays.hashCode(arr4));
		String[] arr5 = {"하정우","배성우","김선우","고정우","배동우"};
		Arrays.sort(arr5);
		System.out.println("정렬 후");
		for(String name : arr5) {
			System.out.println(name);
		}
		System.out.println("정보 검색 : 몇 번째에 있는지 ?");
		String data = "배동우";
		int idx = Arrays.binarySearch(arr5, data);
		System.out.println(data+"의 인덱스 : "+idx);
	}
}