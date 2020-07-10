package cn.beyond.beyond.entity.mapper;

import cn.beyond.beyond.entity.ul.UlCheckTask;
import cn.beyond.beyond.entity.ul.UlCheckTaskExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UlCheckTaskMapper {
    int countByExample(UlCheckTaskExample example);

    int deleteByExample(UlCheckTaskExample example);

    int deleteByPrimaryKey(String id);

    int insert(UlCheckTask record);

    int insertSelective(UlCheckTask record);

    List<UlCheckTask> selectByExample(UlCheckTaskExample example);

    UlCheckTask selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") UlCheckTask record, @Param("example") UlCheckTaskExample example);

    int updateByExample(@Param("record") UlCheckTask record, @Param("example") UlCheckTaskExample example);

    int updateByPrimaryKeySelective(UlCheckTask record);

    int updateByPrimaryKey(UlCheckTask record);
}