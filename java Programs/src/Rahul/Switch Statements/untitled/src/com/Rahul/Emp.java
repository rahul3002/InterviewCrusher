package com.Rahul;

import java.util.Scanner;
// Q code emp id and department using nested statements
public class Emp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int empID = input.nextInt();
        String department = input.next();

            switch(empID)
            {
                case 1:
                    System.out.println("Enter the correct EmpID:");
                    break;
                case  2:
                    System.out.println("abc");
                    break;
                case  3: //Nested statements has beeen added
                    System.out.println("Enter the value");
                    switch (department){
                        case "it":
                            System.out.println("Computer Engineering");
                            break;
                        case  "cloud":
                            System.out.println("Devops");
                            break;
                    }
                default:
            }

    }
}
