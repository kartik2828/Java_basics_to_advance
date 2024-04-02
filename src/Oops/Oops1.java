package Oops;

//  Parameterized Constructor
class Student{
    String name ;
    int age;
    public void studentInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
    // Parameterized Constructor
    Student(String name, int age){
       this.name = name;
       this.age = age;
    }
    }
public class Oops1 {
    public static void main(String[] args) {
Student s1 = new Student("Kartik",22);
s1.studentInfo();

    }
}
