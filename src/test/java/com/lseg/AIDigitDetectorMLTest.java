package com.lseg;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AIDigitDetectorMLTest {

    @BeforeClass
    public void setup() {
        // ✅ Ensure model is trained before running tests
        AIDigitDetectorML.trainModel();
    }

    @Test(groups = "ai-ml")
    public void testStrongDigitPresence() {
        double prob = AIDigitDetectorML.predict("12345");
        System.out.println("12345 -> " + prob);
        Assert.assertTrue(prob > 0.8, "Expected high probability for digit presence");
    }

    @Test(groups = "ai-ml")
    public void testMixedWithDigit() {
        double prob = AIDigitDetectorML.predict("Test8RE");
        System.out.println("Test8RE -> " + prob);
        Assert.assertTrue(prob > 0.3, "Expected moderate/high probability for mixed digit presence");
    }

    @Test(groups = "ai-ml")
    public void testNoDigit() {
        double prob = AIDigitDetectorML.predict("HelloWorld");
        System.out.println("HelloWorld -> " + prob);
        Assert.assertTrue(prob < 0.3, "Expected low probability for no digit");
    }

    @Test(groups = "ai-ml")
    public void testEmptyOrNull() {
        Assert.assertEquals(AIDigitDetectorML.predict(""), 0.0, "Empty string should return 0.0");
        Assert.assertEquals(AIDigitDetectorML.predict(null), 0.0, "Null should return 0.0");
    }
}
