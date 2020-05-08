package com.example.immigreat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class TransportationStayingLocalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transportation_staying_local);
    }

    public void performStartTextPage(View v, String heading, String subHeading) {
        Intent intent = new Intent(this, TextPageActivity.class);
        intent.putExtra("HEADING", heading);
        intent.putExtra("SUBHEADING", subHeading);

        startActivity(intent);
    }

    /**
     * Allows the designated button to open the Subway activity
     * @param v
     */
    public void performStartSubwayPage(View v) {
        Intent intent = new Intent(this, TransportationStayingLocalSubwayActivity.class);
        startActivity(intent);
    }

    /**
     * Allows the designated button to open the Bus activity
     * @param v
     */
    public void performStartBusPage(View v) {
        Intent intent = new Intent(this, TransportationBusActivity.class);
        startActivity(intent);
    }

    /**
     * Allows the designated button to open the Ferry activity
     * @param v
     */
    public void performStartFerryPage(View v) {
        Intent intent = new Intent(this, TransportationStayingLocalFerryActivity.class);
        startActivity(intent);
    }
}
