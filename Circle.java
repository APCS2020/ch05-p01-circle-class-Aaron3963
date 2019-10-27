public class Circle{
    private double radius;

    public Circle(double r){
        radius = r;
    }

    public double getArea(){
        return radius*radius*Math.PI;
    }

    public void setRadius(double r){
        radius = r;
    }
}