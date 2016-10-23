package com.example.amd.listv;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

import java.util.ArrayList;

/**
 * Created by Annisa on 10/23/2016.
 */

public class FormStudent extends AppCompatActivity {
    private EditText edit_id, edit_nama, edit_nim, edit_email, edit_phone;
    private FloatingActionButton save_btn, cancel_btn;
    private boolean isEdit = false;
    ArrayList<Student> studentList;
    private int position;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.form_student_activity);
        studentList = StudentActivity.student;

        edit_id = (EditText) findViewById(R.id.edit_id);
        edit_nim = (EditText) findViewById(R.id.edit_nim);
        edit_nama = (EditText) findViewById(R.id.edit_nama);
        edit_email = (EditText) findViewById(R.id.edit_email);
        edit_phone = (EditText) findViewById(R.id.edit_phone);

        save_btn = (FloatingActionButton) findViewById(R.id.save_btn);
        save_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //saveStudent();
                finish();
            }
        });

        cancel_btn = (FloatingActionButton) findViewById(R.id.cancel_btn);
        cancel_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }
}

