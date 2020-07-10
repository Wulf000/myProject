package cn.beyond.beyond.entity.mapper;

import cn.beyond.beyond.entity.ul.UlSourceData;
import cn.beyond.beyond.entity.ul.UlSourceDataExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UlSourceDataMapper {
    int countByExample(UlSourceDataExample example);

    int deleteByExample(UlSourceDataExample example);

    int deleteByPrimaryKey(String id);

    int insert(UlSourceData record);

    int insertSelective(UlSourceData record);

    List<UlSourceData> selectByExample(UlSourceDataExample example);

    UlSourceData selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") UlSourceData record, @Param("example") UlSourceDataExample example);

    int updateByExample(@Param("record") UlSourceData record, @Param("example") UlSourceDataExample example);

    int updateByPrimaryKeySelective(UlSourceData record);

    int updateByPrimaryKey(UlSourceData record);
}