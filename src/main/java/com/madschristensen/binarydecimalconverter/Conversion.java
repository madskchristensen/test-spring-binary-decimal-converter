package com.madschristensen.binarydecimalconverter;

import javax.validation.constraints.NotNull;

public class Conversion {
    @NotNull
    private long numberToConvert;
    private String numberSystemFrom;
    private String numberSystemTo;

    public long convertNumber() {
        if (numberSystemFrom.equals("decimal") && numberSystemTo.equals("binary")) {
            return Converter.toBinary(numberToConvert);
        } else if (numberSystemFrom.equals("binary") && numberSystemTo.equals("decimal")) {
            return Converter.toDecimal(numberToConvert);
        }

        return numberToConvert;
    }

    public String getNumberSystemTo() {
        return numberSystemTo;
    }

    public void setNumberSystemTo(String numberSystemTo) {
        this.numberSystemTo = numberSystemTo;
    }

    public String getNumberSystemFrom() {
        return numberSystemFrom;
    }

    public void setNumberSystemFrom(String numberSystemFrom) {
        this.numberSystemFrom = numberSystemFrom;
    }

    public long getNumberToConvert() {
        return numberToConvert;
    }

    public void setNumberToConvert(long numberToConvert) {
        this.numberToConvert = numberToConvert;
    }
}
