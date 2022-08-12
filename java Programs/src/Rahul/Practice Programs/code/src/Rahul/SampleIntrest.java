package Rahul;

import java.util.Scanner;

public class SampleIntrest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the principal");
        float p = input.nextFloat();
        System.out.println("Enter the rate :");
        float r = input.nextFloat();
        System.out.println("Enter the time :");
        float t = input.nextFloat();
        float sinterst = (p*r*t)/100;
        System.out.println("sample intrest is " + sinterst);




    }

}
