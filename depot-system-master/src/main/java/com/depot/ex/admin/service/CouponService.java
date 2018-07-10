package com.depot.ex.admin.service;

import java.util.List;

import com.depot.ex.admin.dto.CouponData;
import com.depot.ex.admin.entity.Coupon;

/** * 
@author  ���� ��ؼС˧  
@date ����ʱ�䣺2018��7��8�� ����3:03:28 
@version 1.0 
@parameter   
@since  
@return  */
public interface CouponService {

	List<CouponData> findAllCoupon(int i, int pAGESIZE, String name);

	int findAllDepotcardCount(String name);

	Coupon findCouponById(int id);

	void deleteCoupon(Integer id);

	List<CouponData> findAllCouponByCardNum(String cardnum,String name);

	void updateCardnum(String cardnum, String cardnumNew);

	void addCoupon(Coupon coupon);

}
