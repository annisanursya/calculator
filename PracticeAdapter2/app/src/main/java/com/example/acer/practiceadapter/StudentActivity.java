package com.example.acer.practiceadapter;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import com.example.acer.practiceadapter.com.example.acer.adapter.StudentArrayAdapter;
import com.example.acer.practiceadapter.com.example.acer.user.Student;

import java.util.ArrayList;
/**
 * Created by ACER on 13/10/2016.
 */
public class StudentActivity extends AppCompatActivity {
    private StudentArrayAdapter studentArrayAdapter;
    private ListView list_items;
    private TextView emptyTextView;
    private ArrayList<Student> studentList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_view);

        ArrayList<Student> students = populateStudentDummies();
        StudentArrayAdapter studentArrayAdapter = new StudentArrayAdapter(this, new ArrayList<Student>());
        
        ListView list_item = (ListView) findViewById(R.id.list_item);
        list_item.setAdapter(studentArrayAdapter);
        emptyTextView = (TextView) findViewById(R.id.empty_view);
        list_item.setEmptyView(emptyTextView);
        Button addButton = (Button) findViewById(R.id.addButton);
        addButton.setOnClickListener(new.onClickListener()) {
            @override
                    public void onClick(View v) {
                Intent Intent = new Intent(StudentActivity.this, AddStudentActivity.class);
                startActivity(Intent);
            }

        });

        list_item_setOnItemClickListener(new AdapterView.OnItemClickListener()) (
                @Override
                        public void onItemClick(AdapterView)

        )

    }

    private ArrayList<Student> populateStudentDummies(){
        ArrayList<Student> studentList = new ArrayList<Student>();
        studentList.add(new Student(1,"3145136188","TRI FEBRIANA SIAMI","0858xxxxxx","tri@mhs.unj.ac.id"));
        studentList.add(new Student(2,"3145136192","Ummu Kultsum","0813xxxxxx","ummu@mhs.unj.ac.id"));
        studentList.add(new Student(3,"3145136193","Hana Maulinda","0813xxxxxx","hana@mhs.unj.ac.id"));
        studentList.add(new Student(4,"3145136194","Dian Rakasiwi","0813xxxxxx","dian@mhs.unj.ac.id"));
        studentList.add(new Student(5,"3145136196","Mikael Yurubeli","0813xxxxxx","mika@mhs.unj.ac.id"));
        studentList.add(new Student(6,"3145136197","Muhammad Fachrizal","0856xxxxxx","ijal@mhs.unj.ac.id"));
        studentList.add(new Student(7,"3145136203","Ghina Rosika Amalina","0813xxxxxx","ghina@mhs.unj.ac.id"));
        studentList.add(new Student(8,"3145136204","Dinda Kharisma","0896xxxxxx","dinda@mhs.unj.ac.id"));
        studentList.add(new Student(9,"3145136205","Annisa Mutiara Ditri","0813xxxxxx","ditri@mhs.unj.ac.id"));
        studentList.add(new Student(10,"3145136206","Ghina Salsabila","0815xxxxxx","ghisa@mhs.unj.ac.id"));
        return studentList;
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_student_list, menu);
        return true;

    }
}