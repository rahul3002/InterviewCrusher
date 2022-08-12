package Rahul;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
            int num;
        System.out.println(" Enter the number ");
        num = input.nextInt();
        if(num % 2 == 0){
            System.out.println("Number is odd");
        }
        else {
            System.out.println("No is even");
        }

    }
}