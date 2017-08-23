package com.example.renancardoso.moremovies;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.renancardoso.moremovies.adapters.MoviesAdapter;

public class MainActivity extends AppCompatActivity {

    RecyclerView movies;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        movies = (RecyclerView) findViewById(R.id.rv_movies);

        movies.setLayoutManager(new GridLayoutManager(this, 2));

        movies.setAdapter(new MoviesAdapter(this));
    }
}
