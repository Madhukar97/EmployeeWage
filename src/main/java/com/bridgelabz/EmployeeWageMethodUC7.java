package com.bridgelabz;

public class EmployeeWageMethodUC7 {
    static  final int IS_FULL_TIME = 1;
    static  final int IS_PART_TIME=2;
    static final int WAGE_PER_HR = 20;
    static int empHrs = 0;
    static int monthlyWage = 0;
    static int totalWorkingHrs = 100;
    static int workedHrs=0;
    static int i;

    public static void main(String[] args){

        employeeWage();


    }
    public static void employeeWage(){
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
