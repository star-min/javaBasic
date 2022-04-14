package FactoryMethod;
//Factory Method : 어떤 클래스의 인스턴스를 만들지 서브클래스에서 결정하도록 책임을 위임하는 패턴
public abstract class Factory {
	 public final Product create(String owner) {
	        Product p = createProduct(owner);
	        registerProduct(p);
	        return p;
	    }
	    protected abstract Product createProduct(String owner);
	    protected abstract void registerProduct(Product p);
}
