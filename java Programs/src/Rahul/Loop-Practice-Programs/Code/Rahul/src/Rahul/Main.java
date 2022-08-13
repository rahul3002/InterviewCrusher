package Rahul;

import java.util.Scanner;
// Q Find the area of the circle
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the area of the circle :");
       //user input for the radius of tne circle
        int r = input.nextInt();
        double pi = 3.14, area;
        area = pi*r*r;// formula of the circle
        System.out.println("Area of circle is "+ area);// output has to be printed



    }
}