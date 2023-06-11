package com.reything.seriesmanagement.service.tmdb.impl;

import com.reything.seriesmanagement.model.dto.TvSeriesTopRated;
import com.reything.seriesmanagement.service.tmdb.TmdbTvSeries;
import com.reything.seriesmanagement.util.RestUtil;

public class TmdbTvSeriesImpl implements TmdbTvSeries {

    private static String TOP_RATED_URL = "https://api.themoviedb.org/3/tv/top_rated?language=tr-TR&page=1&api_key=f121c3aff0efc3d4fd2b9d3edc8e221a";

    @Override
    public void getTvSeriesDetails(Integer id) {

    }

    @Override
    public void getAllTvSeries() {

    }

    @Override
    public void getSimilarTvSeries(Integer page) {

    }

    @Override
    public void getLatestTvSeries() {

    }

    @Override
    public void getTopRatedTvSeries() {
        TvSeriesTopRated tvSeriesTopRated = RestUtil.getCall(TOP_RATED_URL, TvSeriesTopRated.class);
    }

}
