package com.example.hots;

import android.content.Intent;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.transition.Slide;
import android.transition.TransitionInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setupWindowAnimations();

        Gson gson = new GsonBuilder()
                .setLenient()
                .create();

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://bridge.buddyweb.fr/api/hotsapi/")
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build();
        HotsInterface hotsInterface =  retrofit.create(HotsInterface.class);
        Call<List<Persos>> call = hotsInterface.getPersos();

        call.enqueue(new Callback<List<Persos>>() {
            @Override
            public void onResponse(Call<List<Persos>> call, Response<List<Persos>> response) {
                if (!response.isSuccessful()){
                    return;
                }
                List<Persos> persos = response.body();
                //Attaching the adapter to a ListView
                // Construct the data source
                ArrayList<Persos> arrayOfUsers = new ArrayList<Persos>();
                // Create the adapter to convert the array to views
                UsersAdapter adapter = new UsersAdapter(MainActivity.this, arrayOfUsers);
                // Attach the adapter to a ListView
                ListView listView = (ListView) findViewById(R.id.list_char);
                listView.setAdapter(adapter);
                listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                        Intent intent = new Intent(getApplicationContext(),HeroActivity.class);
                        intent.putExtra("tvName",persos.get(i).getNom());
                        intent.putExtra("banniere_url",persos.get(i).getBanniere());

                        intent.putExtra("passift",persos.get(i).getPassif());
                        intent.putExtra("passiveImg",persos.get(i).getPassif0());
                        intent.putExtra("descriptionpa",persos.get(i).getDscriptionP());


                        intent.putExtra("talent1p",persos.get(i).getTalent1_0());
                        intent.putExtra("talent1",persos.get(i).getTalent1());
                        intent.putExtra("description",persos.get(i).getDescription1());

                        intent.putExtra("talent2p",persos.get(i).getTalent2_0());
                        intent.putExtra("talent2",persos.get(i).getTalent2());
                        intent.putExtra("description2",persos.get(i).getDescription2());

                        intent.putExtra("talent3p",persos.get(i).getTalent3_0());
                        intent.putExtra("talent3",persos.get(i).getTalent3());
                        intent.putExtra("description3",persos.get(i).getDescription3());

                        intent.putExtra("ultime1p",persos.get(i).getUltime1_0());
                        intent.putExtra("ultime1",persos.get(i).getUltime1());
                        intent.putExtra("descriptionu1",persos.get(i).getDescriptionu1());

                        intent.putExtra("ultime2p",persos.get(i).getUltime2_0());
                        intent.putExtra("ultime2",persos.get(i).getUltime2());
                        intent.putExtra("descriptionu2",persos.get(i).getDescriptionu2());

                        intent.putExtra("univers0",persos.get(i).getUnivers0());
                        intent.putExtra("charUnivers",persos.get(i).getUnivers());

                        intent.putExtra("roleimg",persos.get(i).getRole0());
                        intent.putExtra("charRole",persos.get(i).getRole());

                        startActivity(intent);
                    }
                });
                adapter.addAll(persos);
            }

            @Override
            public void onFailure(Call<List<Persos>> call, Throwable t) {

            }
        });

    }
    private void setupWindowAnimations() {
        Slide slide = (Slide) TransitionInflater.from(this).inflateTransition(R.transition.activity_slide);
        getWindow().setExitTransition(slide);
    }
}