package cn.beyond.beyond.taskSchclude;


import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ScheduledFuture;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.TaskScheduler;
import org.springframework.scheduling.support.CronTrigger;
import org.springframework.stereotype.Service;


@Service
public class ScheduleTaskServiceImpl implements ScheduleTaskService {

    @Autowired
    private TaskScheduler taskScheduler;

    /**
     * 数据库任务
     */
    private Map<Long, ScheduledFuture<?>> jobsMap = new ConcurrentHashMap<>();
    /**
     * 互联网抓取任务
     */
    private Map<Long, ScheduledFuture<?>> internetJobsMap = new ConcurrentHashMap<>();

    public enum TaskType {
        db,//数据库
        internet//网络爬虫
    }


    /**
     * 添加任务
     *
     * @param taskId
     * @param cron
     * @param task
     */
    public void addTaskToScheduler(Long taskId, TaskType taskType, String cron, Runnable task) {
        // 判断是否有任务,如果有先删除
        this.removeTaskFromScheduler(taskId, taskType);
        ScheduledFuture<?> scheduledFuture = taskScheduler.schedule(task, new CronTrigger(cron, TimeZone.getTimeZone(TimeZone.getDefault().getID())));
        if (TaskType.db.equals(taskType)) {
            jobsMap.put(taskId, scheduledFuture);
        } else if (TaskType.internet.equals(taskType)) {
            internetJobsMap.put(taskId, scheduledFuture);
        }
    }

    /**
     * 删除任务
     *
     * @param taskId
     */
    public void removeTaskFromScheduler(Long taskId, TaskType taskType) {
        ScheduledFuture<?> scheduledFuture = null;
        if (TaskType.db.equals(taskType)) {
            scheduledFuture = jobsMap.get(taskId);
        } else if (TaskType.internet.equals(taskType)) {
            scheduledFuture = internetJobsMap.get(taskId);
        }
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
            //从缓存中删除
            if (TaskType.db.equals(taskType)) {
                jobsMap.remove(taskId);
            } else if (TaskType.internet.equals(taskType)) {
                jobsMap.remove(taskId);
            }

        }
    }

	@Override
	public void de(String cron, Runnable task) {
		// TODO Auto-generated method stub
		ScheduledFuture<?> scheduledFuture = taskScheduler.schedule(task, new CronTrigger(cron, TimeZone.getTimeZone(TimeZone.getDefault().getID())));
	}

}
