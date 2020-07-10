package cn.beyond.beyond.entity.mapper;

import cn.beyond.beyond.entity.ul.UlRiskLevelConfig;
import cn.beyond.beyond.entity.ul.UlRiskLevelConfigExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UlRiskLevelConfigMapper {
    int countByExample(UlRiskLevelConfigExample example);

    int deleteByExample(UlRiskLevelConfigExample example);

    int deleteByPrimaryKey(String id);

    int insert(UlRiskLevelConfig record);

    int insertSelective(UlRiskLevelConfig record);

    List<UlRiskLevelConfig> selectByExample(UlRiskLevelConfigExample example);

    UlRiskLevelConfig selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") UlRiskLevelConfig record, @Param("example") UlRiskLevelConfigExample example);

    int updateByExample(@Param("record") UlRiskLevelConfig record, @Param("example") UlRiskLevelConfigExample example);

    int updateByPrimaryKeySelective(UlRiskLevelConfig record);

    int updateByPrimaryKey(UlRiskLevelConfig record);
}