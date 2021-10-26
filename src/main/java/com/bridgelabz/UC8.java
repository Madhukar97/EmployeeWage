package com.bridgelabz;

import java.util.Scanner;

public class UC8 {
    static final int IS_FULL_TIME = 1;
    static final int IS_PART_TIME=2;
    int WAGE_PER_HR;
    int empHrs = 0;
    int monthlyWage = 0;
    int totalWorkingHrs;
    int totalWorkingDays;
    int workedHrs=0;
    static int i;

    public static void main(String[] args){

        UC8 company1 = new UC8();
        UC8 company2 = new UC8();

        System.out.println("Employee wage for company1: ");
        company1.employeeWage();
        System.out.println("Employee wage for company2: ");
        company2.employeeWage();


    }
    public void employeeWage(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the wage_per_hr: ");
        WAGE_PER_HR = scanner.nextInt();
        System.out.println("Enter the total Working days: ");
        totalWorkingDays = scanner.nextInt();
        System.out.println("Enter the total working hrs in a month: ");
        totalWorkingHrs = scanner.nextInt();

        for ( i=0;i<totalWorkingDays && workedHrs<totalWorkingHrs;i++) {
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

