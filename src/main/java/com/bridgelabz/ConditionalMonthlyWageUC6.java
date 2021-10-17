package com.bridgelabz;

public class ConditionalMonthlyWageUC6 {

    public static void main(String[] args){

        final int IS_FULL_TIME = 1;
        final int IS_PART_TIME=2;
        final int WAGE_PER_HR = 20;
        int empHrs = 0;
        int monthlyWage = 0;
        int totalWorkingHrs = 100;
        int workedHrs=0;
        int i;

        for ( i=0;i<20 && workedHrs<totalWorkingHrs;i++) {
            int empCheck = (int) Math.floor(Math.random() * 10) % 3;
            switch (empCheck) {
                case IS_FULL_TIME -> empHrs = 8;
                case IS_PART_TIME -> empHrs = 4;
            }
            int empWage = empHrs * WAGE_PER_HR;
            System.out.println("Employee wage is: " + empWage);
            monthlyWage+=empWage;
            workedHrs+=empHrs;
        }
        System.out.println("Employee Monthly wage is: " + monthlyWage);
        System.out.println("Working Days = " + i + ", Total working hrs = " + workedHrs);
    }
}
