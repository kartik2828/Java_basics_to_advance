package Variable;


class students{
    static String School = "Army School"; // Static variable

    void method(){
        String name = "Kartik"; // Local variable
    }
    int a = 55; //  Instance variable

}

public class localVariable {

    public static void main(String[] args) {
        int a = 22;
        System.out.println("I am " + a + " Years old");
        System.out.println(students.School);

    }
}
