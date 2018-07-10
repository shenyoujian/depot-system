package com.depot.ex.admin.dao;

import com.depot.ex.admin.dto.ChargeData;
import com.depot.ex.admin.entity.DepotInfo;

/** * 
@author  作者 有丶小帅  
@date 创建时间：2018年7月8日 下午5:30:14
@version 1.0 
@parameter   
@since  
@return  */
public interface DepotInfoDao extends BaseDao<DepotInfo>{
	public void update(ChargeData chargeData);
	public DepotInfo findById(int id);
}
