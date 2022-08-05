package Rahul;

import java.util.Scanner;

public class Conditional_Loops {
    public static void main(String[] args) {
       /* Scanner input = new Scanner(System.in);

            System.out.println(" Enter the number :");
           *//* syntax of while loop
            while(condition)
            {
                    // code
            }


            *//*
           // basic while loop
        // program for priting numbers
            int n = input.nextInt();
            while (n != 100)// while loop is use when we dont know how many time loop has been used
            {
                System.out.print(n + " ");
                System.out.println("Hello World");
                n++;
            }
            */
            // for loop

        // print no 1 to 100 using for loop
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for (int num = 1; num <= n ; num++) {
            System.out.print( n + " ");
            System.out.println("Hello World");

        }
         }

    }

