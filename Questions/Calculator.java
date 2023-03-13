package Questions;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Two Number ");
        int a = sc.nextInt(), b = sc.nextInt();
        // Add
        int add = a + b;
        System.out.println("Addition" + add);
        // subtract
        int sub = a - b;
        System.out.println("Subtraction" + sub);
        // multiply
        int mul = a * b;
        System.out.println("Multiplication" + mul);
        // divide
        int div = a / b;
        System.out.println("Division" + div);

    }
}
