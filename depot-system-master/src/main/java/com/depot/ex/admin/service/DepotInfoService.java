package com.depot.ex.admin.service;

import com.depot.ex.admin.dto.ChargeData;
import com.depot.ex.admin.entity.DepotInfo;

/** * 
@author  作者 有丶小帅  
@date 创建时间：2018年7月8日 下午3:03:28 
@version 1.0 
@parameter   
@since  
@return  */
public interface DepotInfoService {

	void update(ChargeData chargeData);

	DepotInfo findById(int i);

}
