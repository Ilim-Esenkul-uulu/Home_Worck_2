package com.example.home_worck_2.data.remote;

import com.example.home_worck_2.data.model.Film;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface GhibliApi {
    @GET("films/")
    Call<List<Film>> getAllFilm();

    @GET("films/{id}")
    Call<Film> getFilms(@Path("id") String id);
}


