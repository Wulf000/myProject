package cn.beyond.beyond.taskSchclude;

import cn.beyond.beyond.taskSchclude.ScheduleTaskServiceImpl.TaskType;

/**
 * 任务调度
 */
public interface ScheduleTaskService {

    /**
     * 数据库方面
     * 添加任务
     * @param taskId
     * @param taskType
     * @param cron
     * @param task
     */
    void addTaskToScheduler(Long taskId, TaskType taskType, String cron, Runnable task);

    /**
     * 删除任务
     * @param taskId
     * @param taskType
     */
    void removeTaskFromScheduler(Long taskId, TaskType taskType);
    
    /**
     * 测试
     * @Author Wulf  
     * @return void
     * @Description TODO()
     */
    void de(String cron, Runnable task);
}
