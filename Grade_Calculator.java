package com.company;
import java.util.Scanner;

public class Grade_Calculator {
    public static void main(String[] args) {
        Scanner s=new Scanner (System.in);
        System.out.print("Enter Name of the Student: ");
        String name=s.nextLine();
        System.out.println("Enter Number Of Subjects: ");
        float noOfSub=s.nextFloat();
        System.out.print("Enter Total Marks in Each Subject: ");
        float total = s.nextFloat();
        System.out.println("Enter Marks is English: ");
        float english=s.nextFloat();
        System.out.println("Enter Marks is Bengali: ");
        float bengali=s.nextFloat();
        System.out.println("Enter Marks is Mathematics: ");
        float math=s.nextFloat();
        System.out.println("Enter Marks is Science: ");
        float science=s.nextFloat();
        System.out.println("Enter Marks is History: ");
        float history=s.nextFloat();
        float sum=english+bengali+math+science+history;
        float percentage=(sum/(noOfSub*total))*100;
        System.out.println("Your percentage is: " + percentage);
    }

}
