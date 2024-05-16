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
        int num = 11;

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
    public void testConvertFromFourToSix() {
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
    public void testConvertSevenToTen() {
        int[] inputDecimalNumbers = {7,8,9,10};
        String[] expectedRomanNumbers = {"VII", "VIII", "IX", "X"};

        String[] outputRomanNumbers = new String[expectedRomanNumbers.length];
        for (int i=0; i<inputDecimalNumbers.length; i++){
            outputRomanNumbers[i] =
                    IntegerToRoman.convert(inputDecimalNumbers[i]);
        }

        assertArrayEquals(expectedRomanNumbers, outputRomanNumbers);
    }
}