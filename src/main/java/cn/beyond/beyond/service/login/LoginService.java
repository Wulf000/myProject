package cn.beyond.beyond.service.login;

import java.util.List;

import cn.beyond.beyond.entity.ul.UPermission;
import cn.beyond.beyond.entity.ul.URole;
import cn.beyond.beyond.entity.ul.UUser;

public interface LoginService {
	
	List<UUser> selectByNameAndPassword(String name,String pas);
	
}
