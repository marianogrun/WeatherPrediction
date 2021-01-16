package com.weather.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.weather.entities.Weather;

import java.util.List;

@Repository
public interface WeatherRepository extends PagingAndSortingRepository<Weather, Long> {

    public List<Weather> findByDay(Integer day);

    public List<Weather> findByType(String type);

//    @Query(value = "select * from weather where day_number= dayNumber", nativeQuery = true)
//    public List<Weather> findWeatherByDayNumber(@Param("day_Number") Integer dayNumber);
}
