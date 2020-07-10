package cn.beyond.beyond.entity.mapper;

import cn.beyond.beyond.entity.ul.UlGrade;
import cn.beyond.beyond.entity.ul.UlGradeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UlGradeMapper {
    int countByExample(UlGradeExample example);

    int deleteByExample(UlGradeExample example);

    int deleteByPrimaryKey(String id);

    int insert(UlGrade record);

    int insertSelective(UlGrade record);

    List<UlGrade> selectByExample(UlGradeExample example);

    UlGrade selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") UlGrade record, @Param("example") UlGradeExample example);

    int updateByExample(@Param("record") UlGrade record, @Param("example") UlGradeExample example);

    int updateByPrimaryKeySelective(UlGrade record);

    int updateByPrimaryKey(UlGrade record);
}