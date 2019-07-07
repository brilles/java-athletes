package com.lambdaschool.solution;

public class AthleteDisplayImpl implements Athlete
{
    @Override
    public void display(String sport)
    {
        System.out.println(sport + " Athlete");
    }
}
