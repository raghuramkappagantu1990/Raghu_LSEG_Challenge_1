package com.lseg;

import smile.classification.LogisticRegression;

public class AIDigitDetectorML {

    private static LogisticRegression model;

    /**
     * Trains a simple logistic regression model on toy data.
     */
    public static void trainModel() {
        // Features: [digitCount, letterCount]
        double[][] x = {
                {1, 2}, // "8RE" -> has digit
                {0, 3}, // "rld" -> no digit
                {2, 1}, // "99A" -> has digit
                {0, 2}, // "AB"  -> no digit
                {3, 0}, // "123" -> has digit
                {0, 1}  // "Z"   -> no digit
        };

        // Labels: 1 = contains digit, 0 = no digit
        int[] y = {1, 0, 1, 0, 1, 0};

        // ✅ Train logistic regression model
        model = LogisticRegression.fit(x, y);
    }

    /**
     * Predicts if last three chars contain a digit.
     * Returns probability (AI-style).
     */
    public static double predict(String input) {
        // ✅ Auto-train if not initialized
        if (model == null) {
            trainModel();
        }

        if (input == null || input.isEmpty()) {
            return 0.0;
        }

        String lastThree = input.length() <= 3 ? input : input.substring(input.length() - 3);

        int digitCount = 0, letterCount = 0;
        for (char c : lastThree.toCharArray()) {
            if (Character.isDigit(c)) digitCount++;
            else if (Character.isLetter(c)) letterCount++;
        }

        double[] features = {digitCount, letterCount};
        double[] probs = new double[2]; // binary classification
        model.predict(features, probs);

        return probs[1]; // probability of class "1" (digit present)
    }
}
