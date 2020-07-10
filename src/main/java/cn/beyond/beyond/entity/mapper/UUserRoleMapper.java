package cn.beyond.beyond.entity.mapper;

import cn.beyond.beyond.entity.ul.UUserRole;
import cn.beyond.beyond.entity.ul.UUserRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UUserRoleMapper {
    int countByExample(UUserRoleExample example);

    int deleteByExample(UUserRoleExample example);

    int insert(UUserRole record);

    int insertSelective(UUserRole record);

    List<UUserRole> selectByExample(UUserRoleExample example);

    int updateByExampleSelective(@Param("record") UUserRole record, @Param("example") UUserRoleExample example);

    int updateByExample(@Param("record") UUserRole record, @Param("example") UUserRoleExample example);
}