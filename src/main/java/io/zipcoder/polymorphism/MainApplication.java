package io.zipcoder.polymorphism;

import java.sql.SQLOutput;
import java.util.Scanner;

/**
 * Created by leon on 11/6/17.
 */
public class MainApplication {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Hello, how many pets do you own?");
        int numberOfPets = input.nextInt();


        if (numberOfPets >= 1) {
            System.out.println("What kind of pet(s) are they?");
            String petType = input.nextLine();
            System.out.println("What is your pet(s) name?");
        }

    }
}
