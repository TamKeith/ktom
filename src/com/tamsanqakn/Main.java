package com.tamsanqakn;

import java.util.Scanner;

public class Main {

    static double kilometers = 0;
    static double miles = 0;

    public static void main(String[] args) {

        boolean quit = false;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the ****Kilometers to Miles Converter****");

        while(!quit) {

            System.out.println("Enter the Distance in Kilometers: ");

            boolean isANumber = scanner.hasNextDouble();

            if(isANumber) {

                String input = scanner.nextLine();
                kilometers = Double.parseDouble(input);
                miles = kilometers / 1.609344;
                String strMiles = String.format("%.2f", miles);
                System.out.println(kilometers + " Kilometers is = " + strMiles + " Miles");
                boolean stop = false;
                int choice;

                while (!stop) {
                    System.out.println("Do you wish to continue?" +
                            "\n 1 : Continue" +
                            "\n 2 : Exit");
                    boolean isAnInt = scanner.hasNextInt();
                    if (isAnInt) {
                        choice = scanner.nextInt();
                        switch (choice) {
                            case 1:
                                stop = true;
                                break;
                            case 2:
                                stop = true;
                                quit = true;
                                break;
                            default:
                                System.out.println("Please Enter a choice between 1 and 2");
                                stop = false;
                                break;
                        }
                    } else {
                        System.out.println("Please Select a choice from the ones shown.");
                    }
                    scanner.nextLine();
                }

            } else {
                scanner.nextLine();
                System.out.println("Please Enter a Numeric value for the Distance");
            }
        }
        scanner.close();
        System.out.println("Thank You for using the ****Kilometers to Miles Converter****. Bye");
    }
}
