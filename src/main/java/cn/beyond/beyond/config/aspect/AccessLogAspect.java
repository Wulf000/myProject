package cn.beyond.beyond.config.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import com.alibaba.fastjson.JSON;

import lombok.extern.slf4j.Slf4j;

/**
 * 访问日志切面
 * 执行顺序
 * 环绕通知 前置通知 退出环绕通知 后置通知 最终通知
 */
@Aspect
@Component
@Slf4j
public class AccessLogAspect {

	/**
	 * 切点位置
	 */
	@Pointcut("execution(public * cn.beyond.beyond.controller.demo.DemoController.*(..))")
	public void queryPoint() {
	}
	@Pointcut("execution(public * cn.beyond.beyond.controller.demo.DemoController.*(..))")
	public void aroundQueryPoint() {
	}
	
	/**
	 * @Author Wulf  
	 * @return void
	 * @Description TODO(前置通知)
	 */
	@Before(value = "queryPoint()")
	public void beforeQuery(JoinPoint joinPoint) {
		String methodName = joinPoint.getSignature().getName();//方法名称
		Object[] args = joinPoint.getArgs();//请求参数
		//程序运行后执行操作
		log.info("前置通知");
	}
	
	/**
	 * @Author Wulf  
	 * @return void
	 * @Description TODO(后置通知)
	 */
	@AfterReturning(pointcut = "queryPoint()", returning = "result")
	public void afterQuery(JoinPoint joinPoint, Object result) {
		Object[] args = joinPoint.getArgs();
		//程序运行后执行操作
		log.info("后置通知");
	}

	/**
	 * @Author Wulf
	 * @return Object
	 * @Description TODO(循环通知)
	 */
	@Around("aroundQueryPoint()")
	public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
		
		log.info("循环通知前");
		//获取切面方法所有参数
		Object[] args = joinPoint.getArgs();
		log.info("方法参数: {}",JSON.toJSON(args));
		Object proceed = null;
		Boolean hasKey = true;
		if (hasKey) {
			//执行原方法
			proceed = joinPoint.proceed();
		} else {
			//执行其他或者不执行
			proceed = "执行其他";
		}
		log.info("循环通知后");
		//执行某些操作之后再通知
		return proceed;
	}

}
