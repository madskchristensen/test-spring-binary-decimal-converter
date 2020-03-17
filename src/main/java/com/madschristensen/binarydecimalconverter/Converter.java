package com.madschristensen.binarydecimalconverter;

public class Converter {

    /* Konverterer en decimal int til binær int

     */

    public static long toBinary(long decimal) {
        if (decimal == 0) {
            return 0;
        }

        String resultAsString = "";
        long result = 0;
        // int numberOfBits = (int) ((Math.log10(decimal)) / (Math.log10(2))) * 10;

        while(decimal > 0) {
            resultAsString = decimal % 2 + resultAsString;
            decimal = decimal / 2;
        }

        result = Long.parseLong(resultAsString);

        return result;
    }

    /*  Konverterer binær int til decimal int
        binær input gemmes som string for at kunne benytte charAt() og length()
        eksponenten af 2 starter fra højeste værdi n til laveste værdi 0,
        da det ellers ville kræve at string værdien blev spejlvendt.
     */
    public static long toDecimal(long binary) {
        if (binary == 0) {
            return -1;
        }

        long result = 0;
        String binaryString = "" + binary;

        for(int i = 0; i < binaryString.length(); i++) {
            long currentBit = Character.getNumericValue(binaryString.charAt(i));
            long equation = (long) (currentBit * Math.pow(2, binaryString.length() - 1 - i));

            result += equation;
        }

        return result;
    }
}