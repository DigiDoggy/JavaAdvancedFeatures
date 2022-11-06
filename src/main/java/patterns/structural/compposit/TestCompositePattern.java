package patterns.structural.compposit;

public class TestCompositePattern {

    public static void main(String[] args) {
        Shape triangle = new Triangle();
        Shape triangle2 = new Triangle();
        Shape circle = new Circle();

        Drawing drawing = new Drawing();
        drawing.add(triangle);
        drawing.add(triangle2);
        drawing.add(circle);

        drawing.draw("Red");

        drawing.clear();

        drawing.add(triangle);
        drawing.add(circle);
        drawing.draw("Green");
    }

    //I don't see the connection between the object (Drawing) of the class and the ArrayList.
    //Why when we create a Drawing-> object it is converted to Array list .





}
