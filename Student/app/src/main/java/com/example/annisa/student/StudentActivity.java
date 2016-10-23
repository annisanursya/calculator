package com.example.annisa.student;

import java.util.ArrayList;
import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.annisa.student.adapter.StudentArrayAdapter;

public class StudentActivity extends Activity {

    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student);
        populateStudentList();
    }

    private void populateStudentList() {
        // Construct the data source
        ArrayList<Student> arrayOfUsers = Student.getUsers();
        // Create the adapter to convert the array to views
        StudentArrayAdapter adapter = new StudentArrayAdapter(this, arrayOfUsers);
        // Attach the adapter to a ListView
        ListView listView = (ListView) findViewById(R.id.lvStudent);
        listView.setAdapter(adapter);
    }
}




