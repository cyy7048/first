package com.cyy.mapper;

import com.cyy.pojo.TProvinces;
import com.cyy.pojo.TProvincesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TProvincesMapper {
    long countByExample(TProvincesExample example);

    int deleteByExample(TProvincesExample example);

    int deleteByPrimaryKey(String provinceId);

    int insert(TProvinces record);

    int insertSelective(TProvinces record);

    List<TProvinces> selectByExample(TProvincesExample example);

    TProvinces selectByPrimaryKey(String provinceId);

    int updateByExampleSelective(@Param("record") TProvinces record, @Param("example") TProvincesExample example);

    int updateByExample(@Param("record") TProvinces record, @Param("example") TProvincesExample example);

    int updateByPrimaryKeySelective(TProvinces record);

    int updateByPrimaryKey(TProvinces record);
}