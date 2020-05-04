package com.example.immigreat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }

    /**
     * TODO write this comment
     * @param v
     */

    public void performStartLawsMenu(View v) {
        Intent intent = new Intent(this, LawsMenuActivity.class);
        startActivity(intent);
    }

    public void performStartTransportationMenu(View v) {
        Intent intent = new Intent(this, TransportationMenuActivity.class);
        startActivity(intent);
    }

    public void performStartHealthcareMenu(View v) {
        Intent intent = new Intent(this, LawsHealthcareActivity.class);
        startActivity(intent);
    }

}
