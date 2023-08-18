package com.example.bluetoothchatting;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class ThirdActivity extends AppCompatActivity {
 TextView full2,display2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        full2=(TextView) findViewById(R.id.fullname2);
        display2=(TextView) findViewById(R.id.displayname2);
        Bundle b1=getIntent().getExtras();
        full2.setText(b1.getString("fullnme"));
        Bundle b2=getIntent().getExtras();
        display2.setText(b2.getString("dispnme"));
    }
}