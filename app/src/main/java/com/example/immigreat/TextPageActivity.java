package com.example.immigreat;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class TextPageActivity extends AppCompatActivity {

    /**
     * The onCreate is overridden to allow the text on the page to be set as the page is created. By default, the page is empty.
     * The intent that creates it must send along string extras with the desired content, heading, and subheading.
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_page);

        Intent intent = getIntent();
        String headingText = intent.getStringExtra("HEADING");
        String subheadingText = intent.getStringExtra("SUBHEADING");

//        TextView content = (TextView) findViewById(R.id.textPageContent);
//        content.setText(intent.getStringExtra("CONTENT"));

        TextView heading  = (TextView) findViewById(R.id.textPageHeading);
        heading.setText(headingText);

        TextView subheading = (TextView) findViewById(R.id.textPageSubheading);
        subheading.setText(subheadingText);

        Fragment fragment = getContentFragment(headingText, subheadingText);

        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.replace(R.id.textPageContentFragmentPlace, fragment);
        ft.commit();
    }

    Fragment getContentFragment(String headingText, String subheadingText) {
        if(headingText.equals(getResources().getString(R.string.lawsHeadingStr))) {
            if (subheadingText.equals(getResources().getString(R.string.lawsEducationHeadingStr))) {
                return new LawsEducationFragment();
            }
            else if(subheadingText.equals(getResources().getString(R.string.lawsDrivingApplyingLicenseHeadingStr))){
                return new LawsApplyingFragment();
            }
        }
        return new Error404Fragment();
    }
    @Override
    protected void onStop() {
        super.onStop();
    }

}
