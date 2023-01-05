package logicalproblems;

import java.util.*;
public class StopWatch {

    public long startTimer = 0;
    public long stopTimer = 0;
    public long elapsed;

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long start,end;
        double time;
        System.out.println("Type any Character to start the stop watch: ");
        char s = sc.next().charAt(0);
         start = System.currentTimeMillis();
        System.out.println("Type any character to stop the stopwatch: ");
        char m = sc.next().charAt(0);
        end = System.currentTimeMillis();
        time = (end-start)/1000.0;
        System.out.println(time);


    }

}
