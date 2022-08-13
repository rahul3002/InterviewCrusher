package Rahul;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of a");
        int a = input.nextInt();
        System.out.println("value of b");
        int b = input.nextInt();;
        System.out.println("value of c");
        int c = input.nextInt();


        System.out.println((a*a*a)+(b*b*b)+(c*c*c));
    }
}
