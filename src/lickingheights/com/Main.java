package lickingheights.com;

import java.awt.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // initializing
        int pickedNumber;
        pickedNumber = (int) (Math.random() * 100);
        Scanner keyboard;
        keyboard = new Scanner(System.in);
        String consent;
        int number;

        System.out.println("Would you like to play the number guessing game?");
        consent = keyboard.nextLine();
        System.out.println("Great! I'll explain the rules");
        System.out.println("There will be a randomly generated number and you will try to guess what it is");
        System.out.println("You will only get 3 tries to guess the number");
        System.out.println("Are you ready to begin?");
        consent = keyboard.nextLine();
        System.out.println("You can go ahead and guess the number now. Good luck!");
        number = keyboard.nextInt();

        if (pickedNumber < number)
            System.out.println("That number is too big try again");
        else if (pickedNumber > number)
            System.out.println("That number is too small try again");
        else if (pickedNumber == number)
            System.out.println("Congrats you guessed correctly!");

        number = keyboard.nextInt();
        if (pickedNumber < number)
            System.out.println("That number is too big try again");
        else if (pickedNumber > number)
            System.out.println("That number is too small try again");
        else if (pickedNumber == number)
            System.out.println("Congrats you guessed correctly!");

        number = keyboard.nextInt();
        if (pickedNumber < number)
            System.out.println("That number is too big :( Good try though maybe you will do better next time.");
        else if (pickedNumber > number)
            System.out.println("That number is too small :( Good try though, maybe you will do better next time.");
        else if (pickedNumber == number)
            System.out.println("Congrats you guessed correctly!");







    }
}
