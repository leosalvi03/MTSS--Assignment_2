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
                    "come argomento un numero uguale a zero");
        }

        if(number < 0) {
            throw new IllegalArgumentException("E' stato passato " +
                    "come argomento un numero minore di zero");
        }

        int threshold = 500;
        if(number > threshold) {
            String message = String.format("E' stato passato " +
                    "come argomento un numero maggiore di %d", threshold);
            throw new IllegalArgumentException(message);
        }

        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "I");
        map.put(4, "IV");
        map.put(5, "V");
        map.put(9, "IX");
        map.put(10, "X");
        map.put(40, "XL");
        map.put(50, "L");
        map.put(90, "XC");
        map.put(100, "C");
        map.put(400, "CD");
        map.put(500, "D");


        int[] decimalValues = { 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
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