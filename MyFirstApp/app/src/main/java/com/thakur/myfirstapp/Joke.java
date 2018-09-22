package com.thakur.myfirstapp;

public class Joke {



    private String jokeSetup;
    private String jokePunchLine;

    public  Joke(String jokeSetup,String aJOkePunchLine)
    {
        this.jokeSetup =jokeSetup;
        this.jokePunchLine =aJOkePunchLine;
    }

    public String getJokePunchLine() {
        return jokePunchLine;
    }

    public void setJokePunchLine(String jokePunchLine) {
        jokeSetup = "here is my favrite joke" + jokeSetup;
        this.jokePunchLine = jokePunchLine;
    }

    public String getJokeSetup() {
        return jokeSetup;
    }

    public void setJokeSetup(String jokeSetup) {
        this.jokeSetup = jokeSetup;
    }
}

