package com.example.renancardoso.moremovies;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.renancardoso.moremovies.adapters.MoviesAdapter;
import com.example.renancardoso.moremovies.controllers.MoviesControllers;
import com.example.renancardoso.moremovies.model.MoviesModel;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

public class MainActivity extends AppCompatActivity implements Observer{

    RecyclerView movies;
    List<MoviesModel> moviesList;
    MoviesControllers controller;
    MoviesAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        controller = new MoviesControllers();
        controller.addObserver(this);
        controller.start();

        movies = (RecyclerView) findViewById(R.id.rv_movies);

        //List<MoviesModel> moviesList = generateMoviesList();

        movies.setLayoutManager(new GridLayoutManager(this, 2));

        //movies.setAdapter(new MoviesAdapter(this, moviesList));
    }

    private List<MoviesModel> generateMoviesList() {
        List<MoviesModel> list = new ArrayList<>();
        list.add(new MoviesModel("Filme 1", "10/10/2012","blabalbla", "http://"));
        list.add(new MoviesModel("Filme 2", "10/10/2012","blabalbla", "http://"));
        list.add(new MoviesModel("Filme 3", "10/10/2012","blabalbla", "http://"));
        list.add(new MoviesModel("Filme 4", "10/10/2012","blabalbla", "http://"));
        list.add(new MoviesModel("Filme 5", "10/10/2012","blabalbla", "http://"));
        list.add(new MoviesModel("Filme 6", "10/10/2012","blabalbla", "http://"));
        return list;
    }

    @Override
    public void update(Observable observable, Object o) {
        moviesList = controller.getMoviesList();
        movies.setAdapter(new MoviesAdapter(this, moviesList));
    }
}
