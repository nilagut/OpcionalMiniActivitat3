package com.android.nilagut.opcionalminiactivitat3;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        TextView text = (TextView) findViewById(R.id.textview2);
        Intent intent = getIntent();
        Uri data = intent.getData();
        if(data !=null){
            text.setText(data.toString());
        }
    }
}
