package cn.beyond.beyond.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;

import cn.beyond.beyond.dto.req.UlcheckTaskReqDto;
import cn.beyond.beyond.entity.globalResponce.ResultPageInfo;
import cn.beyond.beyond.entity.mapper.UlCheckTaskMapper;
import cn.beyond.beyond.entity.ul.UlCheckTask;
import cn.beyond.beyond.entity.ul.UlCheckTaskExample;
import cn.beyond.beyond.entity.ul.UlCheckTaskExample.Criteria;
import cn.beyond.beyond.service.CheckTaskService;
import cn.beyond.beyond.taskSchclude.RunTask;
import cn.beyond.beyond.taskSchclude.ScheduleTaskService;

/**
 * @Date 2020年6月30日
 * @Version 1.0
 * @Description TODO 
 */
@Service
public class CheckTaskServiceImpl implements CheckTaskService{

	@Autowired
	private UlCheckTaskMapper ulCheckTaskMapper;
	
	@Autowired
	private StringRedisTemplate redisTemplate;
	
	@Autowired
	private ScheduleTaskService scheduleTaskService;
	
	@Resource(name = "secondNamedParameterJdbcTemplate")
	private NamedParameterJdbcTemplate secondNamedParameterJdbcTemplate;
	@Override
	public ResultPageInfo selectList(UlcheckTaskReqDto ulcheckTaskReqDto) {
		int pageIndex = ulcheckTaskReqDto.getPageIndex();
		int pageSize = ulcheckTaskReqDto.getPageSize();
		Page page = PageHelper.startPage(pageIndex,pageSize);
		UlCheckTaskExample ulCheckTaskExample = new UlCheckTaskExample();
		Criteria createCriteria = ulCheckTaskExample.createCriteria();
		if (StringUtils.isNotBlank(ulcheckTaskReqDto.getId())) {
			createCriteria.andIdEqualTo(ulcheckTaskReqDto.getId());
		}
		List<UlCheckTask> list = ulCheckTaskMapper.selectByExample(ulCheckTaskExample);
		ResultPageInfo success = ResultPageInfo.buildSuccess(page.getPageNum(), page.getPageSize(), page.getTotal(), list);
		RunTask runTask = new RunTask();
		scheduleTaskService.de("0 57 9 * * ?", runTask);
		
		return success;
	}


	@Override
	public List<?> query() {
		String sql = "select * from ul_check_task ";
		Map<String,Object> map = new HashMap<>();
		List<Map<String,Object>> queryForList = secondNamedParameterJdbcTemplate.queryForList(sql, map);
		return queryForList;
	}
}
