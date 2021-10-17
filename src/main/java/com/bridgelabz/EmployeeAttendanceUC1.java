package com.bridgelabz;

public class EmployeeAttendanceUC1 {

    public static void main(String[] args){

        double empAttendance = Math.floor(Math.random() * 10) % 2 ;
        if (empAttendance==0){
            System.out.println("Employee is present.");
        }else if (empAttendance==1)
            System.out.println("Employee is absent");

    }

}
