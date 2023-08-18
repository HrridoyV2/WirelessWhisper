package com.example.bluetoothchatting;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class SecondActivity extends AppCompatActivity {
private EditText full1,display1;
private Button browse,login;
ImageView profile;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        full1=(EditText) findViewById(R.id.fullname);
        display1=(EditText) findViewById(R.id.displayname);
        browse=(Button) findViewById(R.id.browseid);
        login=(Button) findViewById(R.id.loginid);
        profile=(ImageView) findViewById(R.id.profileid);
    }
    public void onClick(View v)
    {
        if(v.getId()==R.id.browseid)
        {
         Intent intent=new Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
         startActivityForResult(intent,1);
        }
        if(v.getId()==R.id.loginid)
        {
            Intent i=new Intent(SecondActivity.this, ThirdActivity.class);
            Bundle bundle1=new Bundle();
           bundle1.putString("fullnme",full1.getText().toString());
           i.putExtras(bundle1);
            Bundle bundle2=new Bundle();
            bundle2.putString("dispnme",display1.getText().toString());

           i.putExtras(bundle2);
            startActivity(i);
        }
    }
    protected void onActivityResult(int requestCode,int resultCode,Intent data)
    {
        if(requestCode==1)
    }
}