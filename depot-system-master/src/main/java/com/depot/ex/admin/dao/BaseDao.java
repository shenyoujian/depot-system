package com.depot.ex.admin.dao;

import java.io.Serializable;

/** * 
@author  ���� ��ؼС˧  
@date ����ʱ�䣺2018��7��8�� ����5:27:02
@version 1.0 
@parameter   
@since  
@return  */
public interface BaseDao <M extends Serializable>{
	public void save(M m);
}
