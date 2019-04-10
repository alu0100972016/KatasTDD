package com.populationgrowth;

import org.junit.Assert;
import org.junit.Test;

public class AppTest {
    @Test
    public void yearsUntilReachCertainPopulation() {
        Assert.assertEquals(3, new App(1000, 2, 50, 1200).getYearsUntilReachExpectedPopulation());
    }
}
