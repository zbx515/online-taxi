package com.bx.zuul.dao;

import com.bx.zuul.entity.ServicePassengerUserInfo;
import com.bx.zuul.entity.ServicePassengerUserInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ServicePassengerUserInfoDao {
    long countByExample(ServicePassengerUserInfoExample example);

    int deleteByExample(ServicePassengerUserInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ServicePassengerUserInfo record);

    int insertSelective(ServicePassengerUserInfo record);

    List<ServicePassengerUserInfo> selectByExample(ServicePassengerUserInfoExample example);

    ServicePassengerUserInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ServicePassengerUserInfo record, @Param("example") ServicePassengerUserInfoExample example);

    int updateByExample(@Param("record") ServicePassengerUserInfo record, @Param("example") ServicePassengerUserInfoExample example);

    int updateByPrimaryKeySelective(ServicePassengerUserInfo record);

    int updateByPrimaryKey(ServicePassengerUserInfo record);
}