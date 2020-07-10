package cn.beyond.beyond.entity.mapper;

import cn.beyond.beyond.entity.ul.UlSourceDataHistory;
import cn.beyond.beyond.entity.ul.UlSourceDataHistoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UlSourceDataHistoryMapper {
    int countByExample(UlSourceDataHistoryExample example);

    int deleteByExample(UlSourceDataHistoryExample example);

    int deleteByPrimaryKey(String id);

    int insert(UlSourceDataHistory record);

    int insertSelective(UlSourceDataHistory record);

    List<UlSourceDataHistory> selectByExample(UlSourceDataHistoryExample example);

    UlSourceDataHistory selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") UlSourceDataHistory record, @Param("example") UlSourceDataHistoryExample example);

    int updateByExample(@Param("record") UlSourceDataHistory record, @Param("example") UlSourceDataHistoryExample example);

    int updateByPrimaryKeySelective(UlSourceDataHistory record);

    int updateByPrimaryKey(UlSourceDataHistory record);
}