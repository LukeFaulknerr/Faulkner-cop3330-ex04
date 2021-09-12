/*
    UCF COP3330 Fall 2021 Assignment 4 Solution
    Copyright 2021 Luke Faulkner
 */

import java.util.Scanner;

public class ex04 {
    public static void main(String[] args) {
        // Variables / Objects
        Scanner readName = new Scanner(System.in);
        String noun, verb, adjective, adverb;

        // Prompts
        System.out.print("Enter a noun: ");
        noun = readName.nextLine();

        System.out.print("Enter a verb: ");
        verb = readName.nextLine();

        System.out.print("Enter an adjective: ");
        adjective = readName.nextLine();

        System.out.print("Enter an adverb: ");
        adverb = readName.nextLine();

        // Output
        System.out.print("Do you " + verb + " your " + adjective + " " + noun + " " + adverb + "? That's hilarious!");
    }
}
