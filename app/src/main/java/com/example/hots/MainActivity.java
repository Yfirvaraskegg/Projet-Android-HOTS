package com.example.hots;

import android.content.Intent;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
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
                        intent.putExtra("banniere_url",persos.get(i).getNom0());

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
}