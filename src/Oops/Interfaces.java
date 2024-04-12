package Oops;

interface Dog{
    void bark();
}

interface  Dog1{

}


class Otis implements Dog, Dog1{
    public void bark(){
        System.out.println("Otis loves to drink milk");
    }
}


public class Interfaces {
    public static void main(String[] args) {
        Otis o1 = new Otis();
        o1.bark();
    }
}

// ****  Points to remember ******

// This is an example of Multiple inheritance which is directly not possible in java
// to achieve multiple inher. we use interfaces in java.
// Interfaces give pure abstraction
// In case of Interfaces we use "implements" instead "extends"
