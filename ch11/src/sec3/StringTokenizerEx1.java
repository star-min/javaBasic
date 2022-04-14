package sec3;

import java.util.StringTokenizer;

public class StringTokenizerEx1 {

	public static void main(String[] args) {

		String str = "김성민&파가니니,알렉산더-모짜르트";
		String[] arr = str.split("&|,|-|%");
		
		for(String idol : arr) {
			System.out.println(idol);
		}
		System.out.println("-----Tokenizer (for-countTokens)--------");
		str = "김/신/나/양/복/장/서";
		StringTokenizer s = new StringTokenizer(str,"/");
		int l = s.countTokens();
		for(int i=0;i<l;i++) {
			String t = s.nextToken();
			System.out.println(t);
		}
		System.out.println("-----Tokenizer (while-hasMoreTokens)--------");
		StringTokenizer s2 = new StringTokenizer(str,"/");
		while(s2.hasMoreTokens()) {
			String t2 = s2.nextToken();
			System.out.println(t2);
		}
	}

}
