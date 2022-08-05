package Rahul;
// program for employee information using if-else statement
import java.util.Scanner;

public class Employee {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // input taken for employee
            System.out.println(" Enter the name of the employee :");
                String employee_Name = input.next();
                // input for the company
                System.out.println("Enter the name of the company :");
                String company_Name = input.next();
        // input for the salary
                System.out.println("Enter the salary :");
                    int salary = input.nextInt();
                    if (salary > 10000){
                        System.out.println("True");
                    } else if (salary < 10000) {
                        System.out.println("False");

                    }
        System.out.println("Empolyee name is "+ employee_Name);
        System.out.println("Company name is "+ company_Name);
        System.out.println("your salary is "+ salary);


    }
}
