package Rahul;

import java.util.Scanner;
// Q calcualte the area of Rectangle
public class Rectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Area of Rectangle :");
        // user input for the width and length
            double w = input.nextDouble();
            double l = input.nextDouble();
            double area = w * l;
// output for the rectangle
        System.out.println("Area of rectangle is "+ area);
    }
}
