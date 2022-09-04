package rahul;

import java.util.Scanner;

public class Students {
    public static void main(String[] args) {

        name();
        marks();
    }
            static void name(){
                Scanner input = new Scanner(System.in);
                System.out.print(" Enter the name of the student : ");
                String name = input.next();


           }
           static void marks(){
                Scanner input = new Scanner(System.in);
               System.out.println(" Enter the Marks of the Student :");
               float marks = input.nextFloat();

           }

}
