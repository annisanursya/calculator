package com.example.annisa.student.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Annisa on 10/7/2016.
 */

public class StudentArrayAdapter extends ArrayAdapter<student> {
    public StudentArrayAdapter (Context context, ArrayList<Student> studentArrayList) {
        super(context, 0, studentArrayList);
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {
        // Get the data item for this position
        Student student = getItem(position);
        // Check if an existing view is being reused, otherwise inflate the view
        if (view == null) {
            view = LayoutInflater.from(getContext()).inflate(R.layout.layout_student, parent, false);
        }
        // Lookup view for data population
        TextView idView = (TextView) view.findViewById(R.id.idView);
        TextView noregView = (TextView) view.findViewById(R.id.student_noreg);
        TextView nameView = (TextView) view.findViewById(R.id.student_name);
        TextView emailView = (TextView) view.findViewById(R.id.student_email);
        TextView phoneView = (TextView) view.findViewById(R.id.student_phone);
        // Populate the data into the template view using the data object
        idView.setText(Student.getId() + "");
        noregView.setText(student.getNoreg() + "");
        nameView.setText(student.getName() + "");
        emailView.setText(student.getEmail() + "");
        phoneView.setText(student.getPhone() + "");

        // Return the completed view to render on screen
        return view;
    }
}
