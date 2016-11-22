package com.jeefw.service.sys;

import java.util.List;

import com.jeefw.model.sys.Department;

import core.service.Service;

/**
 */
public interface DepartmentService extends Service<Department> {

	List<Department> queryDepartmentCnList(List<Department> resultList);

}
