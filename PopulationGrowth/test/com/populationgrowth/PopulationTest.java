package com.populationgrowth;

import org.junit.Assert;
import org.junit.Test;

public class PopulationTest {

    @Test
    public void populationHasHabitants() {
        Assert.assertEquals(6, new Population(6, 5, 50).getHabitants());
        Assert.assertEquals(1000, new Population(1000, 7, 30).getHabitants());
    }

    @Test
    public void incrementationOfPopulationPerYear() {
        Population population = new Population(1000, 2, 50);
        population.calculatePopulationPerYear();
        Assert.assertEquals(1070, population.getHabitants());
    }
}
