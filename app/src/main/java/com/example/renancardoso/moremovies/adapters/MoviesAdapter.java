package com.example.renancardoso.moremovies.adapters;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.renancardoso.moremovies.Config;
import com.example.renancardoso.moremovies.DescriptionMovieActivity;
import com.example.renancardoso.moremovies.R;
import com.example.renancardoso.moremovies.model.MoviesModel;
import com.squareup.picasso.Picasso;

import java.util.List;


public class MoviesAdapter extends RecyclerView.Adapter<MoviesAdapter.MyViewHolder> {

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.movie_item, parent, false);
        MyViewHolder holder = new MyViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        holder.movieName.setText(moviesList.get(position).getTitle());
        holder.movieRelease.setText(moviesList.get(position).getReleaseDate());
        String posterURL = Config.BASE_IMAGE_URL_POSTER + moviesList.get(position).getPosterPath();
        Picasso.with(context).load(posterURL).into(holder.moviePhoto);

        holder.movieLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                context.startActivity(new Intent(context, DescriptionMovieActivity.class));
            }
        });


    }

    @Override
    public int getItemCount() {
        return moviesList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        final TextView movieName;
        final TextView movieRelease;
        final ImageView moviePhoto;
        final LinearLayout movieLayout;

        public MyViewHolder(View itemView) {
            super(itemView);

            movieName = (TextView) itemView.findViewById(R.id.tv_movie_name_item);
            movieRelease = (TextView) itemView.findViewById(R.id.tv_movie_release_item);
            moviePhoto = (ImageView) itemView.findViewById(R.id.iv_movie_poster_item);
            movieLayout = (LinearLayout) itemView.findViewById(R.id.ll_movie_item);
        }
    }

    Context context;
    List<MoviesModel> moviesList;

    public MoviesAdapter(Context context, List<MoviesModel> moviesList) {
        this.context = context;
        this.moviesList = moviesList;
    }

//    @Override
//    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
//        View view = LayoutInflater.from(context).inflate(R.layout.movie_item, parent, false);
//        MyViewHolder holder = new MyViewHolder(view);
//        return holder;
//    }
//
//    @Override
//    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
//        MyViewHolder myHolder = (MyViewHolder) holder;
//        Picasso.with(context).load("https://i.imgur.com/tGbaZCY.jpg").into(myHolder.moviePhoto);
//        //Picasso.with(context).load(R.drawable.dog).into(myHolder.moviePhoto);
//    }
//
//    @Override
//    public int getItemCount() {
//        return 15;
//    }


}
