package com.lambdaschool.initial;

// Tightly Coupled
public class Main
{

    public static void main(String[] args)
    {
        MyApplication myAthlete = new MyApplication();
        myAthlete.create("Track");
        myAthlete.create("Hockey");
        myAthlete.create("Rugby");
    }
}