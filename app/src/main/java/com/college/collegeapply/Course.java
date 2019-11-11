package com.college.collegeapply;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Course extends AppCompatActivity {
    private TextView nameDetails,courseDetails;
    private String name, course;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course);

        nameDetails = findViewById(R.id.nameDetails);
        courseDetails = findViewById(R.id.courseDetails);

        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            name = bundle.getString("name");
            course = bundle.getString("course");

            nameDetails.setText(name);
            courseDetails.setText(course);
        }
    }
}
