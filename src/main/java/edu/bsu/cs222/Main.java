package edu.bsu.cs222;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        RomanNumeralsTranslator romanNumeralsTranslator = new RomanNumeralsTranslator();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number between 1 and 3000");
        int number = scanner.nextInt();
        if(number > 0 && number < 3001){
            System.out.printf("The Roman numeral for %d is " + romanNumeralsTranslator.romanNumeralsTranslator(number), number);
        }else{
            System.out.printf("The number '%d' is out of range");
        }
    }
}
