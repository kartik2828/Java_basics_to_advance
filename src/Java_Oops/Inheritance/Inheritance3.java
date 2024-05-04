package Java_Oops.Inheritance;

// hierarichal Inheritance

class Animal{
    void test(){
        System.out.println("This is an animal");
    }
}
class cat extends Animal{
    void test1(){
        System.out.println("This is a dog");
    }
        }


class Dog extends Animal{
    void test2(){
        System.out.println("This is a cat");
    }

}


public class Inheritance3 {
    public static void main(String[] args) {
        Dog obj = new Dog();
        obj.test2();
        obj.test();

    }
}
