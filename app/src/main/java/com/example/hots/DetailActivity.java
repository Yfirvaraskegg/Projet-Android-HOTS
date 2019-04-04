package com.example.hots;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.support.v7.app.ActionBar;


public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        //1 - Configuring Toolbar
        this.configureToolbar();

    }

        private void configureToolbar(){
            //Get the toolbar (Serialise)
            Toolbar toolbar = (Toolbar) findViewById(R.id.activity_main_toolbar);
            //Set the toolbar
            setSupportActionBar(toolbar);
            // Get a support ActionBar corresponding to this toolbar
            ActionBar ab = getSupportActionBar();
            // Enable the Up button
            ab.setDisplayHomeAsUpEnabled(true);
    }
}
