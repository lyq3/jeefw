package com.jeefw.service.sys;

import java.util.List;

import org.springframework.security.access.prepost.PreAuthorize;

import com.jeefw.model.sys.Authority;

import core.service.Service;

/**
 */
public interface AuthorityService extends Service<Authority> {

	@PreAuthorize("hasRole('ROLE_ADMIN') or hasRole('ROLE_RESTRICTED_ADMIN') or hasRole('ROLE_USER')")
	List<Authority> queryAllMenuList(String globalRoleKey, List<Authority> mainMenuList);

}
