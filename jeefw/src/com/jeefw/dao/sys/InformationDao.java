package com.jeefw.dao.sys;

import java.util.List;

import com.jeefw.model.sys.Information;

import core.dao.Dao;

/**
 */
public interface InformationDao extends Dao<Information> {

	void indexingInformation();

	List<Information> queryByInformationName(String name);

}
