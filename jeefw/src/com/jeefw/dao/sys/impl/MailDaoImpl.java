package com.jeefw.dao.sys.impl;

import org.springframework.stereotype.Repository;

import com.jeefw.dao.sys.MailDao;
import com.jeefw.model.sys.Mail;

import core.dao.BaseDao;

/**
 */
@Repository
public class MailDaoImpl extends BaseDao<Mail> implements MailDao {

	public MailDaoImpl() {
		super(Mail.class);
	}

}
