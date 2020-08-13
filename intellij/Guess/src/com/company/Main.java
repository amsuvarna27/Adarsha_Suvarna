package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int randomNumber = (int)(Math.random()*100)+1;
        boolean hasWon = false;
        System.out.println("Choose the number between 1 to 100: ");
        System.out.println("Try to guess random number: ");

        Scanner s = new Scanner(System.in);

        for(int i=10; i>0; i--)
        {
            System.out.println("You have "+ i + " guess remaining. ");
            int guess = s.nextInt();

            if(randomNumber < guess)
            {
                System.out.println("This number is less than your guessed number " + guess + ".");
            }
            if(randomNumber > guess)
            {
                System.out.println("This number is greater than your guessed number " + guess + ".");

            }
            if(randomNumber == guess)
            {
                hasWon = true;
                break;
            }
        }
        if(hasWon)
        {
            System.out.println("Congrats you win!!!!");
        }
        else
        {
            System.out.println("You lost!!!");
            System.out.println("The number was: " + randomNumber);
        }

    }
}
