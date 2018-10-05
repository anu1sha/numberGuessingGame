package lickingheights.com;

import java.awt.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// initializing
       int pickedNumber;
       pickedNumber = (int)Math.random();
        Scanner keyboard;
        keyboard = new Scanner(System.in);
        String consent;
        int number;

        System.out.println("Would you like to play the number guessing game?");
        consent = keyboard.nextLine();
        System.out.println("Alright then lets begin");
        System.out.println("There will be a randomly generated number and you will try to guess what it is");
        System.out.println("Okay go ahead and guess the number");
        number = keyboard.nextInt();
        if (pickedNumber<number)
            System.out.println("That number is too big try again");
        else if (pickedNumber>number)
            System.out.println("That number is too small try again");
        else if (pickedNumber == number)
            System.out.println("Congrats you guessed correctly!");
        System.out.println("Try to guess the number again");
        number = keyboard.nextInt();
        if (pickedNumber<number)
            System.out.println("That number is too big try again");
        else if (pickedNumber>number)
            System.out.println("That number is too small try again");
        else if (pickedNumber == number)
            System.out.println("Congrats you guessed correctly!");



    }
}
