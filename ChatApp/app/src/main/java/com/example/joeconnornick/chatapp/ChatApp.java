package com.example.joeconnornick.chatapp;

import com.parse.Parse;
import android.app.Application;

/**
 * Created by Nick on 11/29/2015.
 */
public class ChatApp extends Application {
    @Override
    public void OnCreate()
    {
        super.OnCreate();

        Parse.initialize(this, "rVF3mDhITDOW0ZkjHFYDnJjLAkVOqo3VyJohwDuG", "PxHVWxvoePSG1kdVrVI69138eUithUpuR3K2SA1R");
    }
}
