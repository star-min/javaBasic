package sec1;

public class FloatEx {
	public static void main(String[] args) {
		//실수(float point number) : 부동소수점수 -> float(4byte), double(8byte)
		int kor = 90;
		int eng = 70;
		int mat = 100;
		int tot = kor + eng + mat;	//정수와 정수의 연산결과는 정수가 나오므로 정수와 실수로 연산해야 실수 결과가 나옴 
		float avg = tot / 3.0f;		//평균은 소수점 이하가 나올 수 있으므로 
		double pi1 = 3.1415;
		float pi2 = 3.1415f;
		int radius = 20;
		float area = radius * radius * pi2;
		float data1 = 3e6f;	//3*10의6승 : 3000000 -> 지수
		float data2 = 3e-6f; //3*10의-6승 : 0.0000003 -> 지수
		System.out.println("총점 : "+tot);
		System.out.println("평균 : "+avg);
		System.out.println("반지름이 20인 원의 면적 : "+area);
		//표현범위가 너무 작은 타입을 쓰면, 규모가 큰 데이터를 저장하거나 처리하지 못하므로 -> 타입 범위가 큰 거 사용
		//표현범위가 너무 크면, 메모리 용량을 많이 차지하게 되므로 큰 메모리가 필요하며, 실행속도가 느려지므로 -> 타입 범위가 작은 거 사용
		//본인이 개발하고자 하는 프로젝트에 가장 적절한 규모를 정하고, 타입을 결정해야 한다.
	}
}