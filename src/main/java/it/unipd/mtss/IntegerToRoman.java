////////////////////////////////////////////////////////////////////
// Riccardo Stefani 2068225
// Leonardo Salviato 2068222
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

import java.util.HashMap;

public class IntegerToRoman {
    public static String convert(int number) throws IllegalArgumentException {
        if(number == 0) {
            throw new IllegalArgumentException("E' stato passato " +
                    "come parametro un numero uguale a zero");
        }

        if(number < 0) {
            throw new IllegalArgumentException("E' stato passato " +
                    "come parametro un numero minore di zero");
        }

        int threshold = 3;
        if(number > threshold) {
            String message = String.format("E' stato passato " +
                    "come parametro un numero maggiore di %d", threshold);
            throw new IllegalArgumentException(message);
        }

        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "I");

        int[] decimalValues = { 1 };
        StringBuilder romanNumeral = new StringBuilder();

        for (int decimalValue : decimalValues) {
            while (number >= decimalValue) {
                romanNumeral.append(map.get(decimalValue));
                number -= decimalValue;
            }
        }

        return romanNumeral.toString();
    }
}