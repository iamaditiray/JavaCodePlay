//This Code is owned by Aditi Ray
//This is a Traditional Rock, Paper Scissor Game which you will play with the computer.
//You have to choose certain numbers for your choices (Rock/Paper/Scissor) Which are explained in the code itself.
//Happy Gaming!

package com.company;
import java.util.Random;
import java.util.Scanner;
public class RockPaperScissorGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rn = new Random();
        System.out.println("Welcome to the Rock Paper Scissor Game: " + "\n"
                           + "--------------------------------------------");
        System.out.println("How many Rounds do you want to play? ");
        int turn = sc.nextInt();

        for (int i = 1; i <= turn; i++) {
            System.out.println("Enter Your Choice: " + "\n" + "(0 for ROCK, 1 for PAPER, 2 for SCISSOR)");
            int MyChoice = sc.nextInt();

            //MY TURN
            if (MyChoice == 0) {
                System.out.println("Your Choice: ROCK");
            } else if (MyChoice == 1) {
                System.out.println("Your Choice: PAPER");
            } else if (MyChoice == 2) {
                System.out.println("Your Choice:SCISSORS");
            } else {
                System.out.println("OOPS! INVALID CHOICE :( ");
            }
            //COMPUTER TURN
            int ComputerChoice = rn.nextInt(3);
            if (ComputerChoice == 0) {
                System.out.println("Computer Choice: ROCK");
            } else if (ComputerChoice == 1) {
                System.out.println("Computer Choice: PAPER");
            } else {
                System.out.println("Computer Choice: SCISSORS");
            }

            //RESULT
            if (MyChoice == ComputerChoice) {
                System.out.println("Draw!" + "\n");
            } else if ((MyChoice == 0 && ComputerChoice == 2) ||
                       (MyChoice == 1 && ComputerChoice == 0) ||
                       (MyChoice == 2 && ComputerChoice == 1)) {
                System.out.println("You win this ROUND!" + "\n");
            } else {
                System.out.println("Computer wins this ROUND!" + "\n");
            }
        }

    }
}

