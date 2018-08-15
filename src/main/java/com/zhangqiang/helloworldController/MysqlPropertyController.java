package com.zhangqiang.helloworldController;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MysqlPropertyController {

//	http://localhost:8081/mysqlProperty
	@Resource
	private MysqlProperty mysqlProperty;
	
	@RequestMapping("/mysqlProperty")	
	public String hello(){
		return "mysql.jdbcName:" + mysqlProperty.getJdbcName()+ "<br/>" +
				"mysql.dbUrl:" + mysqlProperty.getDbUrl() + "<br/>" +
				"mysql.userName:" + mysqlProperty.getUserName()+ "<br/>" + 
				"mysql.password:" + mysqlProperty.getPassword() + "<br/>";
	}
}
