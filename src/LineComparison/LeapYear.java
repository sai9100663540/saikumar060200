package LineComparison;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        int year;
        System.out.println("enter the year : ");
        Scanner sc = new Scanner(System.in);
        year = sc.nextInt();
        if (year % 4 == 0)
            System.out.println("Leapyear");
        else
            System.out.println("Not a Leapyear");
    }
}
