package cn.beyond.beyond.controller.login;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.AuthorizationException;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.shiro.authz.annotation.RequiresRoles;
import org.apache.shiro.subject.Subject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.beyond.beyond.entity.auth.User;
import cn.beyond.beyond.entity.ul.UUser;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@Api(description = "登录")
public class LoginController {

	@GetMapping("/login")
	@ApiOperation(value = "user")
	public String login(String name,String password) {
		//添加用户认证信息
		Subject subject = SecurityUtils.getSubject();
		UsernamePasswordToken usernamePasswordToken = new UsernamePasswordToken(name, password);
		try {
			// 进行验证，这里可以捕获异常，然后返回对应信息
			subject.login(usernamePasswordToken);
			// 校验是否拥有该角色
			// subject.checkRole("admin");
			// subject.checkPermissions("query", "add");
		} catch (AuthenticationException e) {
			e.printStackTrace();
			return "账号或密码错误！";
		} catch (AuthorizationException e) {
			e.printStackTrace();
			return "没有权限";
		}
		return "login success";
	}

	
	//默认退出
	@GetMapping("/logout")
    public void logout(HttpServletRequest request, HttpServletResponse response) {
        HttpSession session = request.getSession();
        UUser user = (UUser) session.getAttribute(session.getId());
        SecurityUtils.getSubject().logout();
    }
	
	// 注解校验角色和权限
	@RequiresRoles("admin")
	@RequiresPermissions("add")
	@GetMapping("/index")
	public String index() {
		return "index!";
	}
}
