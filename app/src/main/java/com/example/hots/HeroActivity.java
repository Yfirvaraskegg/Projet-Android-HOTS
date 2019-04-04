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
    ImageView universp;
    ImageView rolep;
    ImageView banniere;
    ImageView passif0;
    TextView descriptionp;
    ImageView talent1;
    ImageView talent2;
    ImageView talent3;
    ImageView ultime1;
    ImageView ultime2;
    TextView roletxt;
    TextView universtxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hero_activity);
        heroNom = findViewById(R.id.nomHero);
        banniere = findViewById(R.id.banniere);
        talent1 = findViewById(R.id.talent1);
        talent2 = findViewById(R.id.talent2);
        talent3 = findViewById(R.id.talent3);
        ultime1 = findViewById(R.id.ultime1);
        ultime2 = findViewById(R.id.ultime2);
        passif0 = findViewById(R.id.passif0);
        roletxt = findViewById(R.id.charRole);
        universtxt = findViewById(R.id.charUnivers);
        descriptionp = findViewById(R.id.descriptionp);
        universp = findViewById(R.id.univers);
        rolep = findViewById(R.id.role);

        Intent intent = getIntent();
        String receivedName =  intent.getStringExtra("tvName");
        String banniere_url = intent.getStringExtra("banniere_url");
        String descriptionpa =  intent.getStringExtra("descriptionpa");
        String talent1p =  intent.getStringExtra("talent1p");
        String talent2p =  intent.getStringExtra("talent2p");
        String talent3p =  intent.getStringExtra("talent3p");
        String ultime1p =  intent.getStringExtra("ultime1p");
        String ultime2p =  intent.getStringExtra("ultime2p");
        String charUnivers =  intent.getStringExtra("charUnivers");
        String charRole =  intent.getStringExtra("charRole");
        Picasso.get().load(banniere_url).into(banniere);

        String passiveUrl = intent.getStringExtra("passiveImg");
        Picasso.get().load(passiveUrl).fit().into(passif0);
        Picasso.get().load(talent1p).into(talent1);
        Picasso.get().load(talent2p).into(talent2);
        Picasso.get().load(talent3p).into(talent3);
        Picasso.get().load(ultime1p).into(ultime1);
        Picasso.get().load(ultime2p).into(ultime2);

        String roleUrl = intent.getStringExtra("roleimg");
        Picasso.get().load(roleUrl).into(rolep);
        roletxt.setText(charRole);
        universtxt.setText(charUnivers);
        descriptionp.setText(descriptionpa);
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

