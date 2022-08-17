package Rahul;

import java.util.Scanner;

public class StringArgsExample {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print(" Enter your name :");
        String name = input.next();
        String ans = greet(name);
        System.out.println(greet(name));
    }


    static String greet(String name){
        String message =" Hello "+ name;
        return message;
    }

}
