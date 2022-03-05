package com.luisangelservera.ex3_android.controller;

import androidx.annotation.DrawableRes;
import androidx.annotation.StringRes;
import androidx.appcompat.app.AppCompatActivity;

import com.luisangelservera.ex3_android.R;
import com.luisangelservera.ex3_android.model.Subject;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class SubjectInfoActivity extends AppCompatActivity {

    private static final String SUBJECT_NAME = "SUBJECT_NAME";
    private static final String SUBJECT_IMAGE = "SUBJECT_IMAGE";
    private static final String SUBJECT_CREDITS = "SUBJECT_CREDITS";
    private static final String SUBJECT_DESCRIPTION = "SUBJECT_DESCRIPTION";

    private ImageView subjectImageIV;
    private TextView subjectNameTV;
    private TextView subjectDescTV;
    private TextView subjectCreditsTV;

    @StringRes
    private int subjectName;
    @StringRes
    private int subjectDescription;
    private int subjectCredits;
    @DrawableRes
    private int subjectImage;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subject_info);

        subjectName = getIntent().getIntExtra(SUBJECT_NAME, 0);
        subjectDescription = getIntent().getIntExtra(SUBJECT_DESCRIPTION, 0);
        subjectCredits = getIntent().getIntExtra(SUBJECT_CREDITS, 0);
        subjectImage = getIntent().getIntExtra(SUBJECT_IMAGE, 0);

        subjectImageIV = findViewById(R.id.subjectInfoIV);
        subjectImageIV.setImageResource(subjectImage);

        subjectNameTV = findViewById(R.id.subjectNameInfoTV);
        subjectNameTV.setText(subjectName);

        subjectCreditsTV = findViewById(R.id.creditsInfoTV);
        subjectCreditsTV.setText(subjectCredits + " " + getResources().getString(R.string.credits_string));

        subjectDescTV = findViewById(R.id.subjectDescInfoTV);
        subjectDescTV.setText(subjectDescription);

    }


    public static Intent newIntent(Context packageContext, Subject subject) {
        Intent intent = new Intent(packageContext, SubjectInfoActivity.class);

        intent.putExtra(SUBJECT_NAME, subject.getName());
        intent.putExtra(SUBJECT_CREDITS, subject.getCredits());
        intent.putExtra(SUBJECT_DESCRIPTION, subject.getDescription());
        intent.putExtra(SUBJECT_IMAGE, subject.getImage());

        return intent;
    }

}