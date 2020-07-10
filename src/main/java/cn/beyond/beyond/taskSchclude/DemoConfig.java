package cn.beyond.beyond.taskSchclude;

import java.util.List;
import java.util.Objects;

import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import lombok.extern.slf4j.Slf4j;
@Configuration
@Slf4j
public class DemoConfig {

	public CommandLineRunner initTasks(final ScheduleTaskService scheduleTaskService,ScheduleTaskServiceImpl scheduleTaskServiceImpl) {
		return (args) -> {
		scheduleTaskService.de("", new Runnable() {
			@Override
			public void run() {
				// TODO Auto-generated method stub
			}
		});
		log.info("添加到任务调度，任务名称：{}","ss");
		};
	}
}
