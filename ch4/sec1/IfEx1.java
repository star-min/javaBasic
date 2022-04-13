package sec1;
//제어문 : 프로그래밍에서 프로그램의 흐름을 제어하는 것으로 
//조건분기문 : 조건에 따라 실행내용이 달라지게 하는 것
//if : if, if/else, if/elseif/else
//switch : switch/case
//반복문 : 프로그래밍상 같은 실행문으로 여러 번 실행하게 하는 것
//for, while, do~while
//기타 제어문
//break, continue
public class IfEx1 {
	public static void main(String[] args) {	
		String name = "김기태";
		int kor = 80;
		int eng = 70;
		int mat = 100;
		int tot = kor + eng + mat;
		String pass = "불합격";
		//if(조건식) { 실행문; }
		if (tot>=200) {		//단순if	
			pass = "합격";
		}
		//if (tot>=200) pass="합격"; - 한 줄로 if문 기술
		//pass = (tot>=200) ? "합격" : "불합격"; - 삼항 연산자
		System.out.println("합격여부 : "+pass);
		//문법 : if(조건식) { 참실행문장; } else { 거짓실행문장; }
		if(kor>=90 || eng>=90 || mat>=90) {
			System.out.println("과목우수자");
		} else {
			System.out.println("대상아님");
		}
		if(kor>=90 && eng>=90 && mat>=90) {
			System.out.println("장학생");
		} else {
			System.out.println("일반학생");
		}
		System.out.print("학점 : ");
		//문법 : if(조건식1) { 실행문1; } else if(조건식2) { 실행문2; } else { 
		// 실행문3; }
		if (tot>=270) {	//if~else if~else~ 다단계if
			System.out.print("A");
		} else if(tot>=240) { //269~240
			System.out.print("B");
		} else if(tot>=210) { //239~210	
			System.out.print("C");
		} else if(tot>=180) { //209~180
			System.out.print("D");
		} else {
			System.out.print("집에 가");
		}
		System.out.print("\n");
		//System.out.println();
		System.out.print("세부 학점 : ");
		if(tot>=270) {	//중첩if
			System.out.print("A");
			if(tot>=290) {
				System.out.print("+");
			} else if(tot>=280) {
				System.out.print("0");
			} else {
				System.out.print("-");
			}
		} else if(tot>=240) {
			System.out.print("B");
			if(tot>=260) {
				System.out.print("+");
			} else if(tot>=250) {
				System.out.print("0");
			} else {
				System.out.print("-");
			}
		} else if(tot>=210) {
			System.out.print("C");
			if(tot>=230) {
				System.out.print("+");
			} else if(tot>=220) {
				System.out.print("0");
			} else {
				System.out.print("-");
			}
		}
	}
}