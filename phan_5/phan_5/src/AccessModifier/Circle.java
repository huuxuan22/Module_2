package AccessModifier;

public class Circle {
    protected double radius;
    protected String color;
    public void setRadius(double radius){
        this.radius = radius;
    }
    public double getRadius(){
        return radius;
    }
    public void setColor(String color){
        this.color = color;
    }
    public String getColor() {
        return color;
    }
    Circle(){
        this.radius = 1;
        this.color = "red ";
    }
//    Circle(double radius,String color){
//        this.radius = radius;
//        this.color = color;
//    }
    public double getArea(){
        double area = 3.14 * Math.pow(radius,2);
        return area;
    }
}
