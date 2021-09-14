package org.example;
import java.util.Scanner;

/**
 * UCF COP3330 Fall 2021 Assignment 1 Solution
 * Copyright 2021 Anh Pham
 *
 */
public class App 
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Press C to convert from Fahrenheit to Celsius.");
        System.out.println("Press F to convert from Celsius to Fahrenheit.");
        System.out.print("Your choice: ");
        char choice = in.next().toUpperCase().charAt(0);

        if (choice == 'C') {
            System.out.print("Please enter the temperature in Fahrenheit: ");
            double temp = in.nextDouble();
            double result = (temp - 32) * 5/ 9;
            System.out.println("The temperature in Celsius is " + result + ".");
        } else {
            System.out.print("Please enter the temperature in Celsius: ");
            double temp = in.nextDouble();
            double result = (temp * 9/5) + 32;
            System.out.println("The temperature in Fahrenheit is " + result + ".");
        }
    }
}


