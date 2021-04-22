package com.bx.servicecorder.dao;

import com.bx.servicecorder.entity.OrderEvent;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface OrderEventDao {
    int deleteByPrimaryKey(Integer id);

    int insert(OrderEvent record);

    int insertSelective(OrderEvent record);

    OrderEvent selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(OrderEvent record);

    int updateByPrimaryKey(OrderEvent record);

    List<OrderEvent> selectByOrderType(Integer ordertype);

    int updateById(Integer id);


}