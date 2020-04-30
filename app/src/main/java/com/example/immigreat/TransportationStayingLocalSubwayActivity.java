package com.example.immigreat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;

public class TransportationStayingLocalSubwayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transportation_staying_local_subway);
        TextView text = (TextView) findViewById(R.id.transportationStayingLocalSubwayOverview);
        text.setMovementMethod(LinkMovementMethod.getInstance());
    }

    public void performStartTextPage(View v, String heading, String subHeading) {
        Intent intent = new Intent(this, TextPageActivity.class);
        intent.putExtra("HEADING", heading);
        intent.putExtra("SUBHEADING", subHeading);

        startActivity(intent);
    }

    public void performStartSchedulesPage(View v) {
        String subHeading = getResources().getString(R.string.transportationStayingLocalSubwaySchedulesStr);
        String heading = getResources().getString(R.string.transportationStayingLocalSubwayStr);
        performStartTextPage(v, heading, subHeading);
    }

    public void performStartFaresPage(View v) {
        String subHeading = getResources().getString(R.string.transportationStayingLocalSubwayFaresStr);
        String heading = getResources().getString(R.string.transportationStayingLocalSubwayStr);
        performStartTextPage(v, heading, subHeading);
    }

    public void performStartEtiquettePage(View v) {
        String subHeading = getResources().getString(R.string.transportationStayingLocalSubwayEtiquetteStr);
        String heading = getResources().getString(R.string.transportationStayingLocalSubwayStr);
        performStartTextPage(v, heading, subHeading);
    }

    public void performStartAccessibilityPage(View v) {
        String subHeading = getResources().getString(R.string.transportationStayingLocalSubwayAccessibilityStr);
        String heading = getResources().getString(R.string.transportationStayingLocalSubwayStr);
        performStartTextPage(v, heading, subHeading);
    }

    public void performStartLanguageServicesPage(View v) {
        String subHeading = getResources().getString(R.string.transportationStayingLocalSubwayLanguageServicesStr);
        String heading = getResources().getString(R.string.transportationStayingLocalSubwayStr);
        performStartTextPage(v, heading, subHeading);
    }

}
