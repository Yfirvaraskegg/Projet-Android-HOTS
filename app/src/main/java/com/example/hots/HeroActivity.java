package com.example.hots;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import jp.wasabeef.picasso.transformations.RoundedCornersTransformation;

public class HeroActivity extends AppCompatActivity {
    TextView heroNom;
    ImageView universp;
    ImageView rolep;
    ImageView banniere;
    ImageView passif0;
    TextView descriptionp;

    TextView talent1;
    ImageView talent1_0;
    TextView description1;

    TextView talent2;
    ImageView talent2_0;
    TextView description2;

    TextView talent3;
    ImageView talent3_0;
    TextView description3;

    ImageView ultime1_0;
    TextView ultime1;
    TextView descriptionu1;

    ImageView ultime2_0;
    TextView ultime2;
    TextView descriptionu2;

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
        description1=findViewById(R.id.description1);

        talent2 = findViewById(R.id.talent2);
        talent2_0=findViewById(R.id.talent2_0);
        description2=findViewById(R.id.description2);

        talent3 = findViewById(R.id.talent3);
        talent3_0=findViewById(R.id.talent3_0);
        description3=findViewById(R.id.description3);

        ultime1_0 = findViewById(R.id.ultime1_0);
        ultime1=findViewById(R.id.ultime1);
        descriptionu1=findViewById(R.id.descriptionu1);

        ultime2_0 = findViewById(R.id.ultime2_0);
        ultime2=findViewById(R.id.ultime2);
        descriptionu2=findViewById(R.id.descriptionu2);

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
        String talent1Nom =  intent.getStringExtra("talent1");
        Picasso.get().load(talent1p).transform(new RoundedCornersTransformation(10,5)).into(talent1_0);





        String charUnivers =  intent.getStringExtra("charUnivers");
        String univers0 = intent.getStringExtra("univers0");
        Picasso.get().load(univers0).fit().centerCrop().into(universp);

        Picasso.get().load(banniere_url).fit().centerCrop().into(banniere);

        String descriptionpa =  intent.getStringExtra("descriptionpa");
        String passift =  intent.getStringExtra("passift");
        String passiveUrl = intent.getStringExtra("passiveImg");
        Picasso.get().load(passiveUrl).transform(new RoundedCornersTransformation(10,5)).into(passif0);

        String talent2p =  intent.getStringExtra("talent2p");
        String description2t =  intent.getStringExtra("description2");
        String talent2Nom =  intent.getStringExtra("talent2");
        Picasso.get().load(talent2p).transform(new RoundedCornersTransformation(10,5)).into(talent2_0);

        String talent3p =  intent.getStringExtra("talent3p");
        String description3t =  intent.getStringExtra("description3");
        String talent3Nom =  intent.getStringExtra("talent3");
        Picasso.get().load(talent3p).transform(new RoundedCornersTransformation(10,5)).into(talent3_0);

        String ultime1p =  intent.getStringExtra("ultime1p");
        String descriptionu1t =  intent.getStringExtra("descriptionu1");
        String ultime1Nom =  intent.getStringExtra("ultime1");
        Picasso.get().load(ultime1p).transform(new RoundedCornersTransformation(10,5)).into(ultime1_0);

        String ultime2p =  intent.getStringExtra("ultime2p");
        String descriptionu2t =  intent.getStringExtra("descriptionu2");
        String ultime2Nom =  intent.getStringExtra("ultime2");
        Picasso.get().load(ultime2p).transform(new RoundedCornersTransformation(10,5)).into(ultime2_0);

        String charRole =  intent.getStringExtra("charRole");
        String roleUrl = intent.getStringExtra("roleimg");
        Picasso.get().load(roleUrl).transform(new RoundedCornersTransformation(10,5)).into(rolep);

        roletxt.setText(charRole);
        universtxt.setText(charUnivers);
        descriptionp.setText(descriptionpa);
        heroNom.setText(receivedName);
        passif.setText(passift);
//        Log.d("test",talent1Nom);
        talent1.setText(talent1Nom);
        description1.setText(description);

        talent2.setText(talent2Nom);
        description2.setText(description2t);

        talent3.setText(talent3Nom);
        description3.setText(description3t);

        ultime1.setText(ultime1Nom);
        descriptionu1.setText(descriptionu1t);

        ultime2.setText(ultime2Nom);
        descriptionu2.setText(descriptionu2t);
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

