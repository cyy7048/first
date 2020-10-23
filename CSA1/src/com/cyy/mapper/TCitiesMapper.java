package com.cyy.mapper;

import com.cyy.pojo.TCities;
import com.cyy.pojo.TCitiesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TCitiesMapper {
    long countByExample(TCitiesExample example);

    int deleteByExample(TCitiesExample example);

    int deleteByPrimaryKey(String cityId);

    int insert(TCities record);

    int insertSelective(TCities record);

    List<TCities> selectByExample(TCitiesExample example);

    TCities selectByPrimaryKey(String cityId);

    int updateByExampleSelective(@Param("record") TCities record, @Param("example") TCitiesExample example);

    int updateByExample(@Param("record") TCities record, @Param("example") TCitiesExample example);

    int updateByPrimaryKeySelective(TCities record);

    int updateByPrimaryKey(TCities record);
}