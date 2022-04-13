package sec1;

public class Array3 {
	public static void main(String[] args) {
		String[] names = {"김태균","김효민","신길호","여승원","이규진"}; 
		//5명의 3과목 점수 선언 jum[][] -> 2차원 배열 행(줄),열(칸)
		int[][] jum = {{100,80,90},{70,90,80},{60,90,80},{90,80,70},{85,95,85}};
		int hap = 0;
		float py = 0.0f;
		int[] tot = new int[3];
		float[] avg = new float[3];
		//전체총점(hap), 전체평균(py), 과목총점(tot), 과목평균(avg)
		/*
		 성명		국어		영어		수학 
		 ---	---		---		---
		 ---	---		---		---
		 **************************
		 총점		XX		XX		XX
		 평균 	XX.X	XX.X	XX.X
		 전체총점 : XXX	전체평균 : XX.X
		 */
		for(int i=0;i<names.length;i++) {
			for(int j=0;j<3;j++) {
				tot[j]+=jum[i][j];				//과목별 총점 누적
				hap+=jum[i][j];					//전체 총점 누적
			}
		}
		
		for(int i=0;i<3;i++) {	//과목별 평균 계산
			avg[i] = (float) tot[i] / names.length;
		}
		
		System.out.println("****************************************");
		System.out.println("성명\t국어\t영어\t수학");
		System.out.println("****************************************");
		//결과 출력
		for(int i=0;i<names.length;i++) {
			System.out.print(names[i]);	//이름 출력
			for(int j=0;j<3;j++) {
				System.out.print("\t"+jum[i][j]); 	//점수 출력
			}
			System.out.print("\n");
		}
		System.out.println("****************************************");
		System.out.print("과목총점\t");
		for(int i=0;i<3;i++) {
			System.out.print(tot[i]+"\t");
		}
		System.out.println();
		System.out.print("과목평균\t");
		for(int i=0;i<3;i++) {
			System.out.print(avg[i]+"\t");
		}
		System.out.println("\n****************************************");
		py = hap / names.length / 3.0f;
		System.out.println("전체총점 : "+hap+"\t전체평균 : "+py);
	}
}