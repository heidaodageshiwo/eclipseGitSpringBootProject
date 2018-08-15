package com.zhangqiang.helloworldController;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class helloworldController {
	
	@Value("${HelloWorld}")
	private String helloworld;
	@Value("${mysql.jdbcName}")
	private String jdbcName;
	@Value("${mysql.dbUrl}")
	private String dbUrl;
	@Value("${mysql.userName}")
	private String userName;
	@Value("${mysql.password}")
	private String password;
	
	
	/*http://localhost:8080/helloworld*/
	// @ResponseBody   与  @RestController相同的效果
	@ResponseBody
	@RequestMapping("/helloworld")
	public String say() {
		return helloworld;
	}
    
	@ResponseBody
	@RequestMapping("/showjdbc")
	public String showjdbc() {
		return "mysql.jdbcName:" + jdbcName + "<br/>" +
				"mysql.dbUrl:" + dbUrl + "<br/>" +
				"mysql.userName:" + userName+ "<br/>" + 
				"mysql.password:" + password + "<br/>";
	}
    
}
