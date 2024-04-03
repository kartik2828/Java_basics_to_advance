package Bank;


class Account{
    public String name;
    private int age;
    // getters & setters
    public int getAge(){
        return this.age;
    }
    public void setAge(int newAge){
       this.age = newAge;
    }

}
public class Bank {
    public static void main(String[] args) {
        Account a1 = new Account();
        a1.name = "Kartik";
        a1.setAge(22);
        System.out.println(a1.getAge());
    }

}
