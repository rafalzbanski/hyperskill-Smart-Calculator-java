package stage1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        System.out.println(sum(num1, num2));

    }

    private static int sum(int num1, int num2) {
        return num1 + num2;
    }
}
