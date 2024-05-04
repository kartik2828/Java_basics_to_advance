package Java_Oops.Inheritance;

// Multilevel Inheritance

class Father{
    String fatherName = "A K Sharma";

}

class Mother extends Father{
    String motherName = "Rajnee Sharma";
}

class child1 extends Mother {
    String name = "Kartik";
    void test(){
        System.out.println("My name is:" + name);
        System.out.println("My father name is:" + fatherName);
        System.out.println("My mother name is:" + motherName);

    }

}

public class Inheritance2 {
    public static void main(String[] args) {
        child1 obj = new child1();
        obj.test();
    }
}
