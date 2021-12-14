package com.example.eventtrakingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SubmitActivity extends AppCompatActivity {
    public static final String NOTIFICATIONPERMISSIONS = "com.example.eventtrackingapp.NOTIFICATIONPERMISSIONS";

    EventDatabase eventdb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_submit);

        eventdb = new EventDatabase(this);
    }

    /** Called when the user taps the Notification Permissions button */
    public void notification_Permissions(View view) {
        startActivity(new Intent(this, DisplayNotificationPermissions.class));
    }
}