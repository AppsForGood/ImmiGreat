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
        String subHeadingText = intent.getStringExtra("SUBHEADING");

//        TextView content = (TextView) findViewById(R.id.textPageContent);
//        content.setText(intent.getStringExtra("CONTENT"));

        TextView heading  = (TextView) findViewById(R.id.textPageHeading);
        heading.setText(headingText);

        TextView subheading = (TextView) findViewById(R.id.textPageSubheading);
        subheading.setText(subHeadingText);

        Fragment fragment = getContentFragment(headingText, subHeadingText);

        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.replace(R.id.textPageContentFragmentPlace, fragment);
        ft.commit();
    }

    /**
     * The method used to display the correct fragment based on the
     * @param headingText the category which the information is stored under
     * @param subHeadingText the specific identifier for the information being displayed on the page
     * @return
     */
    Fragment getContentFragment(String headingText, String subHeadingText) {
        if(headingText.equals(getResources().getString(R.string.lawsHeadingStr))) {
            if (subHeadingText.equals(getResources().getString(R.string.lawsEducationHeadingStr))) {
                return new LawsEducationFragment();
            }
            else if(subHeadingText.equals(getResources().getString(R.string.lawsKnowYourRightsHeadingStr))) {
                return new LawsKnowYourRightsFragment();
            }
            else if(subHeadingText.equals(getResources().getString(R.string.lawsDiscriminationHeadingStr))) {
                return new LawsDiscriminationFragment();
            }
            else if(subHeadingText.equals(getResources().getString(R.string.lawsPublicChargeHeadingStr))) {
                return new LawsPublicChargeFragment();
            }
        }
        if(headingText.equals(getResources().getString(R.string.lawsDrivingHeadingStr))) {
            if(subHeadingText.equals(getResources().getString(R.string.lawsDrivingApplyingLicenseHeadingStr))){
                return new LawsDrivingApplyingFragment();
            }
            else if(subHeadingText.equals(getResources().getString(R.string.lawsDrivingForeignPolicyHeadingStr))) {
                return new LawsDrivingForeignPolicyFragment();
            }
            else if(subHeadingText.equals(getResources().getString(R.string.lawsDrivingJOLHeadingStr))) {
                return new LawsDrivingJOLFragment();
            }
            else if(subHeadingText.equals(getResources().getString(R.string.lawsDrivingCellPhoneHeadingStr))) {
                return new LawsDrivingCellPhoneFragment();
            }
        }
        if(headingText.equals(getResources().getString(R.string.lawsHealthcareHeadingStr))) {
            if(subHeadingText.equals(getResources().getString(R.string.lawsHealthcarePageNewArrivalsStr))){
                return new LawsHealthcareNewArrivalsFragment();
            }
            else if(subHeadingText.equals(getResources().getString(R.string.lawsHealthcarePageSpecialConcernsStr))) {
                return new LawsHealthcareSpecialConcernsFragment();
            }
            else if(subHeadingText.equals(getResources().getString(R.string.lawsHealthcarePageFactsheetsStr))) {
                return new LawsHealthcareFactsheetsFragment();
            }
        }
        if(headingText.equals(getResources().getString(R.string.transportationHeadingStr))) {
            if(subHeadingText.equals(getResources().getString(R.string.transportationAccessibilityTheRIDEStr))){
                return new TransportationAccessibilityFragment();
            }
        }
        if(headingText.equals(getResources().getString(R.string.transportationStayingLocalSubwayStr))) {
            if(subHeadingText.equals(getResources().getString(R.string.transportationStayingLocalSubwaySchedulesStr))){
                return new TransportationStayingLocalSubwaySchedulesFragment();
            }
            if(subHeadingText.equals(getResources().getString(R.string.transportationStayingLocalSubwayFaresStr))){
                return new TransportationStayingLocalSubwayFaresFragment();
            }
            if(subHeadingText.equals(getResources().getString(R.string.transportationStayingLocalSubwayEtiquetteStr))){
                return new TransportationStayingLocalSubwayEtiquetteFragment();
            }
            if(subHeadingText.equals(getResources().getString(R.string.transportationStayingLocalSubwayAccessibilityStr))){
                return new TransportationStayingLocalSubwayAccessibilityFragment();
            }
            if(subHeadingText.equals(getResources().getString(R.string.transportationStayingLocalSubwayLanguageServicesStr))){
                return new TransportationStayingLocalSubwayLanguageServicesFragment();
            }
        }
        if(headingText.equals(getResources().getString(R.string.transportationBusStr))){
            if(subHeadingText.equals(getResources().getString(R.string.transportationBusScheduleStr))){
                return new TransportationBusScheduleFragment();
            }
            if(subHeadingText.equals(getResources().getString(R.string.transportationBusFaresStr))){
                return new TransportationBusFaresFragment();
            }
            if(subHeadingText.equals(getResources().getString(R.string.transportationBusEtiquetteStr))){
                return new TransportationBusEtiquetteFragment();
            }
        }
        if(headingText.equals(getResources().getString(R.string.transportationStayingLocalFerryStr))){
            if(subHeadingText.equals(getResources().getString(R.string.transportationStayingLocalFerrySchedulesStr))) {
                return new TransportationStayingLocalFerrySchedulesFragment();
            }
            if(subHeadingText.equals(getResources().getString(R.string.transportationStayingLocalFerryFaresStr))){
                return new TransportationStayingLocalFerryFaresFragment();
            }
            if(subHeadingText.equals(getResources().getString(R.string.transportationStayingLocalFerryNavigatingFerryDocksStr))){
                return new TransportationStayingLocalFerryNavigatingFerryDocksFragment();
            }
            if(subHeadingText.equals(getResources().getString(R.string.transportationStayingLocalFerryDuringtheTripStr))){
                return new TransportationStayingLocalFerryDuringtheTripFragment();
            }
        }
        if(headingText.equals(getResources().getString(R.string.transportationGoingFarCommuterRailStr))){
            if(subHeadingText.equals(getResources().getString(R.string.transportationGoingFarCommuterRailSchedulesStr))){
                return new TransportationGoingFarCommuterRailScheduleFragment();
            }
            if(subHeadingText.equals(getResources().getString(R.string.transportationGoingFarCommuterRailFaresStr))){
                return new TransportationGoingFarCommuterRailFaresFragment();
            }
            if(subHeadingText.equals(getResources().getString(R.string.transportationGoingFarCommuterRailNavigatingCommuterRailStationsStr))){
                return new TransportationGoingFarCommuterRailNavigatingCommuterRailStationsFragment();
            }
            if(subHeadingText.equals(getResources().getString(R.string.transportationGoingFarCommuterRailOntheTrainStr))){
                return new TransportationGoingFarCommuterRailOntheTrainFragment();
            }
            if(subHeadingText.equals(getResources().getString(R.string.transportationGoingFarCommuterRailAccessibilityStr))){
                return new TransportationGoingFarCommuterRailAccessibilityFragment();
            }
        }
        return new Error404Fragment();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

}