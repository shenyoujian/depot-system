package com.depot.ex.admin.dao;

import org.apache.ibatis.annotations.Param;

import com.depot.ex.admin.dto.FormData;
import com.depot.ex.admin.entity.ParkInfo;

/** * 
@author  ���� ��ؼС˧  
@date ����ʱ�䣺2018��7��8�� ����5:27:02
@version 1.0 
@parameter   
@since  
@return  */
public interface ParkinfoDao extends BaseDao<ParkInfo>{
	//���ͣ��λ��Ϣ
	public void save(ParkInfo parkInfo);
	public ParkInfo findParkinfoByParknum(@Param("parknum")int parknum);
	public void deleteParkinfoByParkNum(@Param("parknum")int parknum);
	public ParkInfo findParkinfoByCardnum(@Param("cardnum")String cardnum);
	public void updateCardnum(@Param("cardnum")String cardnum, @Param("cardnumNew")String cardnumNew);
}
