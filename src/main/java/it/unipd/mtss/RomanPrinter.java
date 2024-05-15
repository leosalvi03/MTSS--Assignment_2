////////////////////////////////////////////////////////////////////
// Riccardo Stefani 2068225
// Leonardo Salviato 2068222
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

public class RomanPrinter {
    public static String print(int num) throws IllegalArgumentException {
        return printAsciiArt(IntegerToRoman.convert(num));
    }

    private static String printAsciiArt(String romanNumber) {
        String[] matriceUnione = new String[6];

        for (int i = 0; i < matriceUnione.length; i++) {
            matriceUnione[i] = "";
        }

        appendMatrices(matriceUnione, romanNumber);

        return convertToString(matriceUnione);
    }

    private static void appendMatrices(String[] destination,
                                       String romanNumber) {
        String[][] matrices = {
                      { "  _____ ",
                        " |_   _|",
                        "   | |  ",
                        "   | |  ",
                        "  _| |_ ",
                        " |_____|" }
        };

        for (char c : romanNumber.toCharArray()) {
            appendMatrix(destination, matrices[0]);
        }
    }

    private static void appendMatrix(String[] destination, String[] source) {
        for (int i = 0; i < destination.length; i++) {
            destination[i] += source[i];
        }
    }

    public static String convertToString(String[] matrix) {
        StringBuilder matrixStringBuilder = new StringBuilder();
        for (String riga : matrix) {
            matrixStringBuilder.append(riga).append("\n");
        }
        return matrixStringBuilder.toString();
    }

}