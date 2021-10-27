package com.bridgelabz;

import java.util.Scanner;

public class UC9 {
    static final int IS_FULL_TIME = 1;
    static final int IS_PART_TIME=2;
    int wagePerHr;
    int empHrs = 0;
    int monthlyWage = 0;
    int totalWorkingHrs;
    int totalWorkingDays;
    int workedHrs=0;
    static int i;
    static int company1TotalWage;
    static int company2TotalWage;

    public static void main(String[] args){

        UC9 company1 = new UC9();
        UC9 company2 = new UC9();

        company1TotalWage=company1.employeeWage();
        System.out.println("Employee wage for company1: " + company1TotalWage);
        company2TotalWage=company2.employeeWage();
        System.out.println("Employee wage for company2: " + company2TotalWage);
    }
    public int employeeWage(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the wage_per_hr: ");
        wagePerHr = scanner.nextInt();
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
            int empWage = empHrs * wagePerHr;
            System.out.println("Employee wage is: " + empWage);
            monthlyWage+=empWage;
            workedHrs+=empHrs;
        }
        System.out.println("Employee Monthly wage is: " + monthlyWage);
        System.out.println("Working Days = " + i + ", Total working hrs = " + workedHrs);
        return monthlyWage;
    }
}

