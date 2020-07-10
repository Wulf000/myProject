package cn.beyond.beyond.init;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;import com.alibaba.fastjson.JSONObject;

import cn.beyond.beyond.dto.req.UlcheckTaskReqDto;
import cn.beyond.beyond.entity.globalResponce.ResultPageInfo;
import cn.beyond.beyond.service.impl.CheckTaskServiceImpl;
import lombok.extern.slf4j.Slf4j;
/**
 * @Author Wulf
 * @Version 1.0
 * @Description TODO 项目启动运行程序方式2
 */
@Configuration
@Slf4j
public class TaskRunnerAgain {
	/**
	 * @Description TODO() 参数是要运行的程序类,可以执行内部方法
	 */
	@Bean
    @Order(1)
    public CommandLineRunner processApplicationSetup(final ApplicationSetup applicationSetup,CheckTaskServiceImpl ch) {
		return (args) -> {
            new Thread(new Runnable() {
    			public void run() {
    				applicationSetup.init();
    			}
    		}).start();
        };
    }
}



