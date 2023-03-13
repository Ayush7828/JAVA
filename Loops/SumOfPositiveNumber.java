package Loops;

import java.util.Scanner;

public class SumOfPositiveNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number ");
        int num = sc.nextInt(), sum = 0;
        while (num >= 0) {
            sum += num;
            num = sc.nextInt();
        }
        System.out.println(sum);
    }
}
