package com.luisangelservera.ex3_android.controller;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
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


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Subject subject = subjects.get(i);
                Intent intent = SubjectInfoActivity.newIntent(SubjectsActivity.this, subject);
                startActivity(intent);
            }
        });

    }


    private void loadSubjects() {
        subjects.add(new Subject(R.string.mobile_name, 6, R.string.mobile_description, R.drawable.mobile_development));
        subjects.add(new Subject(R.string.online_services_name, 6, R.string.online_services_description, R.drawable.services_development));
        subjects.add(new Subject(R.string.web_name, 6, R.string.web_description, R.drawable.web_development));
        subjects.add(new Subject(R.string.object_name, 6, R.string.object_description, R.drawable.object_development));
    }

}