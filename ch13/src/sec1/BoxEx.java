package sec1;

class Tot<T>{
	private T t;
	public T getT() {
		return t;
	}
	public void setT(T t) {
		this.t = t;
	}
}
public class BoxEx {
	public static void main(String[] args) {
		Tot<String> tot1 = new Tot<>();
		tot1.setT("집에가기 5분전 입니다.");
		
		Tot<Integer> tot2 = new Tot<>();
		tot2.setT(366566);
		
		Tot<Boolean> tot3 = new Tot<>();
		tot3.setT(true);
		
		Tot<Float> tot4 = new Tot<>();
		tot4.setT(3.14f);
		
		Tot<Double> tot5 = new Tot<>();
		tot5.setT(3.141567);
		

	}

}
