package com.example.immigreat;

import androidx.appcompat.app.AppCompatActivity;

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

        TextView content = (TextView) findViewById(R.id.textPageContent);
        content.setText(intent.getStringExtra("CONTENT"));

        TextView heading  = (TextView) findViewById(R.id.textPageHeading);
        heading.setText(intent.getStringExtra("HEADING"));

        TextView subheading = (TextView) findViewById(R.id.textPageSubheading);
        subheading.setText(intent.getStringExtra("SUBHEADING"));
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

}
