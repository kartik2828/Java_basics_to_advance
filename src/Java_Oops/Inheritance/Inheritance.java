package Java_Oops.Inheritance;

// Total 5 types of inheritance we have
//Single, Multilevel, Hierarichal, (Multiple, Hybrid)

class Parent{
    String father_name = "A K Sharma";

}

class child extends Parent{
    String name = "Kartik Sharma";
    void test(){
        System.out.println("My name is: "+ name);
        System.out.println("My father name is:"+ father_name);
    }

}

public class Inheritance {
    public static void main(String[] args) {
        child obj = new child();
        obj.test();
    }

}
