package edu.bsu.cs222;

import java.util.Scanner;
public class NumberTranslator {
    public static void main(String[] args) {
        RomanNumerals romanNumerals = new RomanNumerals();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number between 1 and 3000");
        int number = scanner.nextInt();
        if(number > 0 && number < 3001){
            System.out.printf("The Roman numeral for %d is " + romanNumerals.romanNumeralsTranslator(number), number);
        }else{
            System.out.printf("The number '%d' is out of range");
        }
    }
}
