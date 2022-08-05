package Rahul;

import java.util.Scanner;

public class Conditionals {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // input for the salary program
        System.out.println("Enter the salary :");
        int salary = input.nextInt();
        // if else statment for the salary progarm
        if (salary > 10000){
            System.out.println(" true ");
        } else if (salary < 10000) {
            System.out.println(" false ");
        }

    }
}

