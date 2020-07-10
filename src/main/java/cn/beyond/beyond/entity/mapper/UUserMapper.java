package cn.beyond.beyond.entity.mapper;

import cn.beyond.beyond.entity.ul.UUser;
import cn.beyond.beyond.entity.ul.UUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UUserMapper {
    int countByExample(UUserExample example);

    int deleteByExample(UUserExample example);

    int deleteByPrimaryKey(Long id);

    int insert(UUser record);

    int insertSelective(UUser record);

    List<UUser> selectByExample(UUserExample example);

    UUser selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") UUser record, @Param("example") UUserExample example);

    int updateByExample(@Param("record") UUser record, @Param("example") UUserExample example);

    int updateByPrimaryKeySelective(UUser record);

    int updateByPrimaryKey(UUser record);
}