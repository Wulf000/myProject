package cn.beyond.beyond.entity.mapper;

import cn.beyond.beyond.entity.ul.UlGradeHistory;
import cn.beyond.beyond.entity.ul.UlGradeHistoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UlGradeHistoryMapper {
    int countByExample(UlGradeHistoryExample example);

    int deleteByExample(UlGradeHistoryExample example);

    int deleteByPrimaryKey(Long id);

    int insert(UlGradeHistory record);

    int insertSelective(UlGradeHistory record);

    List<UlGradeHistory> selectByExample(UlGradeHistoryExample example);

    UlGradeHistory selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") UlGradeHistory record, @Param("example") UlGradeHistoryExample example);

    int updateByExample(@Param("record") UlGradeHistory record, @Param("example") UlGradeHistoryExample example);

    int updateByPrimaryKeySelective(UlGradeHistory record);

    int updateByPrimaryKey(UlGradeHistory record);
}