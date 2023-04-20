package com.reything.seriesmanagement.repository;

import com.reything.seriesmanagement.model.entity.TvSeries;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TvSeriesRepository extends CrudRepository<TvSeries, Long> {
}
