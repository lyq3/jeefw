package com.jeefw.service.sys.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.jeefw.dao.sys.RoleDao;
import com.jeefw.model.sys.Role;
import com.jeefw.service.sys.RoleService;

import core.service.BaseService;

/**
 */
@Service
public class RoleServiceImpl extends BaseService<Role> implements RoleService {

	private RoleDao roleDao;

	@Resource
	public void setRoleDao(RoleDao roleDao) {
		this.roleDao = roleDao;
		this.dao = roleDao;
	}

}
