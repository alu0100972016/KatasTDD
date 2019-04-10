package com.populationgrowth;

public class App {
    private Population population;
    private int populationToReach;

    public App(int habitants, float growthPercentagePerYear, int peopleMovingInPerYear, int populationToReach){
        this.population = new Population(habitants, growthPercentagePerYear, peopleMovingInPerYear);
        this.populationToReach = populationToReach;
    }

    public int getYearsUntilReachExpectedPopulation(){
        int countYears = 0;
        while(population.getHabitants() < populationToReach){
            population.calculatePopulationPerYear();
            countYears++;
        }
        return countYears;
    }
}
