package task1;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter integer number: ");
        int num = scan.nextInt();
        System.out.println("Sum of figures is : " + NumberSummation.numSum(num));
    }
}
