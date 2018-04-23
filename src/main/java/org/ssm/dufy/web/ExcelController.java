package org.ssm.dufy.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.ssm.dufy.entity.CityLocation;
import org.ssm.dufy.service.IUserService;
import org.ssm.dufy.util.ExportExcelUtil;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.LinkedHashMap;
import java.util.List;

@Controller
public class ExcelController {

	@Autowired
	private IUserService userService;



	@RequestMapping(value = "/exportExcel", method ={RequestMethod.POST,RequestMethod.GET})
	public void ExportBankCheckInfo(HttpServletRequest request, HttpServletResponse response) {
		Integer uid = 1;
		//得到所要导出的数据
		List<CityLocation> errLst = userService.getExcelData();

		//定义导出excel的名字
		String excelName = "世界主要城市经纬度";
		// 获取需要转出的excle表头的map字段
		LinkedHashMap<String, String> fieldMap = new LinkedHashMap<String, String>();

		fieldMap.put("id", "ID");
		fieldMap.put("city", "城市");
		fieldMap.put("cnty", "国家");
		fieldMap.put("lat", "纬度");
		fieldMap.put("lon", "经度");
		fieldMap.put("prov", "省份");

		//导出银行提现对账记录
		ExportExcelUtil.export(excelName, errLst, fieldMap, response);
	}
}
