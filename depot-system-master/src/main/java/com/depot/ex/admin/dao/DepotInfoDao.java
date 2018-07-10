package com.depot.ex.admin.dao;

import com.depot.ex.admin.dto.ChargeData;
import com.depot.ex.admin.entity.DepotInfo;

/** * 
@author  ���� ��ؼС˧  
@date ����ʱ�䣺2018��7��8�� ����5:30:14
@version 1.0 
@parameter   
@since  
@return  */
public interface DepotInfoDao extends BaseDao<DepotInfo>{
	public void update(ChargeData chargeData);
	public DepotInfo findById(int id);
}
