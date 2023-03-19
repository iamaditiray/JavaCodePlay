package com.company;
import java.util.*;

class Game {
    int RandomNumber;
    int GuessedNumber;
    int noOfGuesses = 0;

    public int getNoOfGuesses() {
        return noOfGuesses;
    }

    public void setNoOfGuesses(int noOfGuesses) {
        this.noOfGuesses = noOfGuesses;
    }

    Game() {
        System.out.println("Welcome to the Guess the Number Game!" + "\n" + "---------------------------------------------");
        Random rand = new Random();
        RandomNumber = rand.nextInt(100);
    }

    public int UserInput() {
        System.out.println("Guess a Number from 0 to 100: ");
        Scanner sc = new Scanner(System.in);
        GuessedNumber = sc.nextInt();
        if(GuessedNumber>100 || GuessedNumber<0){
            System.out.println("Invalid Input! Choose a Number from 0 to 100.");
        }
        return GuessedNumber;
    }

    public boolean isCorrectNumber() {
        noOfGuesses++;
        if (RandomNumber == GuessedNumber) {
            System.out.println("Yes! You Guessed it Right! The Number was : " + RandomNumber
            +"\n"+"You Guessed it in : " + noOfGuesses + " attempts");
            return true;
        }
        else if (RandomNumber > GuessedNumber){
            System.out.println("The Number is too Low...");
        }
        else if (RandomNumber < GuessedNumber){
            System.out.println("The Number is too High...");
        }
        return false;
    }
}

public class GuessTheNumberGame {
    public static void main(String[] args) {
        Game g = new Game();
        boolean check = false;
        while (!check) {
            g.UserInput();
            check=g.isCorrectNumber();
        }
        System.out.println("\n"+"Your Score is: " + g.getNoOfGuesses());
        System.out.println("Thank you for Playing!");
    }
}
