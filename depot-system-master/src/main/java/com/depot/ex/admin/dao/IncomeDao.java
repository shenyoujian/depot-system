package com.depot.ex.admin.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.depot.ex.admin.dto.IncomeData;
import com.depot.ex.admin.entity.CardType;
import com.depot.ex.admin.entity.Income;

/** * 
@author  作者 有丶小帅  
@date 创建时间：2018年7月8日 下午5:27:02
@version 1.0 
@parameter   
@since  
@return  */
public interface IncomeDao extends BaseDao<Income>{

	List<IncomeData> findAllIncome(@Param("page")int page,@Param("size")int size,@Param("content")String content,@Param("startTime")String startTime,@Param("endTime")String endTime,@Param("num")int num);

	Income findById(Integer id);

	int findAllIncomeCount(@Param("content")String content,@Param("startTime")String startTime,@Param("endTime")String endTime,@Param("num")int num);

	void updateCardnum(@Param("cardnum")String cardnum, @Param("cardnumNew")String cardnumNew);

	List<IncomeData> findAllIncome1(@Param("content")String content,@Param("startTime")String startTime,@Param("endTime")String endTime,@Param("num")int num);

}
