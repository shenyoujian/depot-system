package com.depot.ex.admin.service;

import java.util.List;

import com.depot.ex.admin.dto.FormData;
import com.depot.ex.admin.entity.ParkInfo;
import com.depot.ex.admin.entity.ParkSpace;

/** * 
@author  ���� ��ؼС˧  
@date ����ʱ�䣺2018��7��8�� ����3:03:28 
@version 1.0 
@parameter   
@since  
@return  */
public interface ParkinfoService {
	public void saveParkinfo(FormData data);
	public ParkInfo findParkinfoByParknum(int parknum);
	public void deleteParkinfoByParkNum(int parkNum);
	public ParkInfo findParkinfoByCardnum(String cardnum);
	public void updateCardnum(String cardnum, String cardnumNew);
}
