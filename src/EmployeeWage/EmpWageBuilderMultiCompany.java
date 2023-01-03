package EmployeeWage;

public class EmpWageBuilderMultiCompany {
    public static final  int IS_PART_TIME = 1;
    public static final int IS_FULL_TIME = 2;

    public static int computeEmpWage(String company,int empRatePerHour,int numOfWorkingDays,int maxHoursPerMonth)
    {
        int empHrs = 0,totalEmpHrs = 0,totalWorkingDays = 0;

        while(totalEmpHrs<=maxHoursPerMonth && totalWorkingDays<numOfWorkingDays)
        {
            totalWorkingDays++;
            int empcheck= (int) Math.floor(Math.random() * 10) %3;
            switch (empcheck)
            {
                case IS_PART_TIME:
                    empHrs = 4;
                    break;
                case IS_FULL_TIME:
                    empHrs = 8;
                    break;
                default:
                    empHrs = 0;
                    break;
            }
            totalEmpHrs += empHrs;
            System.out.println("Day: " + totalWorkingDays + "empHrs: " + empHrs);
        }
        int totalEmpWage = totalEmpHrs * empRatePerHour;
        System.out.println("totalEmpWagesforcompany is: " + totalEmpWage);
        return totalEmpWage;
    }

    public static void main(String[] args) {
        computeEmpWage("company1 ",20,2,10);
        computeEmpWage("company2 ",10,4,20);



    }

}