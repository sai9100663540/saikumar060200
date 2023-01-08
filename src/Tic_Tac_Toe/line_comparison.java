package Tic_Tac_Toe;

public class line_comparison {
    static Math math;
    double length;
    double length1;
    public void point(double x1,double y1,double x2,double y2) {
        var z1 = math.pow((x2 - x1),2);
        var z2 = math.pow((y2 - y1),2);
        length = Math.sqrt(z1 + z2);
        System.out.println("Distance between two points :" + length);


    }
    public void point(int a,double b,double c,double d) {
        var a1 =  math.pow(( a - b),2);
        var a2 = math.pow((c - d),2);
        length1 = Math.sqrt(a1 + a2);
        System.out.println("Distance between two points :" + length1);

    }

    public void compare() {

        if(length == length1)
        {

            System.out.println("both are equal");
        }
        else if(length > length1){
            System.out.println("length is greater than length1");
        }
        else if(length < length1)
        {
            System.out.println("length is less than length1");
        }
    }
    public void equality() {
        if(length == length1)
        {
            System.out.println("Both lines are equal");
        }
        else
        {
            System.out.println("Both lines are not equal");
        }
    }
    public static void main(String[] args) {

        line_comparison l =new line_comparison();
        l.point(23.2, 24.1, 15.4, 15.2);
        l.point(7,8,9,10);
        l.compare();
        l.equality();

    }
}
