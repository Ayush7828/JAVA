package DecisionControl;

import java.util.Scanner;

public class ThreeNumberGreater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Three Number ");
        int a = 1, b = 5, c = 3;
        if (a > b && a > c) {
            System.out.println("A is Greater " + a);
        } else if (b >= c) {
            System.out.println("B is Greater " + b);
        } else {
            System.out.println("C is Greater " + c);
        }
    }
}
