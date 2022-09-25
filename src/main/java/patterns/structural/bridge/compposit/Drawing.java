package patterns.structural.bridge.compposit;

import java.util.ArrayList;
import java.util.List;

public class Drawing implements Shape{

    private List<Shape> shapeList = new ArrayList<>();



    @Override
    public void draw(String fillColor) {
        for (Shape sh:shapeList) {
            sh.draw(fillColor);
        }
    }

    //Adding shape to drawing
    public void add(Shape s){
        this.shapeList.add(s);
    }

    //Removing shape from drawing

    public void remove(Shape s){
        shapeList.remove(s);
    }

    //Removing all the shapes

    public void clear(){
        System.out.println("Clearing all the shapes from drawing");
        this.shapeList.clear();
    }

}
