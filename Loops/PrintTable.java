package Loops;

public class PrintTable {
    public static void main(String[] args) {
        int num = 5;
        int table;
        for (int i = 1; i <= 10; i++) {
            table = num * i;
            System.out.printf("%d*%d=%d \n", num, i, table);
        }
        System.out.println();
    }
}
