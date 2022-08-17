package Rahul;

import java.util.Scanner;
// Q basic method implementation program
public class Main {
    public static void main(String[] args) {
          Sum();// Function Declaration
    }
    // Intilization of the method
    static void Sum(){
        Scanner input = new Scanner(System.in);
        System.out.println(" Enter the value of a : ");
        int a = input.nextInt();
        System.out.println("Enter the value of b : ");
         int b = input.nextInt();
         int sum = a +b ;
        System.out.println(" sum is "+ sum );

    }
}