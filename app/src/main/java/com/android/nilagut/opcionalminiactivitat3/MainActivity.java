package com.android.nilagut.opcionalminiactivitat3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent data = getIntent();
        if (data.hasExtra(Intent.EXTRA_TEXT)) {
            String string = data.getStringExtra(Intent.EXTRA_TEXT);
            TextView text = (TextView) findViewById(R.id.textview);
            text.setText(string);
        }
    }
}
