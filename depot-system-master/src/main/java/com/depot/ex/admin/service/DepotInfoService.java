package com.depot.ex.admin.service;

import com.depot.ex.admin.dto.ChargeData;
import com.depot.ex.admin.entity.DepotInfo;

/** * 
@author  ���� ��ؼС˧  
@date ����ʱ�䣺2018��7��8�� ����3:03:28 
@version 1.0 
@parameter   
@since  
@return  */
public interface DepotInfoService {

	void update(ChargeData chargeData);

	DepotInfo findById(int i);

}
