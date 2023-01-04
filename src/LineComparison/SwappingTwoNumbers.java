package LineComparison;

public class SwappingTwoNumbers {

    public static void main(String[] args) {
        int i = 10;
        int j = 20;

        System.out.println( "i = " + i + " and j = " + j);

        int temp = i;
        i = j;
        j = temp;
        System.out.println( "i = " + i + " and j = " + j);

    }
}
