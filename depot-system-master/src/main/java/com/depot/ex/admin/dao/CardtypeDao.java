package com.depot.ex.admin.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.depot.ex.admin.entity.CardType;

/** * 
@author  作者 有丶小帅  
@date 创建时间：2018年7月8日 下午5:27:03
@version 1.0 
@parameter   
@since  
@return  */
public interface CardtypeDao extends BaseDao<CardType>{

	List<CardType> findAllCardType();

	CardType findCardTypeByid(@Param("typeid")int typeid);
	
}
