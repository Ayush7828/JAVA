package Questions;

import java.util.Scanner;

public class SwapNmber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number ");
        int a = sc.nextInt(), b = sc.nextInt();
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After Swapping a = " + a + " b = " + b + "");

    }
}
