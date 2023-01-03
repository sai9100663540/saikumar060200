package EmployeeWage;

public class snake_and_ladder {

    public static void main(String[] args) {

        int diecount = 0;
        String asf = "";
        int position = 0;


        while (position < 100) {

            int NumberOnDie = RandomNumber(1, 6);
            int NextMove = RandomNumber(1, 3);

            diecount++;
            asf += position + " -> ";

            if (NextMove == 1) {

            } else if (NextMove == 2) {
                position += NumberOnDie;
            } else {
                position -= NumberOnDie;
            }

            if (position < 0) {
                position = 0;
            }

            if (position > 100) {
                position -= NumberOnDie;
            }

        }

        System.out.println(diecount);
        System.out.println(asf + 100);


    }

    public static int RandomNumber(int Min, int Max) {
        int r = Min + (int) (Math.random() * ((Max - Min) + 1));
        return r;
    }

}