package org.example.news.app.common.dao.impl;

import org.example.news.app.common.dao.AppCityDao;
import org.example.news.app.common.dao.impl.jpa.AppCityJpa;
import org.example.news.app.common.entity.AppCity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class AppCityDaoImpl implements AppCityDao {
    @Autowired
    private AppCityJpa appCityJpa;

    @Override
    public List<AppCity> listCity() {
        return appCityJpa.listCity();
    }
}
