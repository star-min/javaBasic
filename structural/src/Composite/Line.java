package Composite;

public class Line implements Shape {
    @Override
    public void draw(String color) {
        System.out.println("line color: " + color);
    }
}