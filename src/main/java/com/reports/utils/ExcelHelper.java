package com.reports.utils;

public final class ExcelHelper {

    private ExcelHelper(){
    }

   public static final String STRING_EMPTY = "";

    public static String capitalizeInitialLetter(String str) {
        if (str.equals(STRING_EMPTY))
            return str;
        return str.substring(0, 1).toUpperCase().concat(str.substring(1));
    }
}
