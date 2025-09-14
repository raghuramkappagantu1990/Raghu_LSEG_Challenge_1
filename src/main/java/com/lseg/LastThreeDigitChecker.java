package com.lseg;

public class LastThreeDigitChecker {
    
public static boolean lastThreeContainNumber(String input) {
        if (input == null || input.isEmpty()) {
            return false;
        }

        String lastThree = input.length() <= 3
                ? input
                : input.substring(input.length() - 3);

        for (char c : lastThree.toCharArray()) {
            if (Character.isDigit(c)) {
                return true;
            }
        }
        return false;
    }

}
