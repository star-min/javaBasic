package Composite;

public class DrawingEx {
    public static void main(String[] args) {
        Shape t1 = new Triangle();
        Shape t2 = new Triangle();
        Shape c1 = new Circle();
        Shape l1 = new Line();

        Drawing drawing = new Drawing();
        drawing.add(t1);
        drawing.add(t2);
        drawing.add(c1);
        drawing.add(l1);
        drawing.draw("red");

        drawing.clear();

        drawing.add(t2);
        drawing.add(c1);
        drawing.draw("blue");
    }
}
