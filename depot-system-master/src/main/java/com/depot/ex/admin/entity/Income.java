package com.depot.ex.admin.entity;

import java.io.Serializable;
import java.util.Date;

/** * 
@author  ���� ��ؼС˧  
@date ����ʱ�䣺2018��7��8�� ����3:03:27
@version 1.0 
@parameter   
@since  
@return  */
public class Income implements Serializable{
	private int id;
	//
	private double money;
	//֧����ʽ
	private int  method;
	//������
	private int type;
	//����
	private String carnum;
	private String cardnum;
	private int isillegal;
	private int source=1;
	private Date time;
	private long duration;
	
	public long getDuration() {
		return duration;
	}
	public void setDuration(long duration) {
		this.duration = duration;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getMoney() {
		return money;
	}
	public void setMoney(double money) {
		this.money = money;
	}
	public int getMethod() {
		return method;
	}
	public void setMethod(int method) {
		this.method = method;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public String getCarnum() {
		return carnum;
	}
	public void setCarnum(String carnum) {
		this.carnum = carnum;
	}
	public String getCardnum() {
		return cardnum;
	}
	public void setCardnum(String cardnum) {
		this.cardnum = cardnum;
	}
	public int getIsillegal() {
		return isillegal;
	}
	public void setIsillegal(int isillegal) {
		this.isillegal = isillegal;
	}
	public int getSource() {
		return source;
	}
	public void setSource(int source) {
		this.source = source;
	}
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}
	
}
