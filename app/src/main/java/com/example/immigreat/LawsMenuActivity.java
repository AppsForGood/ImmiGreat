package com.example.immigreat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class LawsMenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_laws_menu);
    }

    /**
     * This method is reusable in all situations where content must be written to the text page activity.
     * It sends the content, heading, and subheading to the activity via intent.
     * @param v
     * @param content The main information which is to be displayed on the text page.
     * @param heading The heading for the text page.
     * @param subheading The subheading for the text page.
     */
    public void performStartPage(View v, String content, String heading, String subheading) {
        Intent intent = new Intent(this, TextPageActivity.class);
        intent.putExtra("CONTENT", content);
        intent.putExtra("HEADING", heading);
        intent.putExtra("SUBHEADING", subheading);

        startActivity(intent);
    }

    public void performStartEducationPage(View v) {
        String content = getResources().getString(R.string.educationPageContentStr);
        String heading = getResources().getString(R.string.lawsHeadingStr);
        String subheading = getResources().getString(R.string.lawsEducationHeadingStr);
        performStartPage(v, content, heading, subheading);
    }

}
