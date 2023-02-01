package be.intecbrussel;
import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {

//oefening 1 Maak een programma dat een willekeurig getal tussen 1 en 100 genereert met behulp van de Random class en het aantal pogingen toont totdat het getal 50 bereikt is.
        Random randomNumber = new Random();
        int num;
        int att = 1;

        do {
            num = randomNumber.nextInt(1, 100);
            System.out.println(num++);
            System.out.println("Attempts: " + att++);
        } while (num != 51);

// oefening 2 en 3 Maak een programma dat de gebruiker vraagt om een getal te raden tussen 1 en 20 met behulp van de Scanner en Random class. Het programma zegt of het gerade getal hoger of lager is dan het geraden getal.
//Breidt oefening 2 uit zodat de gebruiker maar 5 pogingen heeft om het getal te raden.

        Scanner in = new Scanner(System.in);
        System.out.println("Hi! Do you want to play game?\n Yes - y; No - n.");
        String ans = in.nextLine();
        int count;
        int numb;
        int attempts = 1;
        numb = randomNumber.nextInt(20);

        switch (ans) {
            case "n":
                System.out.println("it's very sad...");
                break;
            case "y":
                do {
                    System.out.println("I made a number from 1 to 20\n you have to guess it...");
                    count = in.nextInt();
                    if (count<numb){
                        System.out.println("Your number is less than mine...");
                        System.out.println("Attempt: " + attempts++);
                    }else if (count>numb){
                        System.out.println("Your number is bigger than mine...");
                        System.out.println("Attempt: " + attempts++);
                    }else{
                        System.out.println("You did it!");
                        System.out.println("Total number of attempts: " + attempts++);
                    }

                } while (count != numb&&attempts != 6);
                if (attempts == 6){
                    System.out.println("Sorry, you've lost");
                }else{
                    System.out.println(" ");
                }
        }

    }
}
