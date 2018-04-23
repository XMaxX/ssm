package org.ssm.dufy.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.ssm.dufy.dao.ICityLocationDao;
import org.ssm.dufy.dao.IUserDao;
import org.ssm.dufy.entity.CityLocation;
import org.ssm.dufy.entity.User;
import org.ssm.dufy.service.IUserService;

import java.util.List;

@Service("userService")
public class IUserServiceImpl  implements IUserService{

	@Autowired
	public IUserDao udao;

	@Autowired
	public ICityLocationDao cldao;
	
	@Override
	public User getUserById(int id) {
		/*测试分支合并*/
		return udao.selectByPrimaryKey(id);
	}


	/**
	 * 导出excel
	 */
	@Override
	public List<CityLocation> getExcelData() {
		return cldao.getExcelData();
	}
}
