package Rahul;

import javax.lang.model.SourceVersion;
import javax.lang.model.util.ElementScanner6;
import java.util.Scanner;

public class CaseChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char ch = input.next().trim().charAt(0);

        if (ch >= 'a' && ch <= 'z') {
            System.out.println("LowerCase");
        }
            else {
                System.out.println("UpperCase");
            }
        }
    }

