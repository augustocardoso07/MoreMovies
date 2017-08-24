package com.example.renancardoso.moremovies.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by campuscode06 on 8/23/17.
 */

public class MoviesResults {
    @SerializedName("page")
    String page;

    @SerializedName("total_results")
    String totalResults;

    @SerializedName("total_pages")
    String totalPages;

    @SerializedName("results")
    List<MoviesModel> results;

    public String getPage() {
        return page;
    }

    public String getTotalResults() {
        return totalResults;
    }

    public String getTotalPages() {
        return totalPages;
    }

    public List<MoviesModel> getResults() {
        return results;
    }

    public void setPage(String page) {
        this.page = page;
    }

    public void setTotalResults(String totalResults) {
        this.totalResults = totalResults;
    }

    public void setTotalPages(String totalPages) {
        this.totalPages = totalPages;
    }

    public void setResults(List<MoviesModel> results) {
        this.results = results;
    }
}
