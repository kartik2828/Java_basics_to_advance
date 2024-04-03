package Oops;

class Shapes {
    public void parentInfo(){
        System.out.println("Display area: ");
    }
}

class Triangles extends Shapes {
    public void childInfo(int b, int h) {
        System.out.println(0.5 * b * h);
    }
}

class Equilateral extends Triangles{
    public void area(int b, int h){
        System.out.println(0.5*b*h);
    }
}

public class Multilevel {
    public static void main(String[] args) {
Equilateral e1 = new Equilateral();
e1.area(5,6);
    }
}
