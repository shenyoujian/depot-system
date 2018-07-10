package com.depot.ex.admin.service;

import java.util.List;

import com.depot.ex.admin.entity.ParkSpace;

/** * 
@author  作者 有丶小帅  
@date 创建时间：2018年7月8日 下午3:03:28 
@version 1.0 
@parameter   
@since  
@return  */
public interface ParkspaceService {
	public void addParkspace(int count);
	
	public List<ParkSpace> findAllParkspace(int page,int size);
	public void changeStatus(int id,int status);
	public void changeStatusByParkNum(int parkNum, int status);
	public List<ParkSpace> findParkspaceByTag(int tag,int page,int size);

	public int findAllParkspaceCount(int tag);
}
