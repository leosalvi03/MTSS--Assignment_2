////////////////////////////////////////////////////////////////////
// Riccardo Stefani 2068225
// Leonardo Salviato 2068222
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

public class RomanPrinterTest {
    @Test(expected=IllegalArgumentException.class)
    public void testPrint_ZeroNumber() {
        int num = 0;

        String res = RomanPrinter.print(num);
    }

    @Test(expected=IllegalArgumentException.class)
    public void testPrint_NegativeNumber() {
        int num = -1;

        String res = RomanPrinter.print(num);
    }

    @Test(expected=IllegalArgumentException.class)
    public void testPrint_NumberOutOfRange() {
        int num = 4;

        String res = IntegerToRoman.convert(num);
    }

    @Test
    public void testPrint_FirstThreeNumbers() {
        int[] inputDecimalNumbers = {1,2,3};
        String[][] expectedPrint = {
                      { "  _____ ",
                        " |_   _|",
                        "   | |  ",
                        "   | |  ",
                        "  _| |_ ",
                        " |_____|"    },
                      { "  _____   _____ ",
                        " |_   _| |_   _|",
                        "   | |     | |  ",
                        "   | |     | |  ",
                        "  _| |_   _| |_ ",
                        " |_____| |_____|"    },
                      { "  _____   _____   _____ ",
                        " |_   _| |_   _| |_   _|",
                        "   | |     | |     | |  ",
                        "   | |     | |     | |  ",
                        "  _| |_   _| |_   _| |_ ",
                        " |_____| |_____| |_____|"    }
        };

        String[] expectedStringPrint = {
                RomanPrinter.convertToString(expectedPrint[0]),
                RomanPrinter.convertToString(expectedPrint[1]),
                RomanPrinter.convertToString(expectedPrint[2])
        };

        String[] outputPrint = new String[expectedStringPrint.length];
        for (int i=0; i<inputDecimalNumbers.length; i++){
            outputPrint[i] = RomanPrinter.print(inputDecimalNumbers[i]);
        }

        assertArrayEquals(expectedStringPrint, outputPrint);
    }
}