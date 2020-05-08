package com.example.immigreat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class TransportationGoingFarActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transportation_going_far);
    }
    /**
     * Allows the designated button to open the Commuter Rail activity
     * @param v
     */
    public void performStartCommuterRailPage(View v) {
        Intent intent = new Intent(this, TransportationGoingFarCommuterRailActivity.class);
        startActivity(intent);
    }

    public void performStartBusPage(View v) {
        Intent intent = new Intent(this, TransportationBusActivity.class);
        startActivity(intent);
    }
}
