package com.depot.ex.admin.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.depot.ex.admin.entity.User;

/** * 
@author  ���� ��ؼС˧  
@date ����ʱ�䣺2018��7��8�� ����3:03:28 
@version 1.0 
@parameter   
@since  
@return  */
public interface UserService {
	
	public User findUserByUsername(String username);

	public void saveByaddDepotCard(String username,String name, int cardid);

	public User findUserByCardid(int cardid);

	public List<User> findAllUser(int page,int size);

	public void deleteUserByCardid(int cardid);

	public void save(User user);

	public List<User> findUsersByRole(int tag,int page,int size);
	
	public List<User> findUsersByRoleMan(int tag,int page,int size);

	public User findUserById(int uid);

	public void update(User user);

	public void delUserById(int intValue);

	public int findAllUserCount(int role);

	public int findAllUserCountMan(int role);

	public List<User> finAllUserByRole(int i);


	
}
