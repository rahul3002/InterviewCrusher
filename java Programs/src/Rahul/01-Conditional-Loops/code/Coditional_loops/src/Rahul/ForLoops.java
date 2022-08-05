package Rahul;

import java.util.Scanner;

public class ForLoops {
    public static void main(String[] args) {
      /*  Scanner input = new Scanner(System.in);

        // program of printing 0 to n number
        int n = input.nextInt();
        for (int num = 1; num <= n ; num++) {
            System.out.print(num + " ");
        }
        */

        /*Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        for (int i = 1; i <= a ; i++) {
            System.out.print(i + " ");
            System.out.println(" Hello World ");*/

        // do while loop syntax
        /*
        do {
                //body
        }
        while()
         */


       // progaram for running n number using do while loop
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        do { // do will execute once if while condition is wrong then also
            System.out.println(a);
            System.out.print(" Hello World ");
            a++;
        } while(a <= 5);//
    }
}
