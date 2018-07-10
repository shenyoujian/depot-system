package com.depot.ex.admin.dao;

import java.io.Serializable;

/** * 
@author  作者 有丶小帅  
@date 创建时间：2018年7月8日 下午5:27:02
@version 1.0 
@parameter   
@since  
@return  */
public interface BaseDao <M extends Serializable>{
	public void save(M m);
}
