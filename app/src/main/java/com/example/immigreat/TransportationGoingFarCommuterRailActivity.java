package com.example.immigreat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class TransportationGoingFarCommuterRailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transportation_going_far_commuter_rail);
    }
    /**
     * This method designates which fragment is to be written to the text page activity.
     * It sends the content, heading, and subheading to the activity via intent.
     * @param v
     * @param heading the category which the information is stored under
     * @param subHeading the specific identifier for the information being displayed on the page
     */
    public void performStartTextPage(View v, String heading, String subHeading) {
        Intent intent = new Intent(this, TextPageActivity.class);
        intent.putExtra("HEADING", heading);
        intent.putExtra("SUBHEADING", subHeading);

        startActivity(intent);
    }

    /**
     * Allows the designated button to open the Commuter Rail schedules fragment on the TextPage activity
     * @param v
     */
    public void performStartSchedulesPage(View v) {
        String subHeading = getResources().getString(R.string.transportationGoingFarCommuterRailSchedulesStr);
        String heading = getResources().getString(R.string.transportationGoingFarCommuterRailStr);
        performStartTextPage(v, heading, subHeading);
    }

    /**
     * Allows the designated button to open the Commuter Rail fares fragment on the TextPage activity
     * @param v
     */
    public void performStartFaresPage(View v) {
        String subHeading = getResources().getString(R.string.transportationGoingFarCommuterRailFaresStr);
        String heading = getResources().getString(R.string.transportationGoingFarCommuterRailStr);
        performStartTextPage(v, heading, subHeading);
    }

    /**
     * Allows the designated button to open the Commuter Rails station fragment on the TextPage activity
     * @param v
     */
    public void performStartNavigatingCommuterRailStationsPage(View v) {
        String subHeading = getResources().getString(R.string.transportationGoingFarCommuterRailNavigatingCommuterRailStationsStr);
        String heading = getResources().getString(R.string.transportationGoingFarCommuterRailStr);
        performStartTextPage(v, heading, subHeading);
    }

    /**
     * Allows the designated button to open the Commuter Rail on the train fragment on the TextPage activity
     * @param v
     */
    public void performStartOntheTrainPage(View v) {
        String subHeading = getResources().getString(R.string.transportationGoingFarCommuterRailOntheTrainStr);
        String heading = getResources().getString(R.string.transportationGoingFarCommuterRailStr);
        performStartTextPage(v, heading, subHeading);
    }

    /**
     * Allows the designated button to open the Commuter Rail accessibility fragment on the TextPage activity
     * @param v
     */
    public void performStartAccessibilityPage(View v) {
        String subHeading = getResources().getString(R.string.transportationGoingFarCommuterRailAccessibilityStr);
        String heading = getResources().getString(R.string.transportationGoingFarCommuterRailStr);
        performStartTextPage(v, heading, subHeading);
    }
}
