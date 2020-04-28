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

    public void performStartPage(View v, String heading, String subHeading) {
        Intent intent = new Intent(this, TextPageActivity.class);
        intent.putExtra("HEADING", heading);
        intent.putExtra("SUBHEADING", subHeading);

        startActivity(intent);
    }

    public void performStartNewArrivalsPage(View v) {
        String subHeading = getResources().getString(R.string.lawsHealthcarePageNewArrivalsStr);
        String heading = getResources().getString(R.string.lawsHealthcareHeadingStr);
        performStartPage(v, heading, subHeading);
    }

    public void performStartSpecialConcernsPage(View v) {
        String subHeading = getResources().getString(R.string.lawsHealthcarePageSpecialConcernsStr);
        String heading = getResources().getString(R.string.lawsHealthcareHeadingStr);
        performStartPage(v, heading, subHeading);
    }

    public void performStartFactsheetsPage(View v) {
        String subHeading = getResources().getString(R.string.lawsHealthcarePageFactsheetsStr);
        String heading = getResources().getString(R.string.lawsHealthcarePageFactsheetsStr);
        performStartPage(v, heading, subHeading);
    }
}
