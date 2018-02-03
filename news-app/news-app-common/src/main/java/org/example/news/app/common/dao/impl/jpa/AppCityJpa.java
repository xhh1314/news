package org.example.news.app.common.dao.impl.jpa;

import org.example.news.app.common.entity.AppCity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AppCityJpa extends JpaRepository<AppCity, Integer> {

    @Query(value = "from AppCity")
    List<AppCity> listCity();
}
