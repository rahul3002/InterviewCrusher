import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print(" Enter the Device name :");
        String mobile = input.next();

        switch (mobile) {
            case "iphone":
                System.out.println(" Iphone has a great Security");
                break;
            case "samsung":
                System.out.println(" Samsung is the Greatest phone");
                break;
            case "Vivo":
                System.out.println(" vivo has extreme great clearity");
                break;
            default:
                System.out.println("Please enter the valid phone");
                break;
        }
    }
}

