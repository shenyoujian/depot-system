package com.depot.ex.admin.entity;

import java.io.Serializable;

/** * 
@author  ���� ��ؼС˧  
@date ����ʱ�䣺2018��7��8�� ����3:03:26 
@version 1.0 
@parameter   
@since  
@return  */
public class CardType implements Serializable{
	
	private int id;
	
	private String type;
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	

}
