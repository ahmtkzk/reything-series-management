package com.reything.seriesmanagement.model.dto;

import lombok.Data;

import java.util.List;

@Data
public class TvSeriesTopRated {

    private List<TvSeriesDTO> results;
    private int page;
    private int total_pages;
    private int total_results;

}
