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
        int num = 1001;

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
    public void testPrint_FromFourToSix() {
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
    public void testPrint_FromSevenToTen() {
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
    public void testPrint_FromElevenToTwenty() {
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

    @Test
    public void testPrint_FromTwentyOneToFifty() {
        int[] inputDecimalNumbers = {21,29,30,35,40,44,50};
        String[][] expectedPrint = {
                      { " __   __ __   __  _____ ",
                        " \\ \\ / / \\ \\ / / |_   _|",
                        "  \\ V /   \\ V /    | |  ",
                        "   > <     > <     | |  ",
                        "  / . \\   / . \\   _| |_ ",
                        " /_/ \\_\\ /_/ \\_\\ |_____|" },
                      { " __   __ __   __  _____  __   __",
                        " \\ \\ / / \\ \\ / / |_   _| \\ \\ / /",
                        "  \\ V /   \\ V /    | |    \\ V / ",
                        "   > <     > <     | |     > <  ",
                        "  / . \\   / . \\   _| |_   / . \\ ",
                        " /_/ \\_\\ /_/ \\_\\ |_____| /_/ \\_\\" },
                      { " __   __ __   __ __   __",
                        " \\ \\ / / \\ \\ / / \\ \\ / /",
                        "  \\ V /   \\ V /   \\ V / ",
                        "   > <     > <     > <  ",
                        "  / . \\   / . \\   / . \\ ",
                        " /_/ \\_\\ /_/ \\_\\ /_/ \\_\\"},
                      { " __   __ __   __ __   __ __      __",
                        " \\ \\ / / \\ \\ / / \\ \\ / / \\ \\    / /",
                        "  \\ V /   \\ V /   \\ V /   \\ \\  / / ",
                        "   > <     > <     > <     \\ \\/ /  ",
                        "  / . \\   / . \\   / . \\     \\  /   ",
                        " /_/ \\_\\ /_/ \\_\\ /_/ \\_\\     \\/    "},
                       {" __   __  _      ",
                        " \\ \\ / / | |     ",
                        "  \\ V /  | |     ",
                        "   > <   | |     ",
                        "  / . \\  | |____ ",
                        " /_/ \\_\\ |______|"},
                       {" __   __  _        _____  __      __",
                        " \\ \\ / / | |      |_   _| \\ \\    / /",
                        "  \\ V /  | |        | |    \\ \\  / / ",
                        "   > <   | |        | |     \\ \\/ /  ",
                        "  / . \\  | |____   _| |_     \\  /   ",
                        " /_/ \\_\\ |______| |_____|     \\/    "},
                       {"  _      ",
                        " | |     ",
                        " | |     ",
                        " | |     ",
                        " | |____ ",
                        " |______|"}
        };

        String[] expectedStringPrint = {
                RomanPrinter.convertToString(expectedPrint[0]),
                RomanPrinter.convertToString(expectedPrint[1]),
                RomanPrinter.convertToString(expectedPrint[2]),
                RomanPrinter.convertToString(expectedPrint[3]),
                RomanPrinter.convertToString(expectedPrint[4]),
                RomanPrinter.convertToString(expectedPrint[5]),
                RomanPrinter.convertToString(expectedPrint[6])
        };

        String[] outputPrint = new String[expectedStringPrint.length];
        for (int i=0; i<inputDecimalNumbers.length; i++){
            outputPrint[i] = RomanPrinter.print(inputDecimalNumbers[i]);
        }

        assertArrayEquals(expectedStringPrint, outputPrint);
    }

    @Test
    public void testPrint_FromFiftyOneToOneHundred() {
        int[] inputDecimalNumbers = {51, 60, 74, 86, 89, 90, 94, 95, 99, 100};
        String[][] expectedPrint = {
                { "  _        _____ ",
                  " | |      |_   _|",
                  " | |        | |  ",
                  " | |        | |  ",
                  " | |____   _| |_ ",
                  " |______| |_____|" },
                { "  _       __   __",
                  " | |      \\ \\ / /",
                  " | |       \\ V / ",
                  " | |        > <  ",
                  " | |____   / . \\ ",
                  " |______| /_/ \\_\\" },
                { "  _       __   __ __   __  _____  __      __",
                  " | |      \\ \\ / / \\ \\ / / |_   _| \\ \\    / /",
                  " | |       \\ V /   \\ V /    | |    \\ \\  / / ",
                  " | |        > <     > <     | |     \\ \\/ /  ",
                  " | |____   / . \\   / . \\   _| |_     \\  /   ",
                  " |______| /_/ \\_\\ /_/ \\_\\ |_____|     \\/    "},
               { "  _       __   __ __   __ __   __ __      __  _____ ",
                 " | |      \\ \\ / / \\ \\ / / \\ \\ / / \\ \\    / / |_   _|",
                 " | |       \\ V /   \\ V /   \\ V /   \\ \\  / /    | |  ",
                 " | |        > <     > <     > <     \\ \\/ /     | |  ",
                 " | |____   / . \\   / . \\   / . \\     \\  /     _| |_ ",
                 " |______| /_/ \\_\\ /_/ \\_\\ /_/ \\_\\     \\/     |_____|"},
                { "  _       __   __ __   __ __   __  _____  __   __",
                  " | |      \\ \\ / / \\ \\ / / \\ \\ / / |_   _| \\ \\ / /",
                  " | |       \\ V /   \\ V /   \\ V /    | |    \\ V / ",
                  " | |        > <     > <     > <     | |     > <  ",
                  " | |____   / . \\   / . \\   / . \\   _| |_   / . \\ ",
                  " |______| /_/ \\_\\ /_/ \\_\\ /_/ \\_\\ |_____| /_/ \\_\\"},
                { " __   __   _____ ",
                  " \\ \\ / /  / ____|",
                  "  \\ V /  | |     ",
                  "   > <   | |     ",
                  "  / . \\  | |____ ",
                  " /_/ \\_\\  \\_____|"},
                { " __   __   _____   _____  __      __",
                  " \\ \\ / /  / ____| |_   _| \\ \\    / /",
                  "  \\ V /  | |        | |    \\ \\  / / ",
                  "   > <   | |        | |     \\ \\/ /  ",
                  "  / . \\  | |____   _| |_     \\  /   ",
                  " /_/ \\_\\  \\_____| |_____|     \\/    "},
                { " __   __   _____  __      __",
                  " \\ \\ / /  / ____| \\ \\    / /",
                  "  \\ V /  | |       \\ \\  / / ",
                  "   > <   | |        \\ \\/ /  ",
                  "  / . \\  | |____     \\  /   ",
                  " /_/ \\_\\  \\_____|     \\/    "},
                { " __   __   _____   _____  __   __",
                  " \\ \\ / /  / ____| |_   _| \\ \\ / /",
                  "  \\ V /  | |        | |    \\ V / ",
                  "   > <   | |        | |     > <  ",
                  "  / . \\  | |____   _| |_   / . \\ ",
                  " /_/ \\_\\  \\_____| |_____| /_/ \\_\\"},
                { "   _____ ",
                  "  / ____|",
                  " | |     ",
                  " | |     ",
                  " | |____ ",
                  "  \\_____|"}
        };

        String[] expectedStringPrint = new String[inputDecimalNumbers.length];

        for(int i=0; i<inputDecimalNumbers.length; i++){
            expectedStringPrint[i] =
                    RomanPrinter.convertToString(expectedPrint[i]);
        }

        String[] outputPrint = new String[expectedStringPrint.length];
        for (int i=0; i<inputDecimalNumbers.length; i++){
            outputPrint[i] = RomanPrinter.print(inputDecimalNumbers[i]);
        }

        assertArrayEquals(expectedStringPrint, outputPrint);
    }

    @Test
    public void testPrint_FromOneHundredOneToFiveHundred() {
        int[] inputDecimalNumbers = {113, 159, 204, 298, 315,
                367, 412, 458, 476, 500};
        String[][] expectedPrint = {
                      { "   _____  __   __  _____   _____   _____ ",
                        "  / ____| \\ \\ / / |_   _| |_   _| |_   _|",
                        " | |       \\ V /    | |     | |     | |  ",
                        " | |        > <     | |     | |     | |  ",
                        " | |____   / . \\   _| |_   _| |_   _| |_ ",
                        "  \\_____| /_/ \\_\\ |_____| |_____| |_____|" },
                      { "   _____   _        _____  __   __",
                        "  / ____| | |      |_   _| \\ \\ / /",
                        " | |      | |        | |    \\ V / ",
                        " | |      | |        | |     > <  ",
                        " | |____  | |____   _| |_   / . \\ ",
                        "  \\_____| |______| |_____| /_/ \\_\\" },
                      { "   _____    _____   _____  __      __",
                        "  / ____|  / ____| |_   _| \\ \\    / /",
                        " | |      | |        | |    \\ \\  / / ",
                        " | |      | |        | |     \\ \\/ /  ",
                        " | |____  | |____   _| |_     \\  /   ",
                        "  \\_____|  \\_____| |_____|     \\/    "},
{ "   _____    _____  __   __   _____  __      __  _____   _____   _____ ",
  "  / ____|  / ____| \\ \\ / /  / ____| \\ \\    / / |_   _| |_   _| |_   _|",
  " | |      | |       \\ V /  | |       \\ \\  / /    | |     | |     | |  ",
  " | |      | |        > <   | |        \\ \\/ /     | |     | |     | |  ",
  " | |____  | |____   / . \\  | |____     \\  /     _| |_   _| |_   _| |_ ",
"  \\_____|  \\_____| /_/ \\_\\  \\_____|     \\/     |_____| |_____| |_____|"},
                      { "   _____    _____    _____  __   __ __      __",
                        "  / ____|  / ____|  / ____| \\ \\ / / \\ \\    / /",
                        " | |      | |      | |       \\ V /   \\ \\  / / ",
                        " | |      | |      | |        > <     \\ \\/ /  ",
                        " | |____  | |____  | |____   / . \\     \\  /   ",
                        "  \\_____|  \\_____|  \\_____| /_/ \\_\\     \\/    "},
{ "   _____    _____    _____   _       __   __ __      __  _____   _____ ",
  "  / ____|  / ____|  / ____| | |      \\ \\ / / \\ \\    / / |_   _| |_   _|",
  " | |      | |      | |      | |       \\ V /   \\ \\  / /    | |     | |  ",
  " | |      | |      | |      | |        > <     \\ \\/ /     | |     | |  ",
  " | |____  | |____  | |____  | |____   / . \\     \\  /     _| |_   _| |_ ",
"  \\_____|  \\_____|  \\_____| |______| /_/ \\_\\     \\/     |_____| |_____|"}
                    , { "   _____   _____   __   __  _____   _____ ",
                        "  / ____| |  __ \\  \\ \\ / / |_   _| |_   _|",
                        " | |      | |  | |  \\ V /    | |     | |  ",
                        " | |      | |  | |   > <     | |     | |  ",
                        " | |____  | |__| |  / . \\   _| |_   _| |_ ",
                        "  \\_____| |_____/  /_/ \\_\\ |_____| |_____|"},
{ "   _____   _____    _       __      __  _____   _____   _____ ",
  "  / ____| |  __ \\  | |      \\ \\    / / |_   _| |_   _| |_   _|",
  " | |      | |  | | | |       \\ \\  / /    | |     | |     | |  ",
  " | |      | |  | | | |        \\ \\/ /     | |     | |     | |  ",
  " | |____  | |__| | | |____     \\  /     _| |_   _| |_   _| |_ ",
  "  \\_____| |_____/  |______|     \\/     |_____| |_____| |_____|"},
{ "   _____   _____    _       __   __ __   __ __      __  _____ ",
  "  / ____| |  __ \\  | |      \\ \\ / / \\ \\ / / \\ \\    / / |_   _|",
  " | |      | |  | | | |       \\ V /   \\ V /   \\ \\  / /    | |  ",
  " | |      | |  | | | |        > <     > <     \\ \\/ /     | |  ",
  " | |____  | |__| | | |____   / . \\   / . \\     \\  /     _| |_ ",
  "  \\_____| |_____/  |______| /_/ \\_\\ /_/ \\_\\     \\/     |_____|"},
                      { "  _____  ",
                        " |  __ \\ ",
                        " | |  | |",
                        " | |  | |",
                        " | |__| |",
                        " |_____/ "}
        };

        String[] expectedStringPrint = new String[inputDecimalNumbers.length];

        for(int i=0; i<inputDecimalNumbers.length; i++){
            expectedStringPrint[i] =
                    RomanPrinter.convertToString(expectedPrint[i]);
        }

        String[] outputPrint = new String[expectedStringPrint.length];
        for (int i=0; i<inputDecimalNumbers.length; i++){
            outputPrint[i] = RomanPrinter.print(inputDecimalNumbers[i]);
        }

        assertArrayEquals(expectedStringPrint, outputPrint);
    }

    @Test
    public void testPrint_FromFiveHundredOneToOneThousand() {
        int[] inputDecimalNumbers = {523, 845, 1000, 638, 917,
                747, 888, 914, 999, 856};
        String[][] expectedPrint = {
                { "  _____   __   __ __   __  _____   _____   _____ ",
                " |  __ \\  \\ \\ / / \\ \\ / / |_   _| |_   _| |_   _|",
                " | |  | |  \\ V /   \\ V /    | |     | |     | |  ",
                " | |  | |   > <     > <     | |     | |     | |  ",
                " | |__| |  / . \\   / . \\   _| |_   _| |_   _| |_ ",
                " |_____/  /_/ \\_\\ /_/ \\_\\ |_____| |_____| |_____|" },
                { "  _____     _____    _____    _____  __   __  _" +
                        "       __      __",
                    " |  __ \\   / ____|  / ____|  / ____| \\ \\ /" +
                            " / | |      \\ \\    / /",
                    " | |  | | | |      | |      | |       \\ V /  " +
                            "| |       \\ \\  / / ",
                    " | |  | | | |      | |      | |        > <   |" +
                            " |        \\ \\/ /  ",
                    " | |__| | | |____  | |____  | |____   / . \\  " +
                            "| |____     \\  /   ",
                    " |_____/   \\_____|  \\_____|  \\_____| /_/ \\_" +
                            "\\ |______|     \\/    " },
                { "  __  __ ",
                " |  \\/  |",
                " | \\  / |",
                " | |\\/| |",
                " | |  | |",
                " |_|  |_|"},
                { "  _____     _____  __   __ __   __ __   __ __      __  " +
                        "_____   _____   _____ ",
                " |  __ \\   / ____| \\ \\ / / \\ \\ / / \\ \\ / / \\ \\   " +
                        " / / |_   _| |_   _| |_   _|",
                " | |  | | | |       \\ V /   \\ V /   \\ V /   \\ \\  / / " +
                        "   | |     | |     | |  ",
                " | |  | | | |        > <     > <     > <     \\ \\/ /     " +
                        "| |     | |     | |  ",
                " | |__| | | |____   / . \\   / . \\   / . \\     \\  /    " +
                        " _| |_   _| |_   _| |_ ",
                " |_____/   \\_____| /_/ \\_\\ /_/ \\_\\ /_/ \\_\\     \\/  " +
                        "   |_____| |_____| |_____|"},
        { "   _____   __  __  __   __ __      __  _____   _____ ",
                "  / ____| |  \\/  | \\ \\ / / \\ \\    / / |_   _| |_   _|",
                " | |      | \\  / |  \\ V /   \\ \\  / /    | |     | |  ",
                " | |      | |\\/| |   > <     \\ \\/ /     | |     | |  ",
                " | |____  | |  | |  / . \\     \\  /     _| |_   _| |_ ",
                "  \\_____| |_|  |_| /_/ \\_\\     \\/     |_____| |_____|"},
        { "  _____     _____    _____  __   __  _       __      " +
                "__  _____   _____ ",
                " |  __ \\   / ____|  / ____| \\ \\ / / | |     " +
                        " \\ \\    / / |_   _| |_   _|",
                " | |  | | | |      | |       \\ V /  | |       " +
                        "\\ \\  / /    | |     | |  ",
                " | |  | | | |      | |        > <   | |        " +
                        "\\ \\/ /     | |     | |  ",
                " | |__| | | |____  | |____   / . \\  | |____     " +
                        "\\  /     _| |_   _| |_ ",
                " |_____/   \\_____|  \\_____| /_/ \\_\\ |______|  " +
                        "   \\/     |_____| |_____|"},
        { "  _____     _____    _____    _____   _       __   __ __ " +
                "  __ __   __ __      __  _____   _____   _____ ",
                " |  __ \\   / ____|  / ____|  / ____| | |      \\ \\" +
                        " / / \\ \\ / / \\ \\ / / \\ \\    / / |_   _" +
                        "| |_   _| |_   _|",
                " | |  | | | |      | |      | |      | |       \\ V " +
                        "/   \\ V /   \\ V /   \\ \\  / /    | |  " +
                        "   | |     | |  ",
                " | |  | | | |      | |      | |      | |        > <  " +
                        "   > <     > <     \\ \\/ /     | |     |" +
                        " |     | |  ",
                " | |__| | | |____  | |____  | |____  | |____   / . \\" +
                        "   / . \\   / . \\     \\  /     _| |_   _" +
                        "| |_   _| |_ ",
                " |_____/   \\_____|  \\_____|  \\_____| |______| /_/ \\" +
                        "_\\ /_/ \\_\\ /_/ \\_\\     \\/     |_____" +
                        "| |_____| |_____|"},
        { "   _____   __  __  __   __  _____  __      __",
                "  / ____| |  \\/  | \\ \\ / / |_   _| " +
                        "\\ \\    / /",
                " | |      | \\  / |  \\ V /    | |    " +
                        "\\ \\  / / ",
                " | |      | |\\/| |   > <     | |     " +
                        "\\ \\/ /  ",
                " | |____  | |  | |  / . \\   _| |_     " +
                        "\\  /   ",
                "  \\_____| |_|  |_| /_/ \\_\\ |_____|   " +
                        "  \\/    "},
        { "   _____   __  __  __   __   _____   _____  __   __",
                "  / ____| |  \\/  | \\ \\ / /  / ____| |_   _| \\ \\ / /",
                " | |      | \\  / |  \\ V /  | |        | |    \\ V / ",
                " | |      | |\\/| |   > <   | |        | |     > <  ",
                " | |____  | |  | |  / . \\  | |____   _| |_   / . \\ ",
                "  \\_____| |_|  |_| /_/ \\_\\  \\_____| |_____| /_/ \\_\\"},
        { "  _____     _____    _____    _____   _       __      __  _____ ",
                " |  __ \\   / ____|  / ____|  / ____| | |      " +
                        "\\ \\    / / |_   _|",
                " | |  | | | |      | |      | |      | |      " +
                        " \\ \\  / /    | |  ",
                " | |  | | | |      | |      | |      | |        " +
                        "\\ \\/ /     | |  ",
                " | |__| | | |____  | |____  | |____  | |____     " +
                        "\\  /     _| |_ ",
                " |_____/   \\_____|  \\_____|  \\_____| |______| " +
                        "    \\/     |_____|"}
        };

        String[] expectedStringPrint = new String[inputDecimalNumbers.length];

        for(int i=0; i<inputDecimalNumbers.length; i++){
            expectedStringPrint[i] =
                    RomanPrinter.convertToString(expectedPrint[i]);
        }

        String[] outputPrint = new String[expectedStringPrint.length];
        for (int i=0; i<inputDecimalNumbers.length; i++){
            outputPrint[i] = RomanPrinter.print(inputDecimalNumbers[i]);
        }

        assertArrayEquals(expectedStringPrint, outputPrint);
    }
}