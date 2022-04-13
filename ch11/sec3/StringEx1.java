package sec3;
//java.lang.String
public class StringEx1 {
	public static void main(String[] args) {
		byte[] bytes = {74, 101, 107, 111, 34, 66};
		char[] chars = {'A','c','e'};
		//String 생성자는 문자배열이나 바이트배열을 문자열로 변환함.
		String str1 = new String(bytes);
		System.out.println("str1="+str1);
		String str2 = new String(chars);
		System.out.println("str2="+str2);
		String str3 = new String(bytes, 2, 3); //String(문자배열, 시작인덱스, 개수)
		System.out.println("str3="+str3);
		
		String data = "김기태는 천사";
		System.out.println(data.charAt(2)); //특정 인덱스 위치의 문자를 추출
		System.out.println("문자배열의 주소 : "+data.getBytes());
		System.out.println("태의 위치 : "+data.indexOf("태")); //특정 문자의 위치를 반환
		System.out.println("data의 글자수 : "+data.length()); //특정 문자열의 글자수 반환
		String a = data.replace("기태", "태균");	//특정 문자나 문자열을 치환
		System.out.println(a);
		String jumin = "120416-3412118";
		System.out.println("출생년도 : "+jumin.substring(0, 2)); //begin이상 ~ end미만
		System.out.print("성별 : ");
		int ma = Integer.parseInt(jumin.substring(7, 8));
		switch (ma) {
			case 1:
			case 3:
				System.out.print("남\n");
				break;
			case 2:
			case 4:
				System.out.print("여\n");
				break;
			default:
				System.out.println("잘못된 성별코드\n");
		}
		System.out.println("주민번호 뒷자리 : "+jumin.substring(7)); //end 생략시 끝까지
		
		String learn = "    Java Web Programming    ";
		System.out.println("소문자로 : "+learn.toLowerCase());
		System.out.println("대문자로 : "+learn.toUpperCase());
		System.out.println("글자수 : "+learn.length());
		String kim = learn.trim();
		System.out.println("공백을 제거한 글자수 : "+(kim.length()));
		System.out.println("공백을 제거한 텍스트 : "+kim);
		
		int b = 1004;
		float c = 32.128f;
		
		String d = String.valueOf(b); //b의 정수 숫자 1004를 문자열 "1004"로 변경
		int e = Integer.parseInt(d); //"1004" 문자열을 숫자 정수 1004로 변경
		
		String f = String.valueOf(c);	//c의 실수 숫자 32.128을 문자열 "32.128"로 변경
		float g = Float.parseFloat(f); 	//"32.128" 문자열을 숫자 실수 32.128로 변경
		
		String name1 = "김기태";
		String name2 = "천사";
		if(name1.equals(name2)) {	//두 문자열을 비교
			System.out.println("문자열이 같음");
		} else {
			System.out.println("문자열이 다름");
		}
	}
}