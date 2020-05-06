package com.example.immigreat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class TransportationStayingLocalFerryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transportation_staying_local_ferry);
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
     * Allows the designated button to open the ferry schedules fragment on the TextPage activity
     * @param v
     */
    public void performStartSchedulesPage(View v) {
        String subHeading = getResources().getString(R.string.transportationStayingLocalFerrySchedulesStr);
        String heading = getResources().getString(R.string.transportationStayingLocalFerryStr);
        performStartTextPage(v, heading, subHeading);
    }

    /**
     * Allows the designated button to open the ferry fares fragment on the TextPage activity
     * @param v
     */
    public void performStartFaresPage(View v) {
        String subHeading = getResources().getString(R.string.transportationStayingLocalFerryFaresStr);
        String heading = getResources().getString(R.string.transportationStayingLocalFerryStr);
        performStartTextPage(v, heading, subHeading);
    }

    /**
     * Allows the designated button to open the navigating ferry docks fragment on the TextPage activity
     * @param v
     */
    public void performStartNavigatingFerryDocksPage(View v) {
        String subHeading = getResources().getString(R.string.transportationStayingLocalFerryNavigatingFerryDocksStr);
        String heading = getResources().getString(R.string.transportationStayingLocalFerryStr);
        performStartTextPage(v, heading, subHeading);
    }

    /**
     * Allows the designated button to open the ferry during the trip fragment on the TextPage activity
     * @param v
     */
    public void performStartDuringtheTripPage(View v) {
        String subHeading = getResources().getString(R.string.transportationStayingLocalFerryDuringtheTripStr);
        String heading = getResources().getString(R.string.transportationStayingLocalFerryStr);
        performStartTextPage(v, heading, subHeading);
    }
}
