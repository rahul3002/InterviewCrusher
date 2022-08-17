package Rahul;

import java.util.Scanner;

public class StringExample {
    public static void main(String[] args) {
         name();
        ans();

    }
    static String name() {
        Scanner input = new Scanner(System.in);
        System.out.print(" Enter the String Name :");
        String name = input.next();
        return name;
    }

    static String ans(){
        System.out.println( "String name is : " + name());
        return ans();
    }
}
