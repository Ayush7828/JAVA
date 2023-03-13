package Questions;

import java.util.Scanner;

public class CheckVowelAndConsonant {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.err.println("Enter a Character ");
        char ch = sc.next().charAt(0);
        if (ch == 'a' || ch == 'e' || ch == 'o' || ch == 'u' || ch == 'i') {
            System.out.println("It is Vowel " + ch);
        } else {
            System.out.println("It is Consonant " + ch);
        }
    }
}
