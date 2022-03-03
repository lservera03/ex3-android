package com.luisangelservera.ex3_android;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import androidx.annotation.LayoutRes;

import com.luisangelservera.ex3_android.model.Subject;

import java.util.ArrayList;

public class MyAdapter extends BaseAdapter {

    private Context context;
    @LayoutRes
    private int layout;
    private ArrayList<Subject> subjects;


    public MyAdapter(Context context, @LayoutRes int layout, ArrayList<Subject> subjects) {
        this.context = context;
        this.layout = layout;
        this.subjects = subjects;
    }

    @Override
    public int getCount() {
        return this.subjects.size();
    }

    @Override
    public Object getItem(int i) {
        return this.subjects.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View aux = view;

        LayoutInflater layoutInflater = LayoutInflater.from(this.context);

        aux = layoutInflater.inflate(R.layout.subject_item, null);

        TextView subjectName = aux.findViewById(R.id.subjectNameTV);
        subjectName.setText(subjects.get(i).getName());

        TextView subjectCredits = aux.findViewById(R.id.creditsTV);
        subjectCredits.setText(String.valueOf(subjects.get(i).getCredits()));


        return aux;
    }
}
