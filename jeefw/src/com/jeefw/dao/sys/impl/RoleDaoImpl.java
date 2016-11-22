package com.jeefw.dao.sys.impl;

import org.springframework.stereotype.Repository;

import com.jeefw.dao.sys.RoleDao;
import com.jeefw.model.sys.Role;

import core.dao.BaseDao;

/**
 */
@Repository
public class RoleDaoImpl extends BaseDao<Role> implements RoleDao {

	public RoleDaoImpl() {
		super(Role.class);
	}

}
