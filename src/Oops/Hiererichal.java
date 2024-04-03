package Oops;
import java.util.*;

class Shap {
    public void parentInfo() {
        System.out.println("Display area: ");
    }
}

class Tri extends Shap {
    public void childInfo(int b, int h) {
        System.out.println(0.5 * b * h);
    }
}

class circle extends Shap {
    public void area(int r) {
        System.out.println(3.14 * r * r);
    }
}

public class Hiererichal {
    public static void main(String[] args) {
        circle c1 = new circle();
        c1.area(6);
    }
}
