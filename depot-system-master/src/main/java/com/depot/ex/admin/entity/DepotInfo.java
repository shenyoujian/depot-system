package com.depot.ex.admin.entity;

import java.io.Serializable;

/** * 
@author  ���� ��ؼС˧  
@date ����ʱ�䣺2018��7��8�� ����3:03:27 
@version 1.0 
@parameter   
@since  
@return  */
public class DepotInfo implements Serializable{
	private Integer hourmoney;
	private Integer monthcard;
	private Integer yearcard;
	private Integer illegal;
	public Integer getHourmoney() {
		return hourmoney;
	}
	public void setHourmoney(Integer hourmoney) {
		this.hourmoney = hourmoney;
	}
	public Integer getMonthcard() {
		return monthcard;
	}
	public void setMonthcard(Integer monthcard) {
		this.monthcard = monthcard;
	}
	public Integer getYearcard() {
		return yearcard;
	}
	public void setYearcard(Integer yearcard) {
		this.yearcard = yearcard;
	}
	public Integer getIllegal() {
		return illegal;
	}
	public void setIllegal(Integer illegal) {
		this.illegal = illegal;
	}
}
