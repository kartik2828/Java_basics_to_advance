package Oops;

// Abstraction

abstract class Rupee{  // Abstract class is just a simple class or a blue print which is not doing a specific
    // role in our program
    abstract void Amount();
    Rupee(){
        System.out.println("This is first constructor");
    }
    public void money(){
        System.out.println("Amount is infinite");
    }
}

class Hundered extends Rupee{
    Hundered(){
        System.out.println("This is Second constructor");
    }
public void Amount(){
    System.out.println("Three are two zeros");
}
}

class Thousand extends Rupee{
    public void Amount(){
        System.out.println("Three are Three zeros");
    }
}
public class Getset {
    public static void main(String[] args) {
Hundered h1 = new Hundered();
h1.Amount();
    }
}


// **********   Points to remember   *************

// Always Base class constructor call first (automatically), even if we are targetting child class.
// This process is called constructor chaining