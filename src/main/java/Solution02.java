/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Max Llanes
 */

import java.util.Scanner;

public class Solution02 {
    /*
        promt user for string
        ouput string and string length

     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String word;
        System.out.println("What is the input string? ");
        word = input.nextLine();
        System.out.println(word + " has " + word.length() + " characters.");
    }
}
