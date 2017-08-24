package com.example.renancardoso.moremovies;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.renancardoso.moremovies.model.MoviesModel;
import com.squareup.picasso.Picasso;

import org.w3c.dom.Text;

public class DescriptionMovieActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_description_movie);

        MoviesModel movie = (MoviesModel) getIntent().getSerializableExtra("movie");

        ImageView movieBackdrop = (ImageView) findViewById(R.id.iv_movie_poster_description);
        TextView title = (TextView) findViewById(R.id.tv_movie_title_description);
        TextView release = (TextView) findViewById(R.id.tv_movie_release_description);
        TextView voteAverage = (TextView) findViewById(R.id.tv_movie_vote_average_description);
        TextView voteCount = (TextView) findViewById(R.id.tv_movie_vote_count_description);
        TextView overview = (TextView) findViewById(R.id.tv_movie_overview_description);


        Picasso.with(this).load(movie.getBackdropPath()).into(movieBackdrop);
        title.setText(movie.getTitle());
        release.setText(movie.getReleaseDate());
        voteAverage.setText(movie.getVoteAverage());
        voteCount.setText(movie.getVoteCount());
        overview.setText(movie.getOverview());
    }
}
