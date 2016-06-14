package com.njm.service;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.njm.baseTest.SpringTestCase;
import com.njm.domain.User;

/**
 * 功能概要：UserService单元测试
 * 
 * @author linbingwen
 * @since  2015年9月28日 
 */
public class UserServiceTest extends SpringTestCase	{
	@Autowired
	private UserService userService;
	Logger logger = Logger.getLogger(UserServiceTest.class);
	
	@Test
	public void selectUserByIdTest(){
		User user = userService.selectUserById(1);
		System.out.println("[User email =] "+ user.getUserEmail());
        logger.debug("查找结果" + user);
	}
	

}
