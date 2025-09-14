package com.lseg;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LastThreeDigitCheckerTest {

    @Test(groups = "positive")
    public void testContainsNumber() {
        Assert.assertTrue(LastThreeDigitChecker.lastThreeContainNumber("Test8RE"));
    }


    @Test(groups = "negative")
    public void testNoNumber() {
        Assert.assertFalse(LastThreeDigitChecker.lastThreeContainNumber("HelloWorld"));
    }

    
     @Test(groups = "edge")
    public void verifyEdgeCases() {
        Assert.assertFalse(LastThreeDigitChecker.lastThreeContainNumber(""));
        Assert.assertTrue(LastThreeDigitChecker.lastThreeContainNumber("x1"));
        Assert.assertTrue(LastThreeDigitChecker.lastThreeContainNumber("99"));
        Assert.assertFalse(LastThreeDigitChecker.lastThreeContainNumber(null));
    }
    
}
