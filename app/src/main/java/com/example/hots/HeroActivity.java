package com.example.hots;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class HeroActivity extends AppCompatActivity {
    TextView heroNom;
    ImageView banniere;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hero_activity);
        heroNom = findViewById(R.id.nomHero);
        banniere = findViewById(R.id.banniere);
        Intent intent = getIntent();
        String receivedName =  intent.getStringExtra("tvName");
        String banniere_url = intent.getStringExtra("banniere_url");
        Picasso.get().load(banniere_url).into(banniere);
        heroNom.setText(receivedName);
        //enable back Button
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
    //getting back to listview
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            onBackPressed();
        }
        return super.onOptionsItemSelected(item);

    }
    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}

