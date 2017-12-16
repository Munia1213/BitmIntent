package com.example.munia.bitmintent;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText studentNameET;
    EditText studentIDET;
    EditText studentDeptET;
    EditText studentSemesterET;
    Button submitBtn;

//    String name;
//    String Id;
//    String Dept;
//    String Semester;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
    }

    private void initView() {
        studentNameET = (EditText) findViewById(R.id.studentNameET);
//        name = studentNameET.getText().toString();

        studentIDET = (EditText) findViewById(R.id.studentIDET);
//        Id = studentIDET.getText().toString();

        studentDeptET = (EditText) findViewById(R.id.studentDeptET);
//        Dept = studentDeptET.getText().toString();

        studentSemesterET = (EditText) findViewById(R.id.studentSemesterET);
//        Semester = studentSemesterET.getText().toString();

        submitBtn = (Button) findViewById(R.id.submitBtn);
        submitBtn.setOnClickListener(listener);
    }

   private View.OnClickListener listener = new View.OnClickListener() {
       @Override
       public void onClick(View view) {
           Intent munia = new Intent(view.getContext(), DisplayActivity.class);
           munia.putExtra("studentName",studentNameET.getText().toString());
           munia.putExtra("studentID",studentIDET.getText().toString());
           munia.putExtra("studentDept",studentDeptET.getText().toString());
           munia.putExtra("studentSemester",studentSemesterET.getText().toString());
           startActivity(munia);
       }
   };
}






































































































