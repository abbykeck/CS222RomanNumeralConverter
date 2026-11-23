package edu.bsu.cs;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RomanNumeralConverterTest {
    @Test
    public void testConvertOne() {
        String actual = RomanNumeralConverter.convert(1);
        Assertions.assertEquals("I", actual);
    }
    @Test
    public void testConvertTwo() {
        String actual = RomanNumeralConverter.convert(2);
        Assertions.assertEquals("II", actual);
    }
    @Test
    public void testConvertFour() {
        String actual = RomanNumeralConverter.convert(4);
        Assertions.assertEquals("IV", actual);
    }
    @Test
    public void testConvertFive() {
        String actual = RomanNumeralConverter.convert(5);
        Assertions.assertEquals("V", actual);
    }
    @Test
    public void testConvertEight() {
        String actual = RomanNumeralConverter.convert(8);
        Assertions.assertEquals("VIII", actual);
    }

    @Test
    public void testConvertNine() {
        String actual = RomanNumeralConverter.convert(9);
        Assertions.assertEquals("IX", actual);
    }
    @Test
    public void testConvertTen() {
        String actual = RomanNumeralConverter.convert(10);
        Assertions.assertEquals("X", actual);
    }
    @Test
    public void testConvertThirteen() {
        String actual = RomanNumeralConverter.convert(13);
        Assertions.assertEquals("XIII", actual);
    }
    @Test
    public void testConvertFourteen() {
        String actual = RomanNumeralConverter.convert(14);
        Assertions.assertEquals("XIV", actual);
    }

    @Test
    public void testConvertNineteen() {
        String actual = RomanNumeralConverter.convert(19);
        Assertions.assertEquals("XIX", actual);
    }
    @Test
    public void testConvertTwenty() {
        String actual = RomanNumeralConverter.convert(20);
        Assertions.assertEquals("XX", actual);
    }
    @Test
    public void testConvertThirtyEight() {
        String actual = RomanNumeralConverter.convert(38);
        Assertions.assertEquals("XXXVIII", actual);
    }

    @Test
    public void testConvertForty() {
        String actual = RomanNumeralConverter.convert(40);
        Assertions.assertEquals("XL", actual);
    }
    @Test
    public void testConvertFifty() {
        String actual = RomanNumeralConverter.convert(50);
        Assertions.assertEquals("L", actual);
    }

    @Test
    public void testConvertNinety() {
        String actual = RomanNumeralConverter.convert(90);
        Assertions.assertEquals("XC", actual);
    }
    @Test
    public void testConvertHundred() {
        String actual = RomanNumeralConverter.convert(100);
        Assertions.assertEquals("C", actual);
    }
}
