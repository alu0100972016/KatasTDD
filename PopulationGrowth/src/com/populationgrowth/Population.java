package com.populationgrowth;

public class Population {
    private int habitants;
    private float growthPercentagePerYear;
    private int peopleMovingInPerYear;

    public Population(int habitants, float growthPercentagePerYear, int peopleMovingInPerYear){
        this.habitants = habitants;
        this.growthPercentagePerYear = growthPercentagePerYear;
        this.peopleMovingInPerYear = peopleMovingInPerYear;
    }

    public int getHabitants(){
        return habitants;
    }

    public void calculatePopulationPerYear(){
        habitants = (int) (habitants + (habitants * (growthPercentagePerYear / 100)) + peopleMovingInPerYear);
    }
}
