package sec2;

public class ArithMetic3 {

	public static void main(String[] args) {
		// NaN의 검사 ( Not a Number)
		String indata = "NaN";
		String data1 = "500.4";
		double val1 = Double.valueOf(indata);
		double data2 = 500.4;
		data2 += val1;
		double val2 = Double.valueOf(data1);
		System.out.println();
		System.out.println(data2);
		
		
	}

}
