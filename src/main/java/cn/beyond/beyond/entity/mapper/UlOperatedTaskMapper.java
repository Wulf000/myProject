package cn.beyond.beyond.entity.mapper;

import cn.beyond.beyond.entity.ul.UlOperatedTask;
import cn.beyond.beyond.entity.ul.UlOperatedTaskExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UlOperatedTaskMapper {
    int countByExample(UlOperatedTaskExample example);

    int deleteByExample(UlOperatedTaskExample example);

    int deleteByPrimaryKey(String id);

    int insert(UlOperatedTask record);

    int insertSelective(UlOperatedTask record);

    List<UlOperatedTask> selectByExample(UlOperatedTaskExample example);

    UlOperatedTask selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") UlOperatedTask record, @Param("example") UlOperatedTaskExample example);

    int updateByExample(@Param("record") UlOperatedTask record, @Param("example") UlOperatedTaskExample example);

    int updateByPrimaryKeySelective(UlOperatedTask record);

    int updateByPrimaryKey(UlOperatedTask record);
}