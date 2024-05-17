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
        int num = 501;

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

    @Test
    public void testConvert_FromFiftyOneToOneHundred() {
        int[] inputDecimalNumbers = {51, 52, 53, 54, 55, 56, 57, 58, 59, 60,
                61, 62, 63, 64, 65, 66, 67, 68, 69, 70,
                71, 72, 73, 74, 75, 76, 77, 78, 79, 80,
                81, 82, 83, 84, 85, 86, 87, 88, 89, 90,
                91, 92, 93, 94, 95, 96, 97, 98, 99, 100};

        String[] expectedRomanNumbers = {"LI", "LII", "LIII", "LIV", "LV",
                "LVI", "LVII", "LVIII", "LIX", "LX",
                "LXI", "LXII", "LXIII", "LXIV", "LXV",
                "LXVI", "LXVII", "LXVIII", "LXIX", "LXX",
                "LXXI", "LXXII", "LXXIII", "LXXIV", "LXXV",
                "LXXVI", "LXXVII", "LXXVIII", "LXXIX", "LXXX",
                "LXXXI", "LXXXII", "LXXXIII", "LXXXIV", "LXXXV",
                "LXXXVI", "LXXXVII", "LXXXVIII", "LXXXIX", "XC",
                "XCI", "XCII", "XCIII", "XCIV", "XCV",
                "XCVI", "XCVII", "XCVIII", "XCIX", "C"};

        String[] outputRomanNumbers = new String[expectedRomanNumbers.length];
        for (int i = 0; i < inputDecimalNumbers.length; i++) {
            outputRomanNumbers[i] =
                    IntegerToRoman.convert(inputDecimalNumbers[i]);
        }

        assertArrayEquals(expectedRomanNumbers, outputRomanNumbers);
    }

    @Test
    public void testConvert_FromOneHundredOneToFiveHundred() {
        int[] inputDecimalNumbers =
                {101, 108, 112, 117, 123, 129, 133, 139, 144, 148,
                 151, 159, 161, 168, 172, 179, 182, 188, 194, 199,
                 202, 209, 213, 218, 224, 229, 234, 238, 242, 248,
                 251, 258, 263, 269, 274, 279, 283, 289, 292, 299,
                 302, 309, 313, 318, 324, 329, 333, 338, 344, 348,
                 351, 359, 361, 368, 373, 379, 383, 388, 394, 399,
                 403, 409, 413, 419, 422, 428, 433, 439, 443, 449,
                 452, 459, 463, 469, 474, 478, 483, 488, 494, 500};

        String[] expectedRomanNumbers =
                {"CI", "CVIII", "CXII", "CXVII", "CXXIII", "CXXIX",
                 "CXXXIII", "CXXXIX", "CXLIV", "CXLVIII",
                 "CLI", "CLIX", "CLXI", "CLXVIII", "CLXXII", "CLXXIX",
                 "CLXXXII", "CLXXXVIII", "CXCIV", "CXCIX",
                 "CCII", "CCIX", "CCXIII", "CCXVIII", "CCXXIV", "CCXXIX",
                 "CCXXXIV", "CCXXXVIII", "CCXLII", "CCXLVIII",
                 "CCLI", "CCLVIII", "CCLXIII", "CCLXIX", "CCLXXIV", "CCLXXIX",
                 "CCLXXXIII", "CCLXXXIX", "CCXCII", "CCXCIX",
                 "CCCII", "CCCIX", "CCCXIII", "CCCXVIII", "CCCXXIV", "CCCXXIX",
                 "CCCXXXIII", "CCCXXXVIII", "CCCXLIV", "CCCXLVIII",
                 "CCCLI", "CCCLIX", "CCCLXI","CCCLXVIII","CCCLXXIII","CCCLXXIX",
                 "CCCLXXXIII", "CCCLXXXVIII", "CCCXCIV", "CCCXCIX",
                 "CDIII", "CDIX", "CDXIII", "CDXIX", "CDXXII", "CDXXVIII",
                 "CDXXXIII", "CDXXXIX", "CDXLIII", "CDXLIX",
                 "CDLII", "CDLIX", "CDLXIII", "CDLXIX", "CDLXXIV", "CDLXXVIII",
                 "CDLXXXIII", "CDLXXXVIII", "CDXCIV", "D"};

        String[] outputRomanNumbers = new String[expectedRomanNumbers.length];
        for (int i = 0; i < inputDecimalNumbers.length; i++) {
            outputRomanNumbers[i] =
                    IntegerToRoman.convert(inputDecimalNumbers[i]);
        }

        assertArrayEquals(expectedRomanNumbers, outputRomanNumbers);
    }

}