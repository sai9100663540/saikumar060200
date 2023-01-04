package gamblerproblem;

public class GamblingSimulator {

    public static void main(String[] args){
        int stake = 100;
        int betsPerGame = 1;
        int totalAmount = 0;
        int dayloss = 0;
        int daywon = 0;
        for (int i = 1; i <= 20; i++) {

            double wimOrLoose = Math.floor(Math.random() * 10) % 2;
            if (betsPerGame == wimOrLoose) {
                System.out.println("you won  the game: ");
                stake = stake + 1;
                System.out.println("after winning the game your total amount is:" + stake);
            } else {
                System.out.println("you loose  the game: ");
                stake = stake - 1;
                System.out.println("after loosing the game your total amount is:" + stake);
            }
        }
        if (stake == 50) {
            System.out.println("Today you loose 50% amount so have to resign for the day");
            dayloss = dayloss + 1;
        } else {
            System.out.println("Today you won your 50% amount so you have to resign fot the day");
            daywon = daywon + 1;
        }
        totalAmount = totalAmount + stake;
        System.out.println(totalAmount);
        System.out.println("after 20 days of playing total amount is: " + totalAmount);
        if (totalAmount > 2000) {
            int profit = totalAmount - 2000;
            System.out.println("you are in profit by: " + profit);
        } else if (totalAmount < 2000) {
            int loss = 2000 - totalAmount;
            System.out.println("you are in loss by: " + loss);
        } else {
            System.out.println("you are neither in loss nor in profit: " + totalAmount);
        }
        System.out.println("In a month" + daywon + "days won and" + dayloss + "days lost");
    }

}


