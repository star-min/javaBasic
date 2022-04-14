package sec1;

public class IfEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "김성민";
		int kor = 95;
		int eng = 75;
		int mat = 100;
		int tot = kor + eng + mat;
		String pass = "불합격";
		//if(조건식) {실행문; }
		if (tot>=200) {	//단순 if
			pass = "합격";
			
		}
		// pass (tot>=200) ? "합격" : "불합격";	- 삼항 연산자
		System.out.println("합격여부 : "+pass);
		if(kor>=90||eng>=90||mat>=90) {
			System.out.println("과목우수자");
		}else {
			System.out.println("대상아님");
		}
		if(kor>= 90 && eng>=90 && mat>=90) {
			System.out.println("장학생");
		}
		else {
			System.out.println("일반학생");
		}
		System.out.println("학점 : ");
		if (tot>=270) {
			System.out.println("A");
		} else if(tot>=240) {
			System.out.println("B");
		} else if(tot>=210) {
			System.out.println("C");
		} else if(tot>=180) {
			System.out.println("D");
		} else {
			System.out.println("집에 가");
		}
		}

	}
	

