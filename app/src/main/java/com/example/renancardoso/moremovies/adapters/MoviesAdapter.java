package com.example.renancardoso.moremovies.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.renancardoso.moremovies.R;

/**
 * Created by RenanCardoso on 23/08/2017.
 */

public class MoviesAdapter extends RecyclerView.Adapter {

    public class MyViewHolder extends RecyclerView.ViewHolder {

        final TextView movieName;
        final TextView movieRelease;
        final ImageView moviePhote;

        public MyViewHolder(View itemView) {
            super(itemView);

            movieName = (TextView) itemView.findViewById(R.id.tv_movie_name_item);
            movieRelease = (TextView) itemView.findViewById(R.id.tv_movie_release_item);
            moviePhote = (ImageView) itemView.findViewById(R.id.iv_movie_poster_item);
        }
    }

    Context context;

    public MoviesAdapter(Context context) {
        this.context = context;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.movie_item, parent, false);
        MyViewHolder holder = new MyViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 15;
    }


}
