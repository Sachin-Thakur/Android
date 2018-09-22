package com.thakur.myfirstapp;

import android.util.Log;

import java.util.ArrayList;
import java.util.jar.Attributes;

public class ComedianBot extends JokeBot {


    public ComedianBot(ArrayList<Joke> jokesIKnow) {
        super(null);
        setName(aName);
        jokesIKnow = JokesWriter.getJokesListTwo();


    }


     public  void performShow()
     {
         talk("Good Evening Everyone ","my Name is " + getName());
         talk("Why dont i tell you  soke of my favrite jokes?");
         for (int i =0;i<jokesIKnow.size();i++)
         {
          Joke joke = jokesIKnow.get(i);
          sayJoke(joke);


         }
         talk("thanks everyone","Good Night!");


         for (Joke joke:jokesIKnow)
         {
             sayJoke(joke);
         }
     }

    @Override
    protected void sayJoke(Joke aJoke) {
        super.sayJoke(aJoke);
        Log.e("BOT"," HEY THAT JOKE IS FUNNY");


    }


}
