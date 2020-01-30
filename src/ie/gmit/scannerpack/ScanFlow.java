package ie.gmit.scannerpack;

import java.util.Scanner;

public class ScanFlow {
    public static void main(String[] args) {
        birthMonthFinder();
    } // End main

    static void birthMonthFinder() {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Please enter the number of the month you were born. (egt. May = 5)");

        int birthMonth = userInput.nextInt();

        userInput.close();//Use to close the user inputs to stop wasting memory

        if (birthMonth == 1) {
            System.out.println("Your month of birth is January.");
        } else if (birthMonth == 2) {
            System.out.println("Your month of birth is February.");
        } else if (birthMonth == 3) {
            System.out.println("Your month of birth is March.");
        } else if (birthMonth == 4) {
            System.out.println("Your month of birth is April.");
        } else if (birthMonth == 5) {
            System.out.println("Your month of birth is May.");
        } else if (birthMonth == 6) {
            System.out.println("Your month of birth is June.");
        } else if (birthMonth == 7) {
            System.out.println("Your month of birth is July.");
        } else if (birthMonth == 8) {
            System.out.println("Your month of birth is August.");
        } else if (birthMonth == 9) {
            System.out.println("Your month of birth is September.");
        } else if (birthMonth == 10) {
            System.out.println("Your month of birth is October.");
        } else if (birthMonth == 11) {
            System.out.println("Your month of birth is November.");
        } else if (birthMonth == 12) {
            System.out.println("Your month of birth is December.");
        }

        else {
            System.out.println("Your number is wrong,try again.");
        }
    }

}// End class
