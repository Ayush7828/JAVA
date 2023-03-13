package Lecture1;

public class Operators {
    public static void main(String[] args) {
        int a = 6;
        a++;
        System.out.println(a);
        // output 7
        int b = 7;

        System.out.println(b++);
        // output 7
        System.out.println(b);
        // output

        int c = 8;
        c--;
        --c;
        System.out.println(c);
        // outpput 6

        int d = 2, e = 10;
        System.out.println(--d);
        System.out.println(e--);
        System.out.println(e);
        System.out.println(d);
        // output
        // 1
        // 10
        // 9
        // 1

        // Ternary Opertaor
        int februaryDays = 28;
        String result = (februaryDays == 28) ? "Not A leap Year" : "Yes IT is A leap Year";
        System.out.println(result);

        int day = 45;
        System.out.printf("%d", day);

    }
}
