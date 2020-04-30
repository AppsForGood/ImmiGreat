package com.example.immigreat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;

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

    //This method opens up the Applying for a Class D License Page once the associated button is clicked
    public void performStartApplyingPage(View v) {
        String subHeading = getResources().getString(R.string.lawsDrivingApplyingLicenseHeadingStr);
        String heading = getResources().getString(R.string.lawsDrivingHeadingStr);
        performStartPage(v, heading, subHeading);
    }

    //This method opens up the Foreign Policy Page once the associated button is clicked
    public void performStartForeignPolicyPage(View v) {
        String subHeading = getResources().getString(R.string.lawsDrivingForeignPolicyHeadingStr);
        String heading = getResources().getString(R.string.lawsDrivingHeadingStr);
        performStartPage(v, heading, subHeading);
    }

    //This method opens up the JOL Requirements Page once the associated button is clicked
    public void performStartJOLPage(View v) {
        String subHeading = getResources().getString(R.string.lawsDrivingJOLHeadingStr);
        String heading = getResources().getString(R.string.lawsDrivingHeadingStr);
        performStartPage(v, heading, subHeading);
    }

    //This method opens up the Cell Phone Laws Page once the associated button is clicked
    public void performStartCellPhonePage(View v) {
        String subHeading = getResources().getString(R.string.lawsDrivingCellPhoneHeadingStr);
        String heading = getResources().getString(R.string.lawsDrivingHeadingStr);
        performStartPage(v, heading, subHeading);
    }
}
