package com.luisangelservera.ex3_android.controller;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.luisangelservera.ex3_android.MyAdapter;
import com.luisangelservera.ex3_android.R;
import com.luisangelservera.ex3_android.model.Subject;

import java.util.ArrayList;

public class SubjectsActivity extends AppCompatActivity {

    private ListView listView;
    private ArrayList<Subject> subjects = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subjects);

        loadSubjects();

        listView = findViewById(R.id.subjectsListView);

        MyAdapter myAdapter = new MyAdapter(this, R.layout.subject_item, subjects);
        listView.setAdapter(myAdapter);

    }


    private void loadSubjects() {
        subjects.add(new Subject("Nose", 1));
        subjects.add(new Subject("Nose 1", 2));
        subjects.add(new Subject("Nose 2", 3));
        //subjects.add(new Subject("Nose 3", 4));
    }

}