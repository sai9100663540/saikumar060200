package LineComparison;
import java.util.Scanner;


public class LargestNumber {
    public static void main(String[] args ) {

            System.out.print("a : ");
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();

            System.out.print("b : ");
            int b = sc.nextInt();

            System.out.print("c : ");
            int c = sc.nextInt();

            if (a>b && a>c)
                System.out.println("Largest number is:" + a);
            else if (b>c)
                System.out.println("Largest number is:" + b);
            else
                System.out.println("Largest number is:" + c);


        }
}
