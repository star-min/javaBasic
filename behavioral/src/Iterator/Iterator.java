package Iterator;
//Iterator : 컬렉션의 구현은 노출시키지 않고 요소들에 접근할 수 있는 패턴
public interface Iterator {
    public abstract boolean hasNext();

    public abstract Object next();
}