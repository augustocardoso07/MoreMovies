package com.example.renancardoso.moremovies.model;


import com.example.renancardoso.moremovies.Config;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class MoviesModel implements Serializable{

    @SerializedName("vote_count")
    private String voteCount;

    @SerializedName("vote_average")
    private String voteAverage;

    @SerializedName("title")
    private String title;

    @SerializedName("poster_path")
    private String posterPath;

    @SerializedName("backdrop_path")
    private String backdropPath;

    @SerializedName("release_date")
    private String releaseDate;

    @SerializedName("overview")
    private String overview;

    public MoviesModel(String title, String release, String description, String urlPoster) {
        this.title = title;
        this.releaseDate = release;
        this.overview = description;
        this.posterPath = urlPoster;
    }

    public String getVoteCount() {
        return voteCount;
    }

    public String getVoteAverage() {
        return voteAverage;
    }

    public String getTitle() {
        return title;
    }

    public String getPosterPath() {
        return Config.BASE_IMAGE_URL_POSTER + posterPath;
    }

    public String getBackdropPath() {
        return Config.BASE_IMAGE_URL_BACKDROP + backdropPath;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public String getOverview() {
        return overview;
    }

    public void setVoteCount(String voteCount) {
        this.voteCount = voteCount;
    }

    public void setVoteAverage(String voteAverage) {
        this.voteAverage = voteAverage;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPosterPath(String posterPath) {
        this.posterPath = posterPath;
    }

    public void setBackdropPath(String backdropPath) {
        this.backdropPath = backdropPath;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public void setOverview(String overview) {
        this.overview = overview;
    }
}
