package interviewQuestions;

// How can we over load main method

//public class Question1 {
//
//    void main(int a){
//        System.out.println("This is not a main method");
//    }
//
//    public static void main(String[] args) {
//        System.out.println("This is a main method");
//    }
//}


public class Question1{
     void main(int a){
       System.out.println("This is not a main method " + a);
   }

    public static void main(String[] args) {
        Question1 mm = new Question1();
        mm.main(12);
    }
}