package com.ruan.productionservice.mapper;

import com.ruan.productionservice.model.Production;
import org.apache.ibatis.annotations.Mapper;

import java.util.ArrayList;

@Mapper
public interface ProductionMapper {
    int deleteByPrimaryKey(String uuid);

    int insert(Production record);

    int insertSelective(Production record);

    Production selectByPrimaryKey(String uuid);

    int updateByPrimaryKeySelective(Production record);

    int updateByPrimaryKey(Production record);

    ArrayList<Production> selectAll();
}