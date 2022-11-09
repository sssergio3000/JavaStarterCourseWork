package Task4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter date: ");
        String str = scan.next();

        System.out.println("This date number is: "+new DateToNumber().dateToNumber(str));


    }//main
}//class Main
