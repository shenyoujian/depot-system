package com.depot.ex.admin.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.depot.ex.admin.entity.ParkSpace;

/** * 
@author  ���� ��ؼС˧  
@date ����ʱ�䣺2018��7��8�� ����5:27:02
@version 1.0 
@parameter   
@since  
@return  */
public interface ParkspaceDao extends BaseDao<ParkSpace>{
	
	public void save(ParkSpace parkSpace);
	
	public int findMaxSpace();
	
	public List<ParkSpace> findAllParkspace(@Param("page")int page,@Param("size")int size);
	
	public void changeStatus(@Param("id")int id,@Param("status")int status);

	public List<ParkSpace> findParkspaceByTag(@Param("tag")int tag,@Param("page")int page,@Param("size")int size);

	public void changeStatusByParkNum(@Param("parkNum")int parkNum, @Param("status")int status);

	public int findAllParkspaceCount(@Param("tag")int tag);
	

	
}
