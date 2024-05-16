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
        int num = 21;

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
                        " |_____|"},
                      { "  _____   _____ ",
                        " |_   _| |_   _|",
                        "   | |     | |  ",
                        "   | |     | |  ",
                        "  _| |_   _| |_ ",
                        " |_____| |_____|"},
                      { "  _____   _____   _____ ",
                        " |_   _| |_   _| |_   _|",
                        "   | |     | |     | |  ",
                        "   | |     | |     | |  ",
                        "  _| |_   _| |_   _| |_ ",
                        " |_____| |_____| |_____|"}
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

    @Test
    public void testPrintFromFourToSix() {
        int[] inputDecimalNumbers = {4,5,6};
        String[][] expectedPrint = {
                      { "  _____  __      __",
                        " |_   _| \\ \\    / /",
                        "   | |    \\ \\  / / ",
                        "   | |     \\ \\/ /  ",
                        "  _| |_     \\  /   ",
                        " |_____|     \\/    " },
                      { " __      __",
                        " \\ \\    / /",
                        "  \\ \\  / / ",
                        "   \\ \\/ /  ",
                        "    \\  /   ",
                        "     \\/    " },
                       {" __      __  _____ ",
                        " \\ \\    / / |_   _|",
                        "  \\ \\  / /    | |  ",
                        "   \\ \\/ /     | |  ",
                        "    \\  /     _| |_ ",
                        "     \\/     |_____|"}
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

    @Test
    public void testPrintFromSevenToTen() {
        int[] inputDecimalNumbers = {7,8,9,10};
        String[][] expectedPrint = {
                      { " __      __  _____   _____ ",
                        " \\ \\    / / |_   _| |_   _|",
                        "  \\ \\  / /    | |     | |  ",
                        "   \\ \\/ /     | |     | |  ",
                        "    \\  /     _| |_   _| |_ ",
                        "     \\/     |_____| |_____|" },
                      { " __      __  _____   _____   _____ ",
                        " \\ \\    / / |_   _| |_   _| |_   _|",
                        "  \\ \\  / /    | |     | |     | |  ",
                        "   \\ \\/ /     | |     | |     | |  ",
                        "    \\  /     _| |_   _| |_   _| |_ ",
                        "     \\/     |_____| |_____| |_____|" },
                      { "  _____  __   __" ,
                        " |_   _| \\ \\ / /" ,
                        "   | |    \\ V / " ,
                        "   | |     > <  " ,
                        "  _| |_   / . \\ " ,
                        " |_____| /_/ \\_\\"},
                      { " __   __" ,
                        " \\ \\ / /" ,
                        "  \\ V / " ,
                        "   > <  " ,
                        "  / . \\ " ,
                        " /_/ \\_\\"}
        };

        String[] expectedStringPrint = {
                RomanPrinter.convertToString(expectedPrint[0]),
                RomanPrinter.convertToString(expectedPrint[1]),
                RomanPrinter.convertToString(expectedPrint[2]),
                RomanPrinter.convertToString(expectedPrint[3])
        };

        String[] outputPrint = new String[expectedStringPrint.length];
        for (int i=0; i<inputDecimalNumbers.length; i++){
            outputPrint[i] = RomanPrinter.print(inputDecimalNumbers[i]);
        }

        assertArrayEquals(expectedStringPrint, outputPrint);
    }

    @Test
    public void testPrintFromElevenToTwenty() {
        int[] inputDecimalNumbers = {11,14,15,16,19,20};
        String[][] expectedPrint = {
                { " __   __  _____ ",
                        " \\ \\ / / |_   _|",
                        "  \\ V /    | |  ",
                        "   > <     | |  ",
                        "  / . \\   _| |_ ",
                        " /_/ \\_\\ |_____|" },
                { " __   __  _____  __      __",
                        " \\ \\ / / |_   _| \\ \\    / /",
                        "  \\ V /    | |    \\ \\  / / ",
                        "   > <     | |     \\ \\/ /  ",
                        "  / . \\   _| |_     \\  /   ",
                        " /_/ \\_\\ |_____|     \\/    " },
                { " __   __ __      __",
                        " \\ \\ / / \\ \\    / /",
                        "  \\ V /   \\ \\  / / ",
                        "   > <     \\ \\/ /  ",
                        "  / . \\     \\  /   ",
                        " /_/ \\_\\     \\/    "},
                { " __   __ __      __  _____ ",
                        " \\ \\ / / \\ \\    / / |_   _|",
                        "  \\ V /   \\ \\  / /    | |  ",
                        "   > <     \\ \\/ /     | |  ",
                        "  / . \\     \\  /     _| |_ ",
                        " /_/ \\_\\     \\/     |_____|"},
                {" __   __  _____  __   __",
                        " \\ \\ / / |_   _| \\ \\ / /",
                        "  \\ V /    | |    \\ V / ",
                        "   > <     | |     > <  ",
                        "  / . \\   _| |_   / . \\ ",
                        " /_/ \\_\\ |_____| /_/ \\_\\"},
                {" __   __ __   __",
                        " \\ \\ / / \\ \\ / /",
                        "  \\ V /   \\ V / ",
                        "   > <     > <  ",
                        "  / . \\   / . \\ ",
                        " /_/ \\_\\ /_/ \\_\\"}
        };

        String[] expectedStringPrint = {
                RomanPrinter.convertToString(expectedPrint[0]),
                RomanPrinter.convertToString(expectedPrint[1]),
                RomanPrinter.convertToString(expectedPrint[2]),
                RomanPrinter.convertToString(expectedPrint[3]),
                RomanPrinter.convertToString(expectedPrint[4]),
                RomanPrinter.convertToString(expectedPrint[5]),
        };

        String[] outputPrint = new String[expectedStringPrint.length];
        for (int i=0; i<inputDecimalNumbers.length; i++){
            outputPrint[i] = RomanPrinter.print(inputDecimalNumbers[i]);
        }

        assertArrayEquals(expectedStringPrint, outputPrint);
    }
}