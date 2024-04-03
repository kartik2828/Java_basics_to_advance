package Oops;


class Anilmals{
    String name;
    String color;
    public void animalInfo(){
        System.out.println(this.name);
        System.out.println(this.color);
    }
    Anilmals(){
        System.out.println("This is Non-Parameterized constructor");

    }
}

public class NonPconstructor {

    public static void main(String[] args) {
        Anilmals a1 = new Anilmals();
        a1.name = "Dog";
        a1.color = "White";

        a1.animalInfo();
    }
}
