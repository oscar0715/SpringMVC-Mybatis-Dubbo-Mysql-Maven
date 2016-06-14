package com.njm.dao;

import com.njm.domain.User;

/**
 * 功能概要：User的DAO类
 * 
 */
public interface UserDao {
	/**
	 * 
	 * @param userId
	 * @return
	 */
	public User selectUserById(Integer userId);

}
