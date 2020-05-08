package com.example.immigreat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import org.w3c.dom.Text;

public class TransportationMenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transportation_menu);
    }

    public void performStartTextPage(View v, String heading, String subHeading) {
        Intent intent = new Intent(this, TextPageActivity.class);
        intent.putExtra("HEADING", heading);
        intent.putExtra("SUBHEADING", subHeading);

        startActivity(intent);
    }

    public void performStartStayingLocalPage(View v) {
        Intent intent = new Intent(this, TransportationStayingLocalActivity.class);
        startActivity(intent);
    }

    public void performStartGoingFarPage(View v) {
        Intent intent = new Intent(this, TransportationGoingFarActivity.class);
        startActivity(intent);
    }

    public void performStartAccessibilityPage(View v) {
        String subHeading = getResources().getString(R.string.transportationAccessibilityTheRIDEStr);
        String heading = getResources().getString(R.string.transportationHeadingStr);
        performStartTextPage(v, heading, subHeading);
    }
}
