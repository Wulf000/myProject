package cn.beyond.beyond.config.shiro;

import org.apache.shiro.authz.AuthorizationException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import lombok.extern.slf4j.Slf4j;

/**
 * @Author Wulf
 * @Version 1.0
 * @Description TODO 异常处理
 */
@ControllerAdvice
@Slf4j
public class MyExceptionHandler {

	@ExceptionHandler
    @ResponseBody
    public String ErrorHandler(AuthorizationException e) {
        log.error("没有权限！", e);
        return "没有权限！";
    }
}
