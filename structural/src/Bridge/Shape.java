package Bridge;
//Bridge : 기능과 구현을 분리하여 독립적으로 변형과 확장이 가능하도록 결합도를 낮춘 패턴
public abstract class Shape {

    //Composition
    protected Color color;

    //constructor with implementor as input argument
    public Shape(Color c){
        this.color=c;
    }

    abstract public void applyColor();
}