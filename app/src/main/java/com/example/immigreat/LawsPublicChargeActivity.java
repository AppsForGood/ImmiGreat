package com.example.immigreat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class LawsPublicChargeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_laws_public_charge);
    }

    public void performStartPage(View v, String heading, String subHeading) {
        Intent intent = new Intent(this, TextPageActivity.class);
        intent.putExtra("HEADING", heading);
        intent.putExtra("SUBHEADING", subHeading);

        startActivity(intent);
    }

    public void performStartOtherInformationPage(View v) {
        String subHeading = getResources().getString(R.string.lawsPublicChargePageOtherInformationStr);
        String heading = getResources().getString(R.string.lawsPublicChargeHeadingStr);
        performStartPage(v, heading, subHeading);
    }

    public void performStartFactsheetsPage(View v) {
        String subHeading = getResources().getString(R.string.lawsPublicChargePageFactsheetsStr);
        String heading = getResources().getString(R.string.lawsPublicChargeHeadingStr);
        performStartPage(v, heading, subHeading);
    }
}
