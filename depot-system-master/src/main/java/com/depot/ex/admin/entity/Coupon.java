package com.depot.ex.admin.entity;

import java.io.Serializable;
import java.util.Date;

/** * 
@author  作者 有丶小帅  
@date 创建时间：2018年7月8日 下午3:03:26 
@version 1.0 
@parameter   
@since  
@return  */
public class Coupon implements Serializable{
	private int id;
	private String couponNum;
	private int money;
	private Date time;
	private String cardnum;
	public String getCouponNum() {
		return couponNum;
	}
	public void setCouponNum(String couponNum) {
		this.couponNum = couponNum;
	}
	public String getCardnum() {
		return cardnum;
	}
	public void setCardnum(String cardnum) {
		this.cardnum = cardnum;
	}
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	
}
