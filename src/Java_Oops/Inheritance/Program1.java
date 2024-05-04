package Java_Oops.Inheritance;

import java.sql.SQLOutput;
import java.util.*;

// Use of Static variable
class A{
    static String School="Kendriya Vidyalaya";
    int roll_no;
    String name;
     A(int r, String n){
        roll_no = r;
        name = n;
    }

    void show(){
        System.out.println(name+ " " + roll_no+ " "+ School);
    }
}

public class Program1 {
    public static void main(String[] args) {
        A obj1 = new A(15,"Shrish");
        A obj2 = new A(14, "Kartikey");

        obj1.show();
        obj2.show();

    }

}
