package com.depot.ex.admin.entity;

import java.io.Serializable;

/** * 
@author  作者 有丶小帅  
@date 创建时间：2018年7月8日 下午3:03:28
@version 1.0 
@parameter   
@since  
@return  */
public class ParkSpace implements Serializable{
	private Integer id;
	private int parkid;
	private int status;
	private int tag;
	public int getTag() {
		return tag;
	}
	public void setTag(int tag) {
		this.tag = tag;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public int getParkid() {
		return parkid;
	}
	public void setParkid(int parkid) {
		this.parkid = parkid;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	
}
