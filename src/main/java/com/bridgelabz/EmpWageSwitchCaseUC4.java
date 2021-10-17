package com.bridgelabz;

public class EmpWageSwitchCaseUC4 {

    public static void main(String[] args){

        double IS_FULL_TIME=1;
        double IS_PART_TIME=2;
        int WAGE_PER_HR = 20;
        int empHrs = 0;

        double empCheck = Math.floor(Math.random()* 10) % 3;
        if(empCheck==IS_FULL_TIME){
            empHrs = 8;
        }else if (empCheck==IS_PART_TIME)
            empHrs = 4;

        int empWage = empHrs * WAGE_PER_HR;
        System.out.println("Employee wage is: " + empWage);

    }
}
