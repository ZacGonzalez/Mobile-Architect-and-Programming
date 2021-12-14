package com.example.eventtrakingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class DisplayNewUserActivity extends AppCompatActivity {
    public static final String SUBMIT = "com.example.eventtrackingapp.SUBMIT";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_new_user);
    }

    /** Called when the user taps the Submit button */
    public void submit(View view) {
        startActivity(new Intent(this, SubmitActivity.class));
    }
}