package sec1;

class Product<T, M>{
	private T kind;
	private M model;
	public T getKind() { return kind; }
	public void setKind(T kind) { this.kind = kind; }
	public M getModel() { return model; }
	public void setModel(M model) { this.model = model; }
}
class Tv{ String model; }

public class ProductEx {
	public static void main(String[] args) {
		Product<Tv, String> p1 = new Product<Tv, String>();
		p1.setKind(new Tv());
		p1.setModel("스마트TV");
		Tv t1 = p1.getKind();
		String tvModel = p1.getModel();
		System.out.println("Tv : "+t1+", Model : "+tvModel);

	}

}
