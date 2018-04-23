package org.ssm.dufy.dao;

import org.springframework.stereotype.Repository;
import org.ssm.dufy.entity.CityLocation;

import java.util.List;

@Repository
public interface ICityLocationDao {

    List<CityLocation> getExcelData();
}