package com.example.app;

import android.os.Bundle;
import android.app.Activity;
import android.widget.EditText;
import android.widget.TextView;

import com.firstapp.app1.R;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Set title text
        TextView titleTextView = findViewById(R.id.information_title);
        titleTextView.setText("Student Information");
    }
}