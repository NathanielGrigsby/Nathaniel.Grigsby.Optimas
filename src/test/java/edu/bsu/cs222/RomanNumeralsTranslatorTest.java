package edu.bsu.cs222;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RomanNumeralsTranslatorTest {
    @Test
    public void testNumberOne() {
        RomanNumeralsTranslator romanNumeralsTranslator = new RomanNumeralsTranslator();
        String result = romanNumeralsTranslator.romanNumeralsTranslator(1);
        Assertions.assertEquals("I", result);
    }

    @Test
    public void testNumberFour() {
        RomanNumeralsTranslator romanNumeralsTranslator = new RomanNumeralsTranslator();
        String result = romanNumeralsTranslator.romanNumeralsTranslator(4);
        Assertions.assertEquals("IV", result);
    }
    @Test
    public void testNumberFive() {
        RomanNumeralsTranslator romanNumeralsTranslator = new RomanNumeralsTranslator();
        String result = romanNumeralsTranslator.romanNumeralsTranslator(5);
        Assertions.assertEquals("V", result);
    }
    @Test
    public void testNumberNine() {
        RomanNumeralsTranslator romanNumeralsTranslator = new RomanNumeralsTranslator();
        String result = romanNumeralsTranslator.romanNumeralsTranslator(9);
        Assertions.assertEquals("IX", result);
    }
    @Test
    public void testNumberTen() {
        RomanNumeralsTranslator romanNumeralsTranslator = new RomanNumeralsTranslator();
        String result = romanNumeralsTranslator.romanNumeralsTranslator(10);
        Assertions.assertEquals("X", result);
    }
    @Test
    public void testNumberForty() {
        RomanNumeralsTranslator romanNumeralsTranslator = new RomanNumeralsTranslator();
        String result = romanNumeralsTranslator.romanNumeralsTranslator(40);
        Assertions.assertEquals("XL", result);
    }
    @Test
    public void testNumberFifty() {
        RomanNumeralsTranslator romanNumeralsTranslator = new RomanNumeralsTranslator();
        String result = romanNumeralsTranslator.romanNumeralsTranslator(50);
        Assertions.assertEquals("L", result);
    }
    @Test
    public void testNumberNinety() {
        RomanNumeralsTranslator romanNumeralsTranslator = new RomanNumeralsTranslator();
        String result = romanNumeralsTranslator.romanNumeralsTranslator(90);
        Assertions.assertEquals("XC", result);
    }
    @Test
    public void testNumberOneHundred() {
        RomanNumeralsTranslator romanNumeralsTranslator = new RomanNumeralsTranslator();
        String result = romanNumeralsTranslator.romanNumeralsTranslator(100);
        Assertions.assertEquals("C", result);
    }
    @Test
    public void testNumberFourHundred() {
        RomanNumeralsTranslator romanNumeralsTranslator = new RomanNumeralsTranslator();
        String result = romanNumeralsTranslator.romanNumeralsTranslator(400);
        Assertions.assertEquals("CD", result);
    }
    @Test
    public void testNumberFiveHundred() {
        RomanNumeralsTranslator romanNumeralsTranslator = new RomanNumeralsTranslator();
        String result = romanNumeralsTranslator.romanNumeralsTranslator(500);
        Assertions.assertEquals("D", result);
    }
    @Test
    public void testNumberNineHundred() {
        RomanNumeralsTranslator romanNumeralsTranslator = new RomanNumeralsTranslator();
        String result = romanNumeralsTranslator.romanNumeralsTranslator(900);
        Assertions.assertEquals("CM", result);
    }
    @Test
    public void testNumberOneThousand() {
        RomanNumeralsTranslator romanNumeralsTranslator = new RomanNumeralsTranslator();
        String result = romanNumeralsTranslator.romanNumeralsTranslator(1000);
        Assertions.assertEquals("M", result);
    }
    @Test
    public void testNumberComplexTens() {
        RomanNumeralsTranslator romanNumeralsTranslator = new RomanNumeralsTranslator();
        String result = romanNumeralsTranslator.romanNumeralsTranslator(47);
        Assertions.assertEquals("XLVII", result);
    }
    @Test
    public void testNumberComplexHundreds() {
        RomanNumeralsTranslator romanNumeralsTranslator = new RomanNumeralsTranslator();
        String result = romanNumeralsTranslator.romanNumeralsTranslator(994);
        Assertions.assertEquals("CMXCIV", result);
    }
    @Test
    public void testNumberComplexThousands() {
        RomanNumeralsTranslator romanNumeralsTranslator = new RomanNumeralsTranslator();
        String result = romanNumeralsTranslator.romanNumeralsTranslator(2489);
        Assertions.assertEquals("MMCDLXXXIX", result);
    }
}
