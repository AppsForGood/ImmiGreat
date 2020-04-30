package com.example.immigreat;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static String TAG = "MainActivity";
    private static boolean mainActivityIsActive;

    /**
     *
     **/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mainActivityIsActive = true;
    }

    /**
     *
     */
    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();

        mainActivityIsActive = true;

        Runnable changeTextRunnable = new Runnable() {
            @Override
            public void run() {
                changeText();
            }
        };

        new Thread(changeTextRunnable).start();

        Log.i(TAG, "onResume");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "onStop");
    }

    @Override
    protected void onPause() {
        super.onPause();
        mainActivityIsActive = false;
        Log.i(TAG, "onPause");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG, "onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "onDestroy");
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.i(TAG, "onSaveInstanceState");
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Log.i(TAG, "onRestoreInstanceState");
    }

    /**
     * This method starts the main menu activity.
     * @param v The current view
     * @see com.example.immigreat.MenuActivity
     */

    public void performStartMenu(View v) {
        Intent intent = new Intent(this, MenuActivity.class);
        startActivity(intent);
    }

    Handler changeTextHandler = new Handler();

    public void changeText() {
        while (mainActivityIsActive) {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            changeTextHandler.post(new Runnable() {
                @Override
                public void run() {
                    TextView welcomeBtnTextView = (TextView) findViewById(R.id.welcomeButton);
                    if (welcomeBtnTextView.getText().equals(getString(R.string.welcomeStr))) {
                        welcomeBtnTextView.setText(getString(R.string.welcomeStr1));
                    } else if (welcomeBtnTextView.getText().equals(getString(R.string.welcomeStr1))) {
                        welcomeBtnTextView.setText(getString(R.string.welcomeStr2));
                    } else if (welcomeBtnTextView.getText().equals(getString(R.string.welcomeStr2))) {
                        welcomeBtnTextView.setText(getString(R.string.welcomeStr3));
                    } else if (welcomeBtnTextView.getText().equals(getString(R.string.welcomeStr3))) {
                        welcomeBtnTextView.setText(getString(R.string.welcomeStr));
                    }
                }
            });
        }
    }

}
