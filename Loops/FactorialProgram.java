package Loops;

import java.util.Scanner;

public class FactorialProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number ");
        int fact = 1;
        int num = sc.nextInt();
        for (int i = 2; i <= num; i++) {
            fact *= i;
        }
        System.out.println("Factorial of " + num + " is " + fact);
    }

}
