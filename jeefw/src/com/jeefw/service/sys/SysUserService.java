package com.jeefw.service.sys;

import java.util.List;

import com.jeefw.model.sys.SysUser;

import core.service.Service;

/**
 */
public interface SysUserService extends Service<SysUser> {

	List<SysUser> querySysUserCnList(List<SysUser> resultList);

	SysUser getSysUserWithAvatar(SysUser sysuser);

}
