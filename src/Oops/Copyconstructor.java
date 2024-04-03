package Oops;

class Animal{
    String name;
    String color;
public void animalInfo(){
    System.out.println(this.name);
    System.out.println(this.color);
}
    Animal(Animal a2){
        this.name = a2.name;
        this.color = a2.color;

    }
    Animal(){

    }
}

public class Copyconstructor {

    public static void main(String[] args) {
        Animal a1 = new Animal();
        a1.name = "Dog";
        a1.color = "White";

        Animal a2 = new Animal(a1);
        a2.animalInfo();


    }
}
