package cn.beyond.beyond.init;

import org.springframework.boot.CommandLineRunner;
import org.springframework.scheduling.concurrent.ThreadPoolTaskScheduler;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

/**
 * @Author Wulf
 * @Version 1.0
 * @Description TODO 项目启动运行程序方式一
 */
@Component
@Slf4j
public class TaskRunner implements CommandLineRunner{
	@Override
	public void run(String... args) throws Exception {
		ThreadPoolTaskScheduler scheduler = new ThreadPoolTaskScheduler();
        scheduler.setPoolSize(5);
        scheduler.initialize();
        scheduler.submit(new Runnable() {
			@Override
			public void run() {
				log.info("{}", "项目启动执行程序方式片段1");
			}
		});
	}

}
