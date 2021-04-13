package com.bx.zuul.dao;

import com.bx.zuul.entity.Usermodel;
import com.bx.zuul.entity.UsermodelExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UsermodelDao {
    long countByExample(UsermodelExample example);

    int deleteByExample(UsermodelExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Usermodel record);

    int insertSelective(Usermodel record);

    List<Usermodel> selectByExample(UsermodelExample example);

    Usermodel selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Usermodel record, @Param("example") UsermodelExample example);

    int updateByExample(@Param("record") Usermodel record, @Param("example") UsermodelExample example);

    int updateByPrimaryKeySelective(Usermodel record);

    int updateByPrimaryKey(Usermodel record);
}