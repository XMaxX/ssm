package org.ssm.dufy.service;

import org.ssm.dufy.entity.CityLocation;
import org.ssm.dufy.entity.User;

import java.util.List;

public interface IUserService {

	User getUserById(int id);

	List<CityLocation> getExcelData();
}

