package com.example.hots;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {
    private TextView textViewResult;
    


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    textViewResult = findViewById(R.id.text_view_result);
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
                for (Persos perso : persos){
                    String content = "";
                    content += "Nom : " +perso.getNom() + "\n";
                    content += "Univers : " +perso.getUnivers() + "\n";
                    content += "Rôle: " +perso.getRole() + "\n";
                    content += "Difficulté : " +perso.getDifficulte() + "\n\n";
                    textViewResult.append(content);
                }
            }

            @Override
            public void onFailure(Call<List<Persos>> call, Throwable t) {
            }
        });

    }
}