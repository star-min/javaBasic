package Decorator;

public class Lights extends TreeDecorator {

    public Lights(ChristmasTree christmasTree) {
        super(christmasTree); // 여기가 포인트.
    }

    public String addLights() {
        return " with Lights";
    }

    @Override
    public String decorate() {
        return super.decorate() + addLights(); // 여기가 포인트.
    }
}
