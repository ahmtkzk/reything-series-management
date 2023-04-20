package com.reything.seriesmanagement.model.dto;

import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

@Data
public class TvSeriesDTO implements Serializable {

    @Serial
    private static final long serialVersionUID = 8262600191257907255L;

    private Boolean adult;
    private String name;
    private String overview;
    private Integer number_of_seasons;
    private Integer number_of_episodes;
    private String poster_path;
    private Long id;
    private String status;

}
