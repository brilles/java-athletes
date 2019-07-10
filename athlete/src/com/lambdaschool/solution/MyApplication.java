package com.lambdaschool.solution;

public class MyApplication implements Processor
{
    private AthleteServ athleteS;

    public MyApplication(AthleteServ athleteS)
    {
        this.athleteS = athleteS;
    }

    @Override
    public void displayAthlete()
    {
        System.out.println("************");
        athleteS.displayAthlete();
        System.out.println("************\n");
    }
}
