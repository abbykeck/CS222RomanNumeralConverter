package edu.bsu.cs;

public class RomanNumeralConverter {
    public static String convert(int number) {
        StringBuilder numeral = new StringBuilder();
        while (number >= 100) {
            numeral.append("C");
            number -= 100;
        }
        if (number >= 90) {
            numeral.append("XC");
            number -= 90;
        }

        if (number >= 50) {
            numeral.append("L");
            number -= 50;
        }
        if (number >= 40) {
            numeral.append("XL");
            number -= 40;
        }

        while (number >= 10) {
            numeral.append("X");
            number -= 10;
        }
        if (number == 9) {
            numeral.append("IX");
            number -= 9;
        }

        if (number >= 5) {
            numeral.append("V");
            number -= 5;
        }
        else if (number == 4) {
            numeral.append("IV");
            number -= 4;
        }

        numeral.append("I".repeat(number));
        return numeral.toString();
    }
}
