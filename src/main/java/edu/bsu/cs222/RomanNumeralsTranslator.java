package edu.bsu.cs222;

public class RomanNumeralsTranslator {
    public String romanNumeralsTranslator(int number){
        System.out.println("Integer: " + number);
        int[] values = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] romanNumerals = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        StringBuilder roman = new StringBuilder();
        for(int i=0;i<values.length;i++)
        {
            while(number >= values[i])
            {
                number = number - values[i];
                roman.append(romanNumerals[i]);
            }
        }
        String romanEquivalent = roman.toString();
        return romanEquivalent;
    }
}
