package com.depot.ex.admin.service;

import java.util.List;

import com.depot.ex.admin.entity.CardType;

/** * 
@author  ���� ��ؼС˧  
@date ����ʱ�䣺2018��7��8�� ����3:03:28 
@version 1.0 
@parameter   
@since  
@return  */
public interface CardtypeService {

	List<CardType> findAllCardType();

	CardType findCardTypeByid(int typeid);

}
