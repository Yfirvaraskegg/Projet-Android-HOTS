package com.example.hots;

import com.example.hots.HotsInterface;
import com.example.hots.MainActivity;
import com.example.hots.Persos;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


public class MainController {

    private MainActivity activity;

    public MainController(MainActivity mainActivity) {
        this.activity = mainActivity;
    }

    public void onStart(){


        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://bridge.buddyweb.fr/api/hotsapi/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        HotsInterface hotsInterface =  retrofit.create(HotsInterface.class);
        Call<List<Persos>> call = HotsInterface.getPersos();

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


                }
            }

            @Override
            public void onFailure(Call<List<Persos>> call, Throwable t) {
            }
        });
    }
    }

