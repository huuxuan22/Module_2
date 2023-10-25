package Fan;
import java.util.Scanner;

public class Fan {
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;
    private int speed ;
    private boolean on;
    private double radius;
    private String color = "blue";
    public void setSLOW(int speed){
        this.speed = speed;
    }
    public int getSpeed(){
        return speed;
    }
    public void setOn(boolean on){
        this.on = on;
    }
    public boolean getOn(){
        return on;
    }
    public void setColor(String color){
        this.color = color;
    }
    public String getColor(){
        return color;
    }
    public Fan(){
        this.speed = SLOW;
        this.on = false;
        this.color = "blue";
        this.radius = 5;
    }
    public String toString(){
        if(on){
            return speed + "||" + color + "||" + radius +"fan is on";
        }
        else {
            return color + "||" + radius+ "||" + "fan is off";
        }
    }

    public static void main(String[] args) {
        Fan fan1 = new Fan();
        fan1.speed = MEDIUM;
        fan1.radius = 10;
        fan1.color= "yellow";
        fan1.on = true;
        System.out.println("Fan1"+fan1.toString());
        Fan fan2 = new Fan();
        fan2.speed = FAST;
        fan2.radius = 5;
        fan2.color = "blue";
        fan2.on = false;
        System.out.println("Fan1"+fan1.toString());
    }
}
