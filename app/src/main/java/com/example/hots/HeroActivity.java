package com.example.hots;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class HeroActivity extends AppCompatActivity {
    TextView heroNom;
    ImageView universp;
    ImageView rolep;
    ImageView banniere;
    ImageView passif0;
    TextView descriptionp;

    TextView talent1;
    ImageView talent1_0;
    TextView desc1;

    ImageView talent2_0;

    ImageView talent3_0;

    ImageView ultime1_0;

    ImageView ultime2_0;

    TextView roletxt;
    TextView universtxt;
    TextView passif;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.hero_activity);
        heroNom = findViewById(R.id.nomHero);
        banniere = findViewById(R.id.banniere);

        talent1 = findViewById(R.id.talent1);
        talent1_0=findViewById(R.id.talent1_0);

        talent2_0=findViewById(R.id.talent2_0);

        talent3_0 = findViewById(R.id.talent3_0);

        ultime1_0 = findViewById(R.id.ultime1_0);

        ultime2_0 = findViewById(R.id.ultime2_0);

        passif0 = findViewById(R.id.passif0);
        passif = findViewById(R.id.passif);
        roletxt = findViewById(R.id.charRole);
        universtxt = findViewById(R.id.charUnivers);
        descriptionp = findViewById(R.id.descriptionp);
        universp = findViewById(R.id.univers);
        rolep = findViewById(R.id.role);

        Intent intent = getIntent();
        String receivedName =  intent.getStringExtra("tvName");
        String banniere_url = intent.getStringExtra("banniere_url");

        String talent1p =  intent.getStringExtra("talent1p");
        String description =  intent.getStringExtra("description");
        String talent1txt =  intent.getStringExtra("talent1");
        Picasso.get().load(talent1p).into(talent1_0);





        String charUnivers =  intent.getStringExtra("charUnivers");
        String univers0 = intent.getStringExtra("univers0");
        Picasso.get().load(univers0).fit().centerCrop().into(universp);

        Picasso.get().load(banniere_url).fit().centerCrop().into(banniere);

        String descriptionpa =  intent.getStringExtra("descriptionpa");
        String passift =  intent.getStringExtra("passift");
        String passiveUrl = intent.getStringExtra("passiveImg");
        Picasso.get().load(passiveUrl).into(passif0);

        String talent2p =  intent.getStringExtra("talent2p");
        Picasso.get().load(talent2p).into(talent2_0);

        String talent3p =  intent.getStringExtra("talent3p");
        Picasso.get().load(talent3p).into(talent3_0);

        String ultime1p =  intent.getStringExtra("ultime1p");
        Picasso.get().load(ultime1p).into(ultime1_0);

        String ultime2p =  intent.getStringExtra("ultime2p");
        Picasso.get().load(ultime2p).into(ultime2_0);

        String charRole =  intent.getStringExtra("charRole");
        String roleUrl = intent.getStringExtra("roleimg");
        Picasso.get().load(roleUrl).into(rolep);

        roletxt.setText(charRole);
        universtxt.setText(charUnivers);
        descriptionp.setText(descriptionpa);
        heroNom.setText(receivedName);
        passif.setText(passift);

        talent1.setText(talent1txt);

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

