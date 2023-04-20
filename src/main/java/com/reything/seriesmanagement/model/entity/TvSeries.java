package com.reything.seriesmanagement.model.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tv_series")
public class TvSeries {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long series_id;

    @Column(name = "adult")
    private Boolean adult;

    @Column(name = "serie_name")
    private String name;

    @Column(name = "overview")
    private String overview;

    @Column(name = "number_of_seasons")
    private Integer number_of_seasons;

    @Column(name = "number_of_episodes")
    private Integer number_of_episodes;

    @Column(name = "poster_path")
    private String poster_path;

    @Column(name = "tmdb_id")
    private Long id;

    @Column(name = "status")
    private String status;


}
