package Rahul;
import java.awt.*;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Primitives {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the name of the student :");
        String name = input.next();
        System.out.println("plzz enter your roll no :");
        int rollno = input.nextInt();
        System.out.println("Enter your percenatge : ");
        float percentage = input.nextFloat();
        System.out.println("your roll no is " + rollno);
        System.out.println("Your name is "+ name);
        System.out.println("your percentage is "+ percentage);
       /* //type casting
        int num = (int) (4374823.534435d); // double variable converted into the String
        System.out.println(num);// int and float can print without quotes & string have to print in quotes
        String name = (String) ('r');
        System.out.println(String);
        // char cannot converted into the String
        */

        // basic if statment
        /*int a = 10;
        if (a == 10)
        {
            System.out.println("Hello World");
        }*/
        // basic while loop program
      /*   int i = 1;
            while(i != 5)
            {
            System.out.println(i);
            i++;
        }*/

            // for loop program
        int i = 26;
            for (i = 0; i!=26; i++)
            {
                System.out.println(i);
            }
    }

}
