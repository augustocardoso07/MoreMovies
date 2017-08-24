package com.example.renancardoso.moremovies.httpManager;


import com.example.renancardoso.moremovies.Config;
import com.example.renancardoso.moremovies.model.MoviesModel;
import com.example.renancardoso.moremovies.model.MoviesResults;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface MoviesAPI {
    @GET(Config.POPULAR + "&api_key=" + Config.API_KEYS)
    Call<MoviesResults> getMovies();
}
