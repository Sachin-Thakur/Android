package com.thakur.myfirstapp;

import android.util.Log;

public class Bot {

    public  final  String creatorName ="Sachin";
    private String name ="Thakur";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public  void talk(String whatToSay)
    {
        Log.e(getName(),whatToSay);

    }


}
