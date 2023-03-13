package Loops;

import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int c = 0;
        while (num > 0) {
            // remove last digit

            num = num / 10;
            c++;
        }
        System.out.println(c);
    }
}
