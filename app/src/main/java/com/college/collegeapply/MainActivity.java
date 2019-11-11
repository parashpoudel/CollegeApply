package com.college.collegeapply;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {
    private Spinner spinCourse;
    private EditText name;
    private Button btnSave;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        spinCourse = findViewById(R.id.spinCourse);
        name = findViewById(R.id.Name);

        btnSave = findViewById(R.id.btnSave);

        String course[] = {"BIT", "BHM", "BBA", "BSC csit", "MBA"};
        ArrayAdapter adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, course);
        spinCourse.setAdapter(adapter);

        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Course.class);
                intent.putExtra("name", name.getText().toString());
                intent.putExtra("course", spinCourse.getSelectedItem().toString());
                startActivity(intent);
            }
        });
    }
}
