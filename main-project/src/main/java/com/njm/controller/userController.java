package com.njm.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.njm.domain.User;
import com.njm.service.UserService;

import demo.service.DemoService;
  

@Controller  
public class userController {  
      
	@Autowired
	private UserService userService;
	Logger logger = Logger.getLogger(userController.class);
	
	@Autowired
    private DemoService helloService;
 
      
    @RequestMapping(value="/",produces="text/html;charset=UTF-8" )   
    @ResponseBody  
    private String selectUserByIdTest(){  
    	User user = userService.selectUserById(1);
		System.out.println("[User email =] "+ user.getUserEmail());
        return user.getUserEmail();  
    }  
    
    @RequestMapping(value="/hello",produces="text/html;charset=UTF-8" )   
    @ResponseBody  
    private String hello(){  
        return "hello MVC";  
    } 
    
    @RequestMapping(value="/dubbo",produces="text/html;charset=UTF-8" )   
    @ResponseBody  
    private String dubbo(){  
        return helloService.sayHello();  
    } 
    
    
}  