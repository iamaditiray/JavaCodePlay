//This code is owned by Aditi Ray
//These are a few Patterns created by For Loop in Java

//Pattern1: Inverted Triangle//
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

//Pattern2: Right Headed Triangle 
public class pattern3 {
    public static void main(String[] args) {
        int n = 4;
        for (int i = 1; i <= n; i++) {
            for (int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for (int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

//Pattern3: Downheaded Triangle with Numbers
package com.company;

public class pattern4 {
    public static void main(String[] args) {
        int n=5;
        for (int i=n; i>=1; i--){
            for (int j=1; j<=i; j++){
                System.out.print(j+" ");
            }System.out.println();
        }

    }
}
