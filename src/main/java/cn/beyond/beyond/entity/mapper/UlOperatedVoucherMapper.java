package cn.beyond.beyond.entity.mapper;

import cn.beyond.beyond.entity.ul.UlOperatedVoucher;
import cn.beyond.beyond.entity.ul.UlOperatedVoucherExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UlOperatedVoucherMapper {
    int countByExample(UlOperatedVoucherExample example);

    int deleteByExample(UlOperatedVoucherExample example);

    int deleteByPrimaryKey(String id);

    int insert(UlOperatedVoucher record);

    int insertSelective(UlOperatedVoucher record);

    List<UlOperatedVoucher> selectByExample(UlOperatedVoucherExample example);

    UlOperatedVoucher selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") UlOperatedVoucher record, @Param("example") UlOperatedVoucherExample example);

    int updateByExample(@Param("record") UlOperatedVoucher record, @Param("example") UlOperatedVoucherExample example);

    int updateByPrimaryKeySelective(UlOperatedVoucher record);

    int updateByPrimaryKey(UlOperatedVoucher record);
}