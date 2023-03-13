package Loops;

public class forloopandforeach {
    public static void main(String[] args) {
        // for loop
        char[] vowel = { 'a', 'e', 'i', 'o', 'u' };

        for (int i = 0; i < vowel.length; i++) {
            System.out.println(vowel[i]);
        }

        // for each loop
        for (char item : vowel) {
            System.out.println(item);
        }

    }

}
