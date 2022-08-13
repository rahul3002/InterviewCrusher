package Rahul;

import java.util.Scanner;

public class Factor {
    public static void main(String[] args) {
        Scanner input = new  Scanner(System.in);
        System.out.println("enter the number :");
        int num = input.nextInt();
        for (int i = 0; i <= num; i++) {
            if (i == 0) {
                continue;
            } else {
                if (num % i == 0) {
                    System.out.println(" Factors of 60 :");
                    System.out.println(i);
                }
            }
        }

    }
}