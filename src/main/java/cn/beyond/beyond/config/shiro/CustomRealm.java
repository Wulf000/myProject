package cn.beyond.beyond.config.shiro;

import java.util.ArrayList;
import java.util.List;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.fastjson.JSON;

import cn.beyond.beyond.entity.auth.Permissions;
import cn.beyond.beyond.entity.auth.Role;
import cn.beyond.beyond.entity.auth.User;
import cn.beyond.beyond.entity.ul.URole;
import cn.beyond.beyond.entity.ul.UUser;
import cn.beyond.beyond.service.login.LoginService;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CustomRealm extends AuthorizingRealm{

	@Autowired
    private LoginService loginService;

	/**
	 * 权限控制
	 */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
    	Object primaryPrincipal = principalCollection.getPrimaryPrincipal();
    	log.info("{}",JSON.toJSON(primaryPrincipal));
    	//查询用户对应角色
    	SimpleAuthorizationInfo info =  new SimpleAuthorizationInfo();
    	//实际都是数据库查出来的，这里为了方便写死了
    	List<String> list2 = new ArrayList<>();
    	list2.add("添加");
    	list2.add("查询");
    		//添加角色
    		info.addRole("admin");
    		//添加权限
            info.addStringPermissions(list2);
    	return info;
    }

    
    
    /**
     * 身份认证
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        //加这一步的目的是在Post请求的时候会先进认证，然后在到请求
        if (authenticationToken.getPrincipal() == null) {
            return null;
        }
        //获取用户信息
        UsernamePasswordToken token = (UsernamePasswordToken)authenticationToken;
        String username = token.getUsername();
        String password = new String(token.getPassword());
        UUser user = null;
        List<UUser> list = loginService.selectByNameAndPassword(username, password);
        if (list.size() <= 0) {
            //这里返回后会报出对应异常
            return null;
        } else {
        	user = list.get(0);
        	String nickname = user.getNickname();
        	String pswd = user.getPswd();
            //这里验证authenticationToken和simpleAuthenticationInfo的信息
            SimpleAuthenticationInfo simpleAuthenticationInfo = new SimpleAuthenticationInfo(user, pswd, getName());
            return simpleAuthenticationInfo;
        }
    }

}
