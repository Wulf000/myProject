package cn.beyond.beyond.service;

import java.util.List;

import cn.beyond.beyond.dto.req.UlcheckTaskReqDto;
import cn.beyond.beyond.entity.globalResponce.ResultInfo;
import cn.beyond.beyond.entity.globalResponce.ResultPageInfo;

public interface CheckTaskService {

	ResultPageInfo selectList(UlcheckTaskReqDto ulcheckTaskReqDto);
	
	List<?> query();
}
