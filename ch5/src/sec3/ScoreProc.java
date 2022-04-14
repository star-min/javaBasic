package sec3;

public class ScoreProc {
	public static void main(String[] args) {
		//2차원 
		String[] names = {"길정훈","김동협","김성민","김태균","신길호"};
		int[][] scores = {{90,75,100},{95,90,65},{80,85,95},{85,80,85},{70,90,80}};
		int[] tot = {0,0,0};	//과목별 총점
		float[] avg = {0.0f, 0.0f, 0.0f};	//과목별 평균
		int total = 0;	//전체 총점
		float average = 0.0f;	//전체 평균
		int[] hap = {0,0,0,0,0};
		float[] pyo = {0.0f, 0.0f, 0.0f, 0.0f, 0.0f};
		int[] rank = {1,1,1,1,1};
		String[] hak = {"","","","",""};
		
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균\t석차\t학점");
		for(int i=0;i<names.length;i++) {
			System.out.print(names[i]+"\t");
			for(int j=0;j<3;j++) {
				System.out.print(scores[i][j]+"\t");
				tot[j]+=scores[i][j];	//과목 총점
				total+=scores[i][j];	//전체 총점
				hap[i]+=scores[i][j]; 	//개인 총점
			}
			pyo[i] = (float) hap[i] / 3;
			//석차 구하기
			//학점 구하기
			System.out.printf("%d\t%3.2f\t%d\t%s\n",hap[i],pyo[i],rank[i],hak[i]);
		}
		for(int j=0;j<3;j++) {
			avg[j] = (float) tot[j] / names.length;
		}
		average = (float) total / names.length / 3;
		System.out.print("과목 총점"+"\t");
		for(int j=0;j<3;j++) {
			System.out.print(tot[j]+"\t");
		}
		System.out.print("\n과목 평균"+"\t");
		for(int j=0;j<3;j++) {
			System.out.printf("%3.2f\t", avg[j]);
		}  //printf("%d*%d=%d",i,j,i*j) //printf("이름 : %s", name);
		System.out.printf("\n전체 총점 : %d\t전체평균 : %3.2f",total,average);
	}
}