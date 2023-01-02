import java.util.Scanner;
public class Variable {
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in );
        System.out.println("Enter first number : " );
        int a = sc.nextInt();
        System.out.println(a);
        System.out.println("enter the second number");
        int b = sc.nextInt();
        System.out.println(b);
int sum = a+b;
        System.out.println("Sum of the no: " + sum);

    }
}
