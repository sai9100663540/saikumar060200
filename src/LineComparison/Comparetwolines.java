package LineComparison;

public class Comparetwolines {

    static Math math;
    public static void main(String[] args) {
        double x1 = 1;
        double y1 = 8;
        double x2 = 1.5;
        double y2 = 7;
        var z1 = math.pow((x2 - x1),2);
        var z2 = math.pow((y2 - y1),2);
        double a = 5;
        double b = 4;
        double c = 9;
        double d = 3;
        var a1 =  math.pow(( a - b),2);
        var a2 = math.pow((c - d),2);

        // Calculate Length between two points
        double length = Math.sqrt(z1 + z2);
        double length1 = Math.sqrt(a1 + a2);
        System.out.println("Distance between two points :" + length);
        System.out.println("length1 between two points :" + length1);
        if(length == length1)
        {
            System.out.println("both are equal");
        }
        else if(length > length1){
            System.out.println("z1 is greater than z2");
        }
        else if(length < length1)
        {
            System.out.println("z1 is less than z2");
        }
    }
}
