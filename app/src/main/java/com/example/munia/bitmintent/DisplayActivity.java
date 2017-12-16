package com.example.munia.bitmintent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class DisplayActivity extends AppCompatActivity {

    String name;
    String id;
    String dept;
    String semester;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);

        initView();
    }

    private void initView() {
        Intent munia = getIntent();
        name = munia.getStringExtra("studentName");
        id = munia.getStringExtra("studentID");
        dept = munia.getStringExtra("studentDept");
        semester = munia.getStringExtra("studentSemester");

        TextView nameET = findViewById(R.id.nameTV);
        nameET.setText(name.toString());

        TextView idTV = findViewById(R.id.idTV);
        idTV.setText(id.toString());

        TextView deptTV = findViewById(R.id.deptTV);
        deptTV.setText(dept.toString());

        TextView semesterTV = findViewById(R.id.semesterTV);
        semesterTV.setText(semester.toString());
    }
}
