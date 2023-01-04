package LineComparison;

import java.util.Scanner;

public class EvenOdd {

    public static void main(String[] args) {
        System.out.println("give a number : ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if (x%2 == 0)
            System.out.println("Even number");
        else
            System.out.println("Odd number");

    }
}
