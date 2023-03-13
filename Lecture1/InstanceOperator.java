package Lecture1;

public class InstanceOperator {

    public static void main(String[] args) {
        String str = "Programming";
        boolean result;
        // check if str is instance of
        // String Class
        result = str instanceof String;
        System.out.println("Is Str an object of String ? " + result);

        // Question
        int x = 0, y = 0, c = 1;
        int re = (x++) + (y++) + (c++);
        System.out.println(x);
        System.out.println(y);
        System.out.println(c);
        System.out.println(re);
    }
}
