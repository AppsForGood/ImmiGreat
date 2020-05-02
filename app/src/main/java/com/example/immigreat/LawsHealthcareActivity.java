package com.example.immigreat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class LawsHealthcareActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_laws_healthcare);
    }

    /**
     * This method designates which fragment is to be written to the text page activity.
     * It sends the content, heading, and subheading to the activity via intent.
     * @param v
     * @param heading the category which the information is stored under
     * @param subHeading the specific identifier for the information being displayed on the page
     */
    public void performStartPage(View v, String heading, String subHeading) {
        Intent intent = new Intent(this, TextPageActivity.class);
        intent.putExtra("HEADING", heading);
        intent.putExtra("SUBHEADING", subHeading);

        startActivity(intent);
    }

    /**
     * Allows the designated button to open the new arrivals fragment on the TextPage activity
     * @param v
     */
    public void performStartNewArrivalsPage(View v) {
        String subHeading = getResources().getString(R.string.lawsHealthcarePageNewArrivalsStr);
        String heading = getResources().getString(R.string.lawsHealthcareHeadingStr);
        performStartPage(v, heading, subHeading);
    }

    /**
     * Allows the designated button to open the special concerns fragment on the TextPage activity
     * @param v
     */
    public void performStartSpecialConcernsPage(View v) {
        String subHeading = getResources().getString(R.string.lawsHealthcarePageSpecialConcernsStr);
        String heading = getResources().getString(R.string.lawsHealthcareHeadingStr);
        performStartPage(v, heading, subHeading);
    }

    /**
     * Allows the designated button to open factsheets fragment on the TextPageActivity
     * @param v
     */
    public void performStartFactsheetsPage(View v) {
        String subHeading = getResources().getString(R.string.lawsHealthcarePageFactsheetsStr);
        String heading = getResources().getString(R.string.lawsHealthcareHeadingStr);
        performStartPage(v, heading, subHeading);
    }
}
