package sec3;

public class StringBuilderEx1 {

	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder();
		sb.append("Java ");
		sb.append("Web ");
		sb.append("Programming");
		System.out.println(sb);
		sb.insert(4,"8");
		System.out.println(sb);
		
	}

}
