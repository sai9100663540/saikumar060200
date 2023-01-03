package LineComparison;

public class LineBasedProgram {
    static Math math;

    public static void main(String[] args) {
        double x1=2;
        double y1=7;
        double x2=8;
        double y2=9;
        // Calculate Length between two points
        double length = Math.sqrt((math.pow((x2 - x1),2) + Math.pow((y2 - y1),2)));
        System.out.println("Distance between two points :" + length);
    }

}

