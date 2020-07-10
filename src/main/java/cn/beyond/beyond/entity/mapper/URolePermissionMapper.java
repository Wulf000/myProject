package cn.beyond.beyond.entity.mapper;

import cn.beyond.beyond.entity.ul.URolePermission;
import cn.beyond.beyond.entity.ul.URolePermissionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface URolePermissionMapper {
    int countByExample(URolePermissionExample example);

    int deleteByExample(URolePermissionExample example);

    int insert(URolePermission record);

    int insertSelective(URolePermission record);

    List<URolePermission> selectByExample(URolePermissionExample example);

    int updateByExampleSelective(@Param("record") URolePermission record, @Param("example") URolePermissionExample example);

    int updateByExample(@Param("record") URolePermission record, @Param("example") URolePermissionExample example);
}