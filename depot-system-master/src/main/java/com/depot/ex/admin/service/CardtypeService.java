package com.depot.ex.admin.service;

import java.util.List;

import com.depot.ex.admin.entity.CardType;

/** * 
@author  作者 有丶小帅  
@date 创建时间：2018年7月8日 下午3:03:28 
@version 1.0 
@parameter   
@since  
@return  */
public interface CardtypeService {

	List<CardType> findAllCardType();

	CardType findCardTypeByid(int typeid);

}
