package com.cyy.mapper;

import com.cyy.pojo.TAreas;
import com.cyy.pojo.TAreasExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TAreasMapper {
    long countByExample(TAreasExample example);

    int deleteByExample(TAreasExample example);

    int deleteByPrimaryKey(String areaId);

    int insert(TAreas record);

    int insertSelective(TAreas record);

    List<TAreas> selectByExample(TAreasExample example);

    TAreas selectByPrimaryKey(String areaId);

    int updateByExampleSelective(@Param("record") TAreas record, @Param("example") TAreasExample example);

    int updateByExample(@Param("record") TAreas record, @Param("example") TAreasExample example);

    int updateByPrimaryKeySelective(TAreas record);

    int updateByPrimaryKey(TAreas record);
}