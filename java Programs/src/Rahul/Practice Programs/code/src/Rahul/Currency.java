package Rahul;

import java.util.Scanner;

public class Currency {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" Enter the indian currency :");
        float inr = input.nextFloat();
        float dollar = inr / 79;
        System.out.println("Sample answer is " + dollar);

    }
}
