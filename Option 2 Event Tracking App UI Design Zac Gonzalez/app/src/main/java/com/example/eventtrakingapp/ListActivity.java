package com.example.eventtrakingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ListActivity extends AppCompatActivity {
    public static final String SUBMIT = "com.example.eventtrackingapp.SUBMIT";
    public static final String NEWUSER = "com.example.eventtrackingapp.NEWUSER";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
    }

    /** Called when the user taps the Submit button */
    public void submit(View view) {
        startActivity(new Intent(this, SubmitActivity.class));
    }

    /** Called when the user taps the New User button */
    public void new_User(View view) {
       startActivity(new Intent(this, DisplayNewUserActivity.class));
    }
}