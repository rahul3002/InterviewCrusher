package Rahul;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" Enter the Area of Triangle :");
        double breath = input.nextDouble();
        double height = input.nextDouble();

        double area = (breath * height) / 2;
        System.out.println("Area of triangle " + area);
    }

}
