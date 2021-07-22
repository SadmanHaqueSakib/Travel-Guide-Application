package com.example.travelmania;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.travelmania.Theme.themeUtils;

public class Settings extends AppCompatActivity  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_settings);
        /**themeUtils.onActivityCreateSetTheme(this);

        //findViewById(R.id.blackbutton).setOnClickListener(this);
        //findViewById(R.id.bluebutton).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            //case R.id.blackbutton:
                themeUtils.changeToTheme(this, themeUtils.BLACK);
                break;
            //case R.id.bluebutton:
                themeUtils.changeToTheme(this, themeUtils.BLUE);
                break;

        }**/


    }
    @Override
    public void onBackPressed() {
        startActivity(new Intent(getApplicationContext(), Places.class));
        super.onBackPressed();
    }
}