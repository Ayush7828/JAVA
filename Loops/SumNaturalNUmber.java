package Loops;

import java.util.Scanner;

public class SumNaturalNUmber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a numebr ");
        int n = sc.nextInt(), sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += i;
        }
        System.out.println("Sum OF Natural Number " + sum);
    }
}
