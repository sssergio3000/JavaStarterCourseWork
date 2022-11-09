package Task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter int number that you want to be reversed: ");
        int num = scan.nextInt();
        String str = new Integer(num).toString();
        if (!str.contains("0")){
            System.out.println("Reversed number is: " + NumberReversedNoZero.reversed(num));

        }
    }
}
