package com.example.immigreat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class TransportationBusActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transportation_bus);
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
     * Allows the designated button to open the bus schedules fragment on the TextPage activity
     * @param v
     */
    public void performStartSchedulePage(View v) {
        String subHeading = getResources().getString(R.string.transportationBusScheduleStr);
        String heading = getResources().getString(R.string.transportationBusStr);
        performStartTextPage(v, heading, subHeading);
    }

    /**
     * Allows the designated button to open the bus fares fragment on the TextPage activity
     * @param v
     */
    public void performStartFaresPage(View v) {
        String subHeading = getResources().getString(R.string.transportationBusFaresStr);
        String heading = getResources().getString(R.string.transportationBusStr);
        performStartTextPage(v, heading, subHeading);
    }

    /**
     * Allows the designated button to open the bus etiquette fragment on the TextPage activity
     * @param v
     */
    public void performStartEtiquettePage(View v) {
        String subHeading = getResources().getString(R.string.transportationBusEtiquetteStr);
        String heading = getResources().getString(R.string.transportationBusStr);
        performStartTextPage(v, heading, subHeading);
    }
}
