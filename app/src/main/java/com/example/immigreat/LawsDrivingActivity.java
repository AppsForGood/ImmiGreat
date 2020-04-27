package com.example.immigreat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class LawsDrivingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_laws_driving);
    }

    public void performStartPage(View v, String heading, String subHeading) {
        Intent intent = new Intent(this, TextPageActivity.class);
        intent.putExtra("HEADING", heading);
        intent.putExtra("SUBHEADING", subHeading);

        startActivity(intent);
    }

    public void performStartApplyingPage(View v) {
        String subHeading = getResources().getString(R.string.lawsDrivingApplyingLicenseHeadingStr);
        String heading = getResources().getString(R.string.lawsHeadingStr);
        performStartPage(v, heading, subHeading);
    }

    public void performStartForeignPolicyPage(View v) {
        String subHeading = getResources().getString(R.string.lawsDrivingForeignPolicyHeadingStr);
        String heading = getResources().getString(R.string.lawsHeadingStr);
        performStartPage(v, heading, subHeading);
    }

    public void performStartJOLPage(View v) {
        String subHeading = getResources().getString(R.string.lawsDrivingJOLHeadingStr);
        String heading = getResources().getString(R.string.lawsHeadingStr);
        performStartPage(v, heading, subHeading);
    }
    public void performCellPhonePage(View v) {
        String subHeading = getResources().getString(R.string.lawsDrivingCellPhoneHeadingStr);
        String heading = getResources().getString(R.string.lawsHeadingStr);
        performStartPage(v, heading, subHeading);
    }
}
