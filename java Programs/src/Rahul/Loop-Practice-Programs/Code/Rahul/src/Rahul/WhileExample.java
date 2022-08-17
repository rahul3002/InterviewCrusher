package Rahul;

import java.util.Scanner;
class WhileExample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number = input.nextInt();
        while(number < 100) {
            System.out.println(number);
            number += 1;
        }
    }
}