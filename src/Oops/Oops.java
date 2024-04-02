package Oops;

// How to create an object
class Pen{
    String color;
    String type;
    public void write(){
        System.out.println("Write something");
    }
    public void type(){
        System.out.println(this.color);
    }
}
public class Oops {
    public static void main(String[] args) {
        Pen pen1 = new Pen();
        pen1.color = "Blue";
        pen1.type = "Ball";

        Pen pen2 = new Pen();
        pen2.color = "Black";
        pen1.write();
        pen1.type();
        pen2.type();
    }

}
