package JCS;



public class JumpStatement {
    public static void main(String[] args) {
        String color = "Red";
        switch(color){
            case "Red":
                System.out.println("Stop and wait");
                break;
            case "Green":
                System.out.println("You can go");
                break;
            case "Yellow":
                System.out.println("Get ready and wait for green signal");
                break;
            default:
                System.out.println("Signal light is not working");
        }
    }
}
