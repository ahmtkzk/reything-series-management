package com.reything.seriesmanagement.service.tmdb;

import org.springframework.stereotype.Service;

public interface TmdbTvSeries {

    void getTvSeriesDetails(Integer id);
    void getAllTvSeries();
    void getSimilarTvSeries(Integer page);
    void getLatestTvSeries();

}
