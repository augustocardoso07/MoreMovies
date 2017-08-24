package com.example.renancardoso.moremovies.controllers;


import com.example.renancardoso.moremovies.Config;
import com.example.renancardoso.moremovies.httpManager.MoviesAPI;
import com.example.renancardoso.moremovies.model.MoviesModel;
import com.example.renancardoso.moremovies.model.MoviesResults;

import java.util.List;
import java.util.Observable;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MoviesControllers extends Observable implements Callback<MoviesResults>{

    MoviesResults moviesResults;
    MoviesAPI moviesAPI;

    @Override
    public void onResponse(Call<MoviesResults> call, Response<MoviesResults> response) {
        if (response.isSuccessful()) {
            moviesResults = response.body();
            setChanged();
            notifyObservers();
            //List<MoviesModel> movies = moviesResults.getResults();
        }
    }

    public List<MoviesModel> getMoviesList(){
        return moviesResults.getResults();
    }

    @Override
    public void onFailure(Call<MoviesResults> call, Throwable t) {

    }

    public void start() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(Config.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();


        moviesAPI = retrofit.create(MoviesAPI.class);

        Call<MoviesResults> moviesReturn = moviesAPI.getMovies();

        moviesReturn.enqueue(this);
    }
}
