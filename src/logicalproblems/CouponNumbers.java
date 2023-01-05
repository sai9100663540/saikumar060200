package logicalproblems;

import java.util.*;
public class CouponNumbers {
    public static int distinctCouponCollect(int num){
        boolean[] isCollected = new boolean[num];
        int count = 0;
        int distinctNumber = 0;
        while (distinctNumber < num) {
            int couponNumber = (int) (Math.random()*10 % num);
            count++;
            if(!isCollected[couponNumber]){
                distinctNumber++;
                isCollected[couponNumber] = true;
                System.out.println("Distinct coupon Number " + couponNumber);
            }
        }
        return count++;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number ");
        int num = sc.nextInt();
        int countValue = distinctCouponCollect(num);
        System.out.println("Total random Numbers generated " + countValue);
    }

}
