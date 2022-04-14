package sec1;

public class Array3 {

	public static void main(String[] args) {
		String[] names = {"김성민", "김유신","이순신","허준","혁거세"};
		// 5명의 3과목 점수 선언 jum[][]
		int[][] jum = {{100,80,90},{70,90,80},{60,90,80},{90,80,70},{85,95,85}};
		int hap=0;
		float py=0.0f;
		int[] tot = new int[3];
		float[] avg = new float[3];
		
		//전체총점(hap), 전체평균(py), 과목총점(tot), 과목쳥균(avg)
		/*
		 * 성명		국어		영어		수학
		 * ---		---		---		---
		 * ---		---		---		---
		 * *****************************
		 * 총점		xx		xx		xx
		 * 평균		xx.x	xx.x	xx.x
		 * 전체총점 : xxx		전체평균 : xx.x
		 * */
		
		for(int i=0;i<names.length;i++) {
			System.out.print(names[i]+"\t");
			for(int j=0;j<3;j++) {
				System.out.print(jum[i][j]+"\t");
				tot[j]+=jum[i][j];
				hap+=jum[i][j];
			}
			
		}
	}

}
