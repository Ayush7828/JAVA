package Loops;

import java.util.Scanner;

public class FibonaaciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number ");
        int num = sc.nextInt();
        int t1 = 0, t2 = 1, t3;

        for (int i = 0; i <= num; i++) {
            System.out.print(t1 + " ");
            t3 = t1 + t2;
            t1 = t2;
            t2 = t3;
        }
    }
}
