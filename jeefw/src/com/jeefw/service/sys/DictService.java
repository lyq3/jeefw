package com.jeefw.service.sys;

import java.util.List;

import com.jeefw.model.sys.Dict;

import core.service.Service;

/**
 */
public interface DictService extends Service<Dict> {

	List<Dict> queryDictWithSubList(List<Dict> resultList);

}
