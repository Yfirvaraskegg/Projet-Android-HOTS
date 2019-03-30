package com.example.hots;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface HotsInterface {

    @GET("listedespersonnages")
    Call<List<Persos>> getPersos();
}
