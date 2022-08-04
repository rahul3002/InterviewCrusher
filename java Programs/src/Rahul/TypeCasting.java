package Rahul;

import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //type casting
         // int and float can print without quotes & string have to print in quotes
        String name = (String) ('r');
        System.out.println(String);
        // char cannot converted into the String

        byte a = 23;
        byte b = 43;
        byte c = 32;
        int d = a + b * c;
                System.out.println(d);
                int a = 123;
                float decimal = 12.4f;
                long abc = 123231231212L;
                double digits = 21312312.34321;
                int c = (int) ((a * digits) + (decimal * abc));
                System.out.println(("(a * digits) + (decimal * abc))"++ "(a * digits) + (decimal * abc)");
                System.out.println(c);




    }

}
