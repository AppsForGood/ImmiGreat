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

    public void performStartSubwayPage(View v) {
        Intent intent = new Intent(this, TransportationStayingLocalSubwayActivity.class);
        startActivity(intent);
    }

    public void performStartBusPage(View v) {
        String subHeading = getResources().getString(R.string.transportationStayingLocalBusStr);
        String heading = getResources().getString(R.string.transportationStayingLocalHeadingStr);
        performStartTextPage(v, heading, subHeading);
    }

    public void performStartFerryPage(View v) {
        String subHeading = getResources().getString(R.string.transportationStayingLocalFerryStr);
        String heading = getResources().getString(R.string.transportationStayingLocalHeadingStr);
        performStartTextPage(v, heading, subHeading);
    }
}
