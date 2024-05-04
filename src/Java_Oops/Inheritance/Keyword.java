package Java_Oops.Inheritance;

// Use of This keyword
// used to refer current class instance variable
class test{
    String name;
    int roll_no;
    String School;
    test(String name, int roll_no, String School){
        this.name = name;
        this.roll_no = roll_no;
        this.School = School;
    }

    void test1(){
        System.out.println(name +" "+ roll_no +" "+ School);
    }
}

public class Keyword {
    public static void main(String[] args) {
        test obj = new test("Kartik",15,"KV");
        obj.test1();
    }
}
