package Oops;

// Single level Inheritance
class Shape{
    public void parentInfo(){
        System.out.println("Display area: ");
    }
}

class Triangle extends Shapes {
    public void childInfo(int b, int h) {
        System.out.println(0.5 * b * h);
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Triangles t1 = new Triangles();
        t1.parentInfo();
        t1.childInfo(5,4);



    }
}
