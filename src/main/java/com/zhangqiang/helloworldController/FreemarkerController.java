package com.zhangqiang.helloworldController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/freemarker")
public class FreemarkerController {
//http://localhost:8081/freemarker/say/
	@RequestMapping("/say")
	public ModelAndView hello(){
		ModelAndView mav=new ModelAndView();
		mav.addObject("message","我了个槽");
		mav.setViewName("freemarkerTest");
		return mav;
	}
	
	@RequestMapping("/{id}")//http://localhost:8081/freemarker/233
	public void show(@PathVariable("id") Integer id){
		System.out.println("id:"+id);;
	}
	
	@RequestMapping("/query")//http://localhost:8081/freemarker/query?q=234324
	public void query(@RequestParam(value="q",required=false)String q){
		System.out.println("q:"+q);;

	}
	
}
