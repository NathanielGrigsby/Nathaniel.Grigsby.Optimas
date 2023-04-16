package edu.bsu.cs222;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NumberTranslatorTest {
    @Test
    public void testNumberOne() {
        RomanNumerals romanNumerals = new RomanNumerals();
        String result = romanNumerals.romanNumeralsTranslator(1);
        Assertions.assertEquals("I", result);
    }

    @Test
    public void testNumberFour() {
        RomanNumerals romanNumerals = new RomanNumerals();
        String result = romanNumerals.romanNumeralsTranslator(4);
        Assertions.assertEquals("IV", result);
    }
    @Test
    public void testNumberFive() {
        RomanNumerals romanNumerals = new RomanNumerals();
        String result = romanNumerals.romanNumeralsTranslator(5);
        Assertions.assertEquals("V", result);
    }
    @Test
    public void testNumberNine() {
        RomanNumerals romanNumerals = new RomanNumerals();
        String result = romanNumerals.romanNumeralsTranslator(9);
        Assertions.assertEquals("IX", result);
    }
    @Test
    public void testNumberTen() {
        RomanNumerals romanNumerals = new RomanNumerals();
        String result = romanNumerals.romanNumeralsTranslator(10);
        Assertions.assertEquals("X", result);
    }
    @Test
    public void testNumberForty() {
        RomanNumerals romanNumerals = new RomanNumerals();
        String result = romanNumerals.romanNumeralsTranslator(40);
        Assertions.assertEquals("XL", result);
    }
    @Test
    public void testNumberFifty() {
        RomanNumerals romanNumerals = new RomanNumerals();
        String result = romanNumerals.romanNumeralsTranslator(50);
        Assertions.assertEquals("L", result);
    }
    @Test
    public void testNumberNinety() {
        RomanNumerals romanNumerals = new RomanNumerals();
        String result = romanNumerals.romanNumeralsTranslator(90);
        Assertions.assertEquals("XC", result);
    }
    @Test
    public void testNumberOneHundred() {
        RomanNumerals romanNumerals = new RomanNumerals();
        String result = romanNumerals.romanNumeralsTranslator(100);
        Assertions.assertEquals("C", result);
    }
    @Test
    public void testNumberFourHundred() {
        RomanNumerals romanNumerals = new RomanNumerals();
        String result = romanNumerals.romanNumeralsTranslator(400);
        Assertions.assertEquals("CD", result);
    }
    @Test
    public void testNumberFiveHundred() {
        RomanNumerals romanNumerals = new RomanNumerals();
        String result = romanNumerals.romanNumeralsTranslator(500);
        Assertions.assertEquals("D", result);
    }
    @Test
    public void testNumberNineHundred() {
        RomanNumerals romanNumerals = new RomanNumerals();
        String result = romanNumerals.romanNumeralsTranslator(900);
        Assertions.assertEquals("CM", result);
    }
    @Test
    public void testNumberOneThousand() {
        RomanNumerals romanNumerals = new RomanNumerals();
        String result = romanNumerals.romanNumeralsTranslator(1000);
        Assertions.assertEquals("M", result);
    }
    @Test
    public void testNumberComplexTens() {
        RomanNumerals romanNumerals = new RomanNumerals();
        String result = romanNumerals.romanNumeralsTranslator(47);
        Assertions.assertEquals("XLVII", result);
    }
    @Test
    public void testNumberComplexHundreds() {
        RomanNumerals romanNumerals = new RomanNumerals();
        String result = romanNumerals.romanNumeralsTranslator(994);
        Assertions.assertEquals("CMXCIV", result);
    }
    @Test
    public void testNumberComplexThousands() {
        RomanNumerals romanNumerals = new RomanNumerals();
        String result = romanNumerals.romanNumeralsTranslator(2489);
        Assertions.assertEquals("MMCDLXXXIX", result);
    }
}
