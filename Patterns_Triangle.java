package com.company;

public class pattern2 {
    public static void main(String[] args) {
        int n=4;
        //rank of row=number of stars ; row 1= 1 star ; row 2 = 2 star and so on... so, row number=total columns
        for (int i=n; i>=1; i--){
            for(int j=i; j>=1; j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
