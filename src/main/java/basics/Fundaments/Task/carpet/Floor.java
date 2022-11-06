package basics.Fundaments.Task.carpet;

public class Floor {

    private double  width;
    private double length;

    protected Floor(double width, double length){
        if(width >= 0){
            this.width = width;
        }else {
            this.width = 0;
        }

        if(width >= 0){
            this.length = length;
        }else {
            this.length = 0;
        }

    }

    public double getArea(){
        return width * length;
    }



}
