package cn.beyond.beyond.service.login.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.beyond.beyond.entity.mapper.UPermissionMapper;
import cn.beyond.beyond.entity.mapper.URoleMapper;
import cn.beyond.beyond.entity.mapper.UUserMapper;
import cn.beyond.beyond.entity.mapper.UUserRoleMapper;
import cn.beyond.beyond.entity.ul.UPermission;
import cn.beyond.beyond.entity.ul.URole;
import cn.beyond.beyond.entity.ul.URoleExample;
import cn.beyond.beyond.entity.ul.UUser;
import cn.beyond.beyond.entity.ul.UUserExample;
import cn.beyond.beyond.entity.ul.UUserExample.Criteria;
import cn.beyond.beyond.service.login.LoginService;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class LoginServiceImpl implements LoginService {
	
	
	@Autowired
	private UUserMapper uUserMapper;
	@Autowired
	private URoleMapper uRoleMapper;
	@Autowired
	private UPermissionMapper uPermissionMapper;
	@Override
	public List<UUser> selectByNameAndPassword(String name,String pas) {
		UUserExample uUserExample = new UUserExample();
		Criteria criteria = uUserExample.createCriteria();
		criteria.andNicknameEqualTo(name);
		criteria.andPswdEqualTo(pas);
		return uUserMapper.selectByExample(uUserExample);
	}
	
}
