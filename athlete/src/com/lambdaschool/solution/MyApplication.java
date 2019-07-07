package com.lambdaschool.solution;

import com.lambdaschool.initial.Athlete;

public class MyApplication implements Processor
{
    private Athlete athlete;

    public MyApplication(String sport)
    {
        this.sport = sport;
    }

    @Override
    public void displayAthlete()
    {
        System.out.println("************");
        athlete.display(sport);
        System.out.println("************\n");
    }
}
