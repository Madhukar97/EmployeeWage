package com.bridgelabz;

public class WagesForMonthUC5 {

    public static void main(String[] args){

        final int IS_FULL_TIME = 1;
        final int IS_PART_TIME=2;
        final int WAGE_PER_HR = 20;
        int empHrs = 0;
        int monthlyWage = 0;

        for (int i=0;i<20;i++) {
            int empCheck = (int) Math.floor(Math.random() * 10) % 3;
            switch (empCheck) {
                case IS_FULL_TIME: empHrs = 8; break;
                case IS_PART_TIME: empHrs = 4; break;
            }
            int empWage = empHrs * WAGE_PER_HR;
            System.out.println("Employee wage is: " + empWage);
            monthlyWage+=empWage;
        }
        System.out.println("Employee Monthly wage is: " + monthlyWage);
    }
}
