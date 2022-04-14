package sec3;

import java.util.regex.Pattern;
//정규표현식(Regular Expression)=패턴(Pattern)
		//입력된 데이터가 원하는 형식이 맞는지 검증하게 하는 식
		//아이디, 비밀번호, 전화번호, 이메일, 주민번호 형식 등을 검증
		//한 개의 문자 [] -> [abc] : abc 중 하나의 문자를 포함하고 있는지
		//				[^abc] : 한 문자라도 a, b, c가 아니도록 제한
		//				[a-z] : a~z 영문 소문자가 포함되는지
		//				[a-zA-Z] : 영문 대문자나 소문자가 포함되어 있는지
		//				[a-zA-Z0-9] : 영문, 숫자가 포함되어 있는지
		//\d	-> 십진수 [0-9]를 말함
		//\s	-> 공백이 포함되어 있는지
		//\w	-> [a-zA-Z0-9]와 동일
		//?		-> 없음 또는 하나		kbs? -> kbs 또는 kbs1, kbsa
		//*		-> 없음 또는 한 개 이상 kbs* -> kbs 또는 kbs1234, kbs1
		//+		-> 한 개 이상			kbs+ -> kbs1, kbsa, kbs1234
		//{n}	-> \d{3}	: 숫자 3글자이어야함
		//{n,m}	-> \d{3,4}	: 숫자 3글자 또는 4글자이어야함
		//()	-> 그룹 (02|031)
		//|		-> 또는

//		id 		= "\w{6,12}"   - [a-zA-Z0-9] 가 포함된 문자 6~12개
//		pw		= "\w{6,12}[!@#$%^&*(),./;'\"]"
//		jumin	= 
public class PatternEx1 {

	public static void main(String[] args) {
		String regExp = "(02|031|010)-\\d{3,4}-\\d{4}";
		String[] data = {"010-7136-3155","090-5136-1234","02-533-233"};
		for(String num : data) {
			boolean res = Pattern.matches(regExp, num);
			if(res) {
				System.out.println(num+"은 정규 표현식과 일치");
			}else {
				System.out.println(num+"은 정규 표현식과 불일치");
			}
		}
		System.out.println("------------------------------------");
		String regExp2 = "\\w+@\\w+\\.(\\w+)?";
		String[] emails = {"zxzx00262@gmail.com","5263@name.net","o@o"};
		for(String email : emails) {
			boolean res = Pattern.matches(regExp2, email);
			if(res) {
				System.out.println(email+"는 정규 패턴과 일치");
			}else {
				System.out.println(email+"는 정규 패턴과 불일치");
			}
		}
		System.out.println("-----------------------------------------");

		
	}

}
