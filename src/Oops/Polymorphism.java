package Oops;
// Method overloading (compile time polymorphism)
class Students {
String name;
int age;

    public void studentsInfo(String name) {
        System.out.println(name);
    }

    public void studentsInfo(int age) {
        System.out.println(age);
    }

    public void studentsInfo(String name, int age) {
        System.out.println(name + " " + age);
    }
}

public class Polymorphism {

    public static void main(String[] args) {
        Students a1 = new Students();
        a1.name = "Radhe";
        a1.age = 22;

        a1.studentsInfo(a1.name, a1.age);
    }
}