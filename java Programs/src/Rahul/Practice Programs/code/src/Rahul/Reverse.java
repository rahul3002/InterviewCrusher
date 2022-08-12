package Rahul;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name = input.next();
        String temp = input.next();
        if(name.equals(temp))
        {
            System.out.println("String is palindrome");
        }
        else {
            System.out.println("not palindrome");
        }
    }
}
