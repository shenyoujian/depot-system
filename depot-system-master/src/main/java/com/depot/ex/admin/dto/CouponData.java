package com.depot.ex.admin.dto;

import java.util.Date;

/** * 
@author  作者 有丶小帅  
@date 创建时间：2018年7月8日 下午5:27:02
@version 1.0 
@parameter   
@since  
@return  */
public class CouponData {
	private int id;
	private String couponNum;
	private int money;
	private String time;
	private String cardnum;
	private int count;
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
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
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
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
