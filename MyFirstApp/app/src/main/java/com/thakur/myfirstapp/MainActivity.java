package com.thakur.myfirstapp;

import android.app.Activity;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

public class MainActivity extends Activity {

        private  Joke myJoke = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Joke> someJokes  = JokeWriter.getJokeListOne();
        JokeBot jokeBot = new JokeBot(someJokes);
        jokeBot.tellJoke();
        jokeBot.jokesIKnow = JokeWriter.getJokeListTwo();

        Bot myBot = new Bot();

        Joke j = new Joke("I wondered why the baseall was getting bigger","then it hit me");
      //  Joke  anotherJoke = new Joke("I learned sign language","it is very Handy");


        myJoke = j;

        Joke anotherJoke = new Joke("i learned sign language ","it is very easy");

        anotherMethod();

        ArrayList<Joke> someJokes = JokerWriter.getJokerListOne();
        JokeBot jokeBot =new JokeBot(someJokes);
        jokeBot.tellJoke();

        jokeBot.jokesIKnow = JokeWriter.getJokerListTwo();

        JokeBot jokesIKnow = JokeWriter.getJokeListOne();



        ComedianBot drHiarious = new ComedianBot("DrHilarious");
        drHiarious.performShow();


    }

    private void anotherMethod()
    {

        Log.e("TEST",myJoke.getJokePunchLine());

    }
}






/*
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ControlFow cf = new ControlFow();
        cf.start();
    }

*/
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

}







    /*
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
*/