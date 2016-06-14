package com.njm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.njm.dao.UserDao;
import com.njm.domain.User;

/**
 * 功能概要：UserService实现类
 * 
 */
@Service
public class UserServiceImpl implements UserService{
	@Autowired
	private UserDao userDao;

	public User selectUserById(Integer userId) {
		return userDao.selectUserById(userId);
		
	}

}
