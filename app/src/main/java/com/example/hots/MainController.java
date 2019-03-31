package com.example.hots;

import android.content.Context;
import android.widget.TextView;

import com.example.hots.HotsInterface;
import com.example.hots.MainActivity;
import com.example.hots.Persos;

import org.w3c.dom.Text;

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

    }
}

