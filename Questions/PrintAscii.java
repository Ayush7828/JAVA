package Questions;

import java.util.Scanner;

public class PrintAscii {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Character ");
        char ch = sc.next().charAt(0);
        int ascii = ch;
        System.out.println(ascii);
    }
}
