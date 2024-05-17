////////////////////////////////////////////////////////////////////
// Riccardo Stefani 2068225
// Leonardo Salviato 2068222
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

public class IntegerToRomanTest {
    @Test(expected=IllegalArgumentException.class)
    public void testConvert_ZeroNumber() {
        int num = 0;

        String res = IntegerToRoman.convert(num);
    }

    @Test(expected=IllegalArgumentException.class)
    public void testConvert_NegativeNumber() {
        int num = -1;

        String res = IntegerToRoman.convert(num);
    }

    @Test(expected=IllegalArgumentException.class)
    public void testConvert_NumberOutOfRange() {
        int num = 101;

        String res = IntegerToRoman.convert(num);
    }

    @Test
    public void testConvert_FirstThreeNumbers() {
        int[] inputDecimalNumbers = {1,2,3};
        String[] expectedRomanNumbers = {"I", "II", "III"};

        String[] outputRomanNumbers = new String[expectedRomanNumbers.length];
        for (int i=0; i<inputDecimalNumbers.length; i++){
            outputRomanNumbers[i] =
                    IntegerToRoman.convert(inputDecimalNumbers[i]);
        }

        assertArrayEquals(expectedRomanNumbers, outputRomanNumbers);
    }

    @Test
    public void testConvert_FromFourToSix() {
        int[] inputDecimalNumbers = {4,5,6};
        String[] expectedRomanNumbers = {"IV", "V", "VI"};

        String[] outputRomanNumbers = new String[expectedRomanNumbers.length];
        for (int i=0; i<inputDecimalNumbers.length; i++){
            outputRomanNumbers[i] =
                    IntegerToRoman.convert(inputDecimalNumbers[i]);
        }

        assertArrayEquals(expectedRomanNumbers, outputRomanNumbers);
    }

    @Test
    public void testConvert_FromSevenToTen() {
        int[] inputDecimalNumbers = {7,8,9,10};
        String[] expectedRomanNumbers = {"VII", "VIII", "IX", "X"};

        String[] outputRomanNumbers = new String[expectedRomanNumbers.length];
        for (int i=0; i<inputDecimalNumbers.length; i++){
            outputRomanNumbers[i] =
                    IntegerToRoman.convert(inputDecimalNumbers[i]);
        }

        assertArrayEquals(expectedRomanNumbers, outputRomanNumbers);
    }

    @Test
    public void testConvert_FromElevenToTwenty() {
        int[] inputDecimalNumbers = {11,12,13,14,15,16,17,18,19,20};
        String[] expectedRomanNumbers = {"XI", "XII", "XIII", "XIV",
                "XV", "XVI", "XVII", "XVIII", "XIX", "XX"};

        String[] outputRomanNumbers = new String[expectedRomanNumbers.length];
        for (int i=0; i<inputDecimalNumbers.length; i++){
            outputRomanNumbers[i] =
                    IntegerToRoman.convert(inputDecimalNumbers[i]);
        }

        assertArrayEquals(expectedRomanNumbers, outputRomanNumbers);
    }

    @Test
    public void testConvert_FromTwentyOneToFifty() {
        int[] inputDecimalNumbers = {21, 22, 23, 24, 25, 26, 27, 28, 29, 30,
                31, 32, 33, 34, 35, 36, 37, 38, 39, 40,
                41, 42, 43, 44, 45, 46, 47, 48, 49, 50};
        String[] expectedRomanNumbers = {"XXI", "XXII", "XXIII", "XXIV", "XXV",
                "XXVI", "XXVII", "XXVIII", "XXIX", "XXX",
                "XXXI", "XXXII", "XXXIII", "XXXIV", "XXXV",
                "XXXVI", "XXXVII", "XXXVIII", "XXXIX", "XL",
                "XLI", "XLII", "XLIII", "XLIV", "XLV",
                "XLVI", "XLVII", "XLVIII", "XLIX", "L"};

        String[] outputRomanNumbers = new String[expectedRomanNumbers.length];
        for (int i=0; i<inputDecimalNumbers.length; i++){
            outputRomanNumbers[i] =
                    IntegerToRoman.convert(inputDecimalNumbers[i]);
        }

        assertArrayEquals(expectedRomanNumbers, outputRomanNumbers);
    }
}