package cn.beyond.beyond.controller.demo;

import java.util.List;
import java.util.Map;

import org.apache.shiro.authz.annotation.RequiresRoles;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSON;

import cn.beyond.beyond.dto.req.UlcheckTaskReqDto;
import cn.beyond.beyond.entity.config.Preson;
import cn.beyond.beyond.entity.globalResponce.ResultInfo;
import cn.beyond.beyond.entity.globalResponce.ResultPageInfo;
import cn.beyond.beyond.service.CheckTaskService;
import cn.beyond.beyond.service.JsoupTask;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/demo")
@Api(description = "测试接口")
public class DemoController {
	
	@Autowired
	private CheckTaskService checkTaskService;
	
	@Autowired
	private JsoupTask jsoupTask;
	
	@Autowired
	private Preson user;

	@PostMapping("/mybatis")
	@ApiOperation("mybatis查询")
	@RequiresRoles("admin")
	public ResultPageInfo demoSelect(@RequestBody(required = false) UlcheckTaskReqDto ulcheckTaskReqDto) {
		ResultPageInfo resultPageInfo = checkTaskService.selectList(ulcheckTaskReqDto);
		return resultPageInfo;
	}
	
	
	@PostMapping("/jdbc")
	@RequiresRoles("user")
	@ApiOperation("多数据源时使用jdbcTemplate")
	public ResultInfo demoSelect2() {
		List<?> query = checkTaskService.query();
		return ResultInfo.buildSuccess(query);
	}
	
	@PostMapping("/jsoup")
	@ApiOperation("jsoup抓取数据")
	public ResultInfo jsoup() throws Exception {
		Map<String, String> loginCookie = jsoupTask.loginCookie();
		return ResultInfo.buildSuccess(loginCookie);
	}
	
	@PostMapping("/user")
	@ApiOperation("读取yml注入对象")
	public ResultInfo user() {
		return ResultInfo.buildSuccess(JSON.toJSON(user));
	}
	
}
