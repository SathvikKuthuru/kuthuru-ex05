/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Sathvik Kuthuru
 */

import java.util.Scanner;

public class Solution05 {
    // Ask the user to enter two numbers
    // Read the numbers from standard input
    // Calculate the sum, different, product, and quotient of the numbers
    // Print out results to standard output

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("What is the first number?");
        long first = scan.nextLong();
        System.out.println("What is the second number?");
        long second = scan.nextLong();
        long sum = first + second;
        long diff = first - second;
        long mult = first * second;
        long div = first / second;

        System.out.printf("%d + %d  = %d\n%d - %d = %d\n%d * %d = %d\n%d / %d = %d\n",
                first, second, sum, first, second, diff, first, second, mult, first, second, div);
    }
}
