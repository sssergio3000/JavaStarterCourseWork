package Task3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter name: ");
        String str = scan.next();

        System.out.println("Name number is: " + new NameToNumber().nameToNumber(str));




        }
    }



