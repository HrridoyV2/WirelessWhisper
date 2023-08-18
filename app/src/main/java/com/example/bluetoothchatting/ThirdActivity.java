package com.example.bluetoothchatting;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class ThirdActivity extends AppCompatActivity {
 TextView full2,display2;
 ImageView img;
    Intent inte;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        full2=(TextView) findViewById(R.id.fullname2);
        display2=(TextView) findViewById(R.id.displayname2);
        img=(ImageView)findViewById(R.id.imgid);
         inte=getIntent();
        Uri uri=(Uri) inte.getParcelableExtra("img") ;
        img.setImageURI(uri);
        Bundle b1=getIntent().getExtras();
        full2.setText(b1.getString("fullnme"));
        Bundle b2=getIntent().getExtras();
        display2.setText(b2.getString("dispnme"));
    }
}