package DecisionControl;

import java.util.Scanner;

public class IncomeTaxCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Income ");
        int income = sc.nextInt();
        float tax;
        if (income <= 500000) {
            tax = 0;
            System.out.println("No Pay Tax");
        } else if (income >= 500000 && income <= 100000) {
            tax = income * 0.2f;
            // 20 percent
            System.out.println("Pay Tax 10 Percent " + tax);
        } else {
            tax = income * 0.3f;
            System.out.println("Pay 30 Percent Tax " + tax);
        }
    }
}
